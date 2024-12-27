package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Powers and Radicals. Properties '");
        Button buttonLesson1 = new Button("Powers and Radicals. Properties");
        Label labelLesson2 = new Label("Let's learn more about the ' Powers with Rational and Real Exponents. Properties. '");
        Button buttonLesson2 = new Button("Powers with Rational and Real Exponents. Properties.");
        Label labelLesson3 = new Label("Let's learn more about the ' Logarithm of a Positive Real Number. Properties '");
        Button buttonLesson3 = new Button("Logarithm of a Positive Real Number. Properties");
        
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