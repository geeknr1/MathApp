package com.mathapp.grade10.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIgeometry10Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Trigonometric Functions '");
        Button buttonLesson1 = new Button("Trigonometric Functions");
        Label labelLesson2 = new Label("Let's learn more about the ' Inverse Trigonometric Functions '");
        Button buttonLesson2 = new Button("Inverse Trigonometric Functions");
        Label labelLesson3 = new Label("Let's learn more about the ' Trigonometric Equations '");
        Button buttonLesson3 = new Button("Trigonometric Equations");
        
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