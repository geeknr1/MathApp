package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra10Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Injective, surjective, bijective functions '");
        Button buttonLesson1 = new Button("Injective, surjective, bijective functions");
        Label labelLesson2 = new Label("Let's learn more about the 'Invertible functions' and the 'Inverse of a function'");
        Button buttonLesson2 = new Button("Invertible functions. Inverse of a function");
        Label labelLesson3 = new Label("Let's learn more about the 'Power function with natural exponent' and the 'Radical function'");
        Button buttonLesson3 = new Button("Power function with natural exponent. Radical function");
        Label labelLesson4 = new Label("Let's learn more about the 'Exponential function' and the 'Logarithmic function'");
        Button buttonLesson4 = new Button("Exponential function. Logarithmic function");
        Label labelLesson5 = new Label("Let's learn more about ' Inverse trigonometric functions '");
        Button buttonLesson5 = new Button("Inverse trigonometric functions");

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
            MathApp.show10thGradeAlgebra();
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