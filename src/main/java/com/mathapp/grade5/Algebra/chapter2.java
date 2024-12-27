package com.mathapp.grade5.Algebra;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Addition of natural numbers '");
        Button buttonLesson1 = new Button("Addition of natural numbers");
        Label labelLesson2 = new Label("Let's learn more about the ' Subtraction of natural numbers '");
        Button buttonLesson2 = new Button("Subtraction of natural numbers");
        Label labelLesson3 = new Label("Let's learn more about the ' Multiplication of natural numbers '");
        Button buttonLesson3 = new Button("Multiplication of natural numbers");
        Label labelLesson4 = new Label("Let's learn more about the ' Common factor '");
        Button buttonLesson4 = new Button("Common factor");
        Label labelLesson5 = new Label("Let's learn more about ' Raising a natural number to a power with a natural number exponent '");
        Button buttonLesson5 = new Button("Raising a natural number to a power with a natural number exponent");
        Label labelLesson6 = new Label("Let's learn more about the ' Rules for calculating with powers '");
        Button buttonLesson6 = new Button("Rules for calculating with powers");
        Label labelLesson7 = new Label("Let's learn more about the ' Comparison of powers '");
        Button buttonLesson7 = new Button("Comparison of powers");
        Label labelLesson8 = new Label("Let's learn more about the ' Last digit of the power of a natural number '");
        Button buttonLesson8 = new Button("Last digit of the power of a natural number");
        Label labelLesson9 = new Label("Let's learn more about the ' Division of natural numbers with remainder zero '");
        Button buttonLesson9 = new Button("Division of natural numbers with remainder zero");
        Label labelLesson10 = new Label("Let's learn more about the ' Division of natural numbers with remainder '");
        Button buttonLesson10 = new Button("Division of natural numbers with remainder");
        Label labelLesson11 = new Label("Let's learn more about the ' Order of operations - without raising to a power '");
        Button buttonLesson11 = new Button("Order of operations - without raising to a power");
        Label labelLesson12 = new Label("Let's learn more about the ' Order of operations - with raising to a power - with reduced difficulty '");
        Button buttonLesson12 = new Button("Order of operations - with raising to a power - with reduced difficulty");
        Label labelLesson13 = new Label("Let's learn more about the ' Order of operations - with raising to a power '");
        Button buttonLesson13 = new Button("Order of operations - with raising to a power");
        Label labelLesson14 = new Label("Let's learn more about the ' Writing in base 10. Writing in base 2 '");
        Button buttonLesson14 = new Button("Writing in base 10. Writing in base 2");
        Label labelLesson15 = new Label("Let's learn more about the ' Arithmetic mean of two natural numbers with a natural number result '");
        Button buttonLesson15 = new Button("Arithmetic mean of two natural numbers with a natural number result");

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

        buttonLesson8.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson9.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson10.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson11.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson12.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson13.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson14.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson15.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10, labelLesson11, buttonLesson11, labelLesson12, 
                                  buttonLesson12, labelLesson13, buttonLesson13, labelLesson14, buttonLesson14,
                                  labelLesson15, buttonLesson15);

        return root;
    }
}