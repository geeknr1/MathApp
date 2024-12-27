package com.mathapp.grade7.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Addition and Subtraction '");
        Button buttonLesson1 = new Button("Addition and Subtraction");
        Label labelLesson2 = new Label("Let's learn more about ' Multiplication '");
        Button buttonLesson2 = new Button("Multiplication");
        Label labelLesson3 = new Label("Let's learn more about ' Division '");
        Button buttonLesson3 = new Button("Division");
        Label labelLesson4 = new Label("Let's learn more about the ' Raising of powers '");
        Button buttonLesson4 = new Button("Raising of powers");
        Label labelLesson5 = new Label("Let's learn more about ' Rationalizing the Denominator '");
        Button buttonLesson5 = new Button("Rationalizing the Denominator");
        Label labelLesson6 = new Label("Let's learn more about the ' Weighted and Geometric Means '");
        Button buttonLesson6 = new Button("Weighted and Geometric Means");
        Label labelLesson7 = new Label("Let's learn more about the ' Equation x^2 = a '");
        Button buttonLesson7 = new Button("Equation x^2 = a");

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

        buttonLesson7.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7);

        return root;
    }
}