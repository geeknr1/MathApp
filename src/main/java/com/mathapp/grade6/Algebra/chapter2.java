package com.mathapp.grade6.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Divisor' and 'Multiple'");
        Button buttonLesson1 = new Button("Divisor & Multiple");
        Label labelLesson2 = new Label("Let's learn more about the ' Criteria for divisibility by 2, 3, 5, 9 and 10 '");
        Button buttonLesson2 = new Button("Criteria for divisibility by 2, 3, 5, 9 and 10");
        Label labelLesson3 = new Label("Let's learn more about ' Prime and composite numbers '");
        Button buttonLesson3 = new Button("Prime and composite numbers");
        Label labelLesson4 = new Label("Let's learn more about the ' Decomposition of natural numbers into products of powers of prime numbers '");
        Button buttonLesson4 = new Button("Decomposition of natural numbers into products of powers of prime numbers");
        Label labelLesson5 = new Label("Let's learn more about the ' Greatest common divisor '");
        Button buttonLesson5 = new Button("Greatest common divisor");
        Label labelLesson6 = new Label("Let's learn more about the ' Least common multiple '");
        Button buttonLesson6 = new Button("Least common multiple");
        Label labelLesson7 = new Label("Let's learn more about the 'Properties of divisibility' and 'Problems that can be solved using divisibility'");
        Button buttonLesson7 = new Button("Properties of divisibility. Problems that can be solved using divisibility");

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