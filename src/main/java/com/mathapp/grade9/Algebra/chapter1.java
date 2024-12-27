package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Operations with real numbers '");
        Button buttonLesson1 = new Button("Operations with real numbers");
        Label labelLesson2 = new Label("Let's learn more about 'Comparing and ordering real numbers' and 'Approximations'");
        Button buttonLesson2 = new Button("Comparing and ordering real numbers. Approximations.");
        Label labelLesson3 = new Label("Let's learn more about the 'Modulus of a real number' and do some 'Equations and inequalities'");
        Button buttonLesson3 = new Button("Modulus of a real number. Equations and inequalities");
        Label labelLesson4 = new Label("Let's learn more about the 'Integer and fractional part of a real number' and do some 'Equations'");
        Button buttonLesson4 = new Button("Integer and fractional part of a real number. Equations");
        Label labelLesson5 = new Label("Let's learn more about ' Operations with intervals of real numbers '");
        Button buttonLesson5 = new Button("Operations with intervals of real numbers");
        
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5);

        return root;
    }
}