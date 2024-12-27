package com.mathapp.grade8.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Addition' and 'Subtraction'");
        Button buttonLesson1 = new Button("Addition and Subtraction");
        Label labelLesson2 = new Label("Let's learn more about the ' Multiplication '");
        Button buttonLesson2 = new Button("Multiplication");
        Label labelLesson3 = new Label("Let's learn more about the ' Division'");
        Button buttonLesson3 = new Button("Division");
        Label labelLesson4 = new Label("Let's learn more about the ' Raising to Powers '");
        Button buttonLesson4 = new Button("Raising to Powers");
        Label labelLesson5 = new Label("Let's learn more about the 'Order of Operations' and 'Use of Parentheses'");
        Button buttonLesson5 = new Button("Order of Operations and Use of Parentheses");
        Label labelLesson6 = new Label("Let's learn more about the ' Abbreviated Calculation Formulas '");
        Button buttonLesson6 = new Button("Abbreviated Calculation Formulas");
        Label labelLesson7 = new Label("Let's do some ' Numerical Applications to Formulas '");
        Button buttonLesson7 = new Button("Numerical Applications to Formulas");
        Label labelLesson8 = new Label("Let's learn more about the ' Factoring Methods - Common Factor Method '");
        Button buttonLesson8 = new Button("Factoring Methods - Common Factor Method");
        Label labelLesson9 = new Label("Let's learn more about the ' Factoring Methods - Abbreviated Calculation Formulas '");
        Button buttonLesson9 = new Button("Factoring Methods - Abbreviated Calculation Formulas");
        Label labelLesson10 = new Label("Let's learn more about the ' Factoring Methods - Grouping Terms and Combination Methods '");
        Button buttonLesson10 = new Button("Factoring Methods - Grouping Terms and Combination Methods");
        Label labelLesson11 = new Label("Let's learn more about the ' Real Number Ratios Represented by Letters '");
        Button buttonLesson11 = new Button("Real Number Ratios Represented by Letters");
        Label labelLesson12 = new Label("Let's learn more about the ' Second Degree Equation '");
        Button buttonLesson12 = new Button("Second Degree Equation");

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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10, labelLesson11, buttonLesson11, labelLesson12, 
                                  buttonLesson12);

        return root;
    }
}