package com.mathapp.grade5.Algebra;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Writing and reading natural numbers in the decimal number system '");
        Button buttonLesson1 = new Button("Writing and reading natural numbers in the decimal number system");
        Label labelLesson2 = new Label("Let's learn more about ' The sequence of natural numbers. Representing natural numbers on the number line '");
        Button buttonLesson2 = new Button("The sequence of natural numbers. Representing natural numbers on the number line");
        Label labelLesson3 = new Label("Let's learn more about ' Comparing and ordering natural numbers '");
        Button buttonLesson3 = new Button("Comparing and ordering natural numbers");
        Label labelLesson4 = new Label("Let's learn more about ' Approximating natural numbers. Rounding '");
        Button buttonLesson4 = new Button("Approximating natural numbers. Rounding");

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