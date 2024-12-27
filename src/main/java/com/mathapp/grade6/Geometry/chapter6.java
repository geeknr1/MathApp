package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Bisector of a triangle '");
        Button buttonLesson1 = new Button("Bisector");
        Label labelLesson2 = new Label("Let's learn more about the ' Mediator of a triangle '");
        Button buttonLesson2 = new Button("Mediator");
        Label labelLesson3 = new Label("Let's learn more about the ' Height of a triangle '");
        Button buttonLesson3 = new Button("Height");
        Label labelLesson4 = new Label("Let's learn more about the ' Median of a triangle '");
        Button buttonLesson4 = new Button("Median");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4);

        return root;
    }
}