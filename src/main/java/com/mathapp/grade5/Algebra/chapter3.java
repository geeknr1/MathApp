package com.mathapp.grade5.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Unit reduction method '");
        Button buttonLesson1 = new Button("Unit reduction method");
        Label labelLesson2 = new Label("Let's learn more about the ' Comparison method '");
        Button buttonLesson2 = new Button("Comparison method");
        Label labelLesson3 = new Label("Let's learn more about the ' Figurative method '");
        Button buttonLesson3 = new Button("Figurative method");
        Label labelLesson4 = new Label("Let's learn more about the ' Backtracking method '");
        Button buttonLesson4 = new Button("Backtracking method");
        Label labelLesson5 = new Label("Let's learn more about ' False hypothesis method '");
        Button buttonLesson5 = new Button("False hypothesis method");
        Label labelLesson6 = new Label("Let's learn more about the ' Algebraic method '");
        Button buttonLesson6 = new Button("Algebraic method");

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

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6
                                  );

        return root;
    }
}