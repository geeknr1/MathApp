package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Elements in a circle, angle at the center '");
        Button buttonLesson1 = new Button("Elements in a circle, angle at the center");
        Label labelLesson2 = new Label("Let's learn more about the ' Relative positions of a line to a circle '");
        Button buttonLesson2 = new Button("Relative positions of a line to a circle");
        Label labelLesson3 = new Label("Let's learn more about the ' Relative positions of two circles '");
        Button buttonLesson3 = new Button("Relative positions of two circles");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3);

        return root;
    }
}