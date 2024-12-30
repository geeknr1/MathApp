package com.mathapp.grade7.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIalgebra7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Square root of a perfect square natural number '");
        Button buttonLesson1 = new Button("Square root of a perfect square natural number");
        Label labelLesson2 = new Label("Let's learn more about the 'Square root of a non-negative rational number' and 'Estimates'");
        Button buttonLesson2 = new Button("Square root of a non-negative rational number. Estimates");
        Label labelLesson3 = new Label("Let's learn more about the 'Irrational number' ; 'Sets of numbers' and the 'Relations between sets of numbers'");
        Button buttonLesson3 = new Button("Irrational number. Sets of numbers. Relations between sets of numbers");
        Label labelLesson4 = new Label("Let's learn more about the 'Factoring out the radical' and 'Factoring in the radical'");
        Button buttonLesson4 = new Button("Factoring out the radical. Factoring in the radical");
        Label labelLesson5 = new Label("Let's learn more about 'Approximates' ; 'Comparison' and 'Modulus'");
        Button buttonLesson5 = new Button("Approximates. Comparison. Modulus.");

        Button back = new Button("Back");
        
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

        back.setOnAction(event->{
            MathApp.show7thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, back);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(580);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        return new VBox(contentPane);
    }
}