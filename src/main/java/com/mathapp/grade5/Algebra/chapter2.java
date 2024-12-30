package com.mathapp.grade5.Algebra;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class chapter2{
    private static Stage primaryStage;

    public Scene getChapter2UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Addition of natural numbers '");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Addition of natural numbers");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Subtraction of natural numbers '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Subtraction of natural numbers");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the ' Multiplication of natural numbers '");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Multiplication of natural numbers");
        buttonLesson3.getStyleClass().add("button");
        Label labelLesson4 = new Label("Let's learn more about the ' Common factor '");
        labelLesson4.getStyleClass().add("label");
        Button buttonLesson4 = new Button("Common factor");
        buttonLesson4.getStyleClass().add("button");
        Label labelLesson5 = new Label("Let's learn more about ' Raising a natural number to a power with a \nnatural number exponent '");
        labelLesson5.getStyleClass().add("label");
        Button buttonLesson5 = new Button("Raising a natural number to a power with a natural number exponent");
        buttonLesson5.getStyleClass().add("button");
        Label labelLesson6 = new Label("Let's learn more about the ' Rules for calculating with powers '");
        labelLesson6.getStyleClass().add("label");
        Button buttonLesson6 = new Button("Rules for calculating with powers");
        buttonLesson6.getStyleClass().add("button");
        Label labelLesson7 = new Label("Let's learn more about the ' Comparison of powers '");
        labelLesson7.getStyleClass().add("label");
        Button buttonLesson7 = new Button("Comparison of powers");
        buttonLesson7.getStyleClass().add("button");
        Label labelLesson8 = new Label("Let's learn more about the ' Last digit of the power of a natural number '");
        labelLesson8.getStyleClass().add("label");
        Button buttonLesson8 = new Button("Last digit of the power of a natural number");
        buttonLesson8.getStyleClass().add("button");
        Label labelLesson9 = new Label("Let's learn more about the ' Division of natural numbers with remainder \nzero '");
        labelLesson9.getStyleClass().add("label");
        Button buttonLesson9 = new Button("Division of natural numbers with remainder zero");
        buttonLesson9.getStyleClass().add("button");
        Label labelLesson10 = new Label("Let's learn more about the ' Division of natural numbers with remainder '");
        labelLesson10.getStyleClass().add("label");
        Button buttonLesson10 = new Button("Division of natural numbers with remainder");
        buttonLesson10.getStyleClass().add("button");
        Label labelLesson11 = new Label("Let's learn more about the ' Order of operations - without raising to a power '");
        labelLesson11.getStyleClass().add("label");
        Button buttonLesson11 = new Button("Order of operations - without raising to a power");
        buttonLesson11.getStyleClass().add("button");
        Label labelLesson12 = new Label("Let's learn more about the ' Order of operations \n- with raising to a power \n- with reduced difficulty '");
        labelLesson12.getStyleClass().add("label");
        Button buttonLesson12 = new Button("Order of operations - with raising to a power - with reduced difficulty");
        buttonLesson12.getStyleClass().add("button");
        Label labelLesson13 = new Label("Let's learn more about the ' Order of operations - with raising to a power '");
        labelLesson13.getStyleClass().add("label");
        Button buttonLesson13 = new Button("Order of operations - with raising to a power");
        buttonLesson13.getStyleClass().add("button");
        Label labelLesson14 = new Label("Let's learn more about the ' Writing in base 10. Writing in base 2 '");
        labelLesson14.getStyleClass().add("label");
        Button buttonLesson14 = new Button("Writing in base 10. Writing in base 2");
        buttonLesson14.getStyleClass().add("button");
        Label labelLesson15 = new Label("Let's learn more about the ' Arithmetic mean of two natural numbers with a natural number result '");
        labelLesson15.getStyleClass().add("label");
        Button buttonLesson15 = new Button("Arithmetic mean of two natural numbers with a natural number result");
        buttonLesson15.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

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

        back.setOnAction(event->{
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10, labelLesson11, buttonLesson11, labelLesson12, 
                                  buttonLesson12, labelLesson13, buttonLesson13, labelLesson14, buttonLesson14,
                                  labelLesson15, buttonLesson15, back);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(800);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(800);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        VBox newRoot = new VBox(contentPane);
        Scene scene = new Scene(newRoot, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}