package com.mathapp.grade5.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter6UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Transformations '");
        Button buttonLesson1 = new Button("Transformations");
        Label labelLesson2 = new Label("Let's learn more about ' Approximates '");
        Button buttonLesson2 = new Button("Subtraction of natural numbers");
        Label labelLesson3 = new Label("Let's learn more about ' Comparison, ordering and placement on the axis '");
        Button buttonLesson3 = new Button("Comparison, ordering and placement on the axis");

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