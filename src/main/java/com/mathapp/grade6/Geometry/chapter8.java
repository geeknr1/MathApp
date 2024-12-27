package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter8{
    private static Stage primaryStage;

    public VBox getChapter8UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Isosceles triangle '");
        Button buttonLesson1 = new Button("Isosceles triangle");
        Label labelLesson2 = new Label("Let's learn more about the ' Equilateral triangle '");
        Button buttonLesson2 = new Button("Equilateral triangle");
        Label labelLesson3 = new Label("Let's learn more about the ' Right triangle '");
        Button buttonLesson3 = new Button("Right triangle");

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