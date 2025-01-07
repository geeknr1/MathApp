package com.mathapp.grade11.Math_Analysis.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson1{
    private static Stage primaryStage;

    public Scene getLesson1UIch1Grade11MA(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        A set of points on the real line is a collection of real numbers, typically denoted by subsets of R. 
        These sets can include isolated points, intervals, or more complex structures. Sets are categorized as finite, countable, or uncountable. 
        Common examples include open, closed, or half-open intervals.

        An interval is a contiguous subset of the real line. It can be classified into the following types:
            1)  Open interval (a,b): Contains all points x such that a<x<b, excluding a and b.
            2)  Closed interval [a,b]: Includes all points x such that a≤x≤b, including a and b.
            3)  Half-open intervals (a,b] or [a,b): Mix inclusion and exclusion of endpoints.
            4)  Infinite intervals: (−∞,b),(a,∞), or (−∞,∞)

        A neighborhood of a point x_{0}∈R is a set of points surrounding x0 where the point x_{0 }is at the center. It is typically an open interval (x_{0}-ε,x_{0}+ε), where 
        ε>0 is a small positive number. 
        Neighborhoods are used to define limits, continuity, and differentiability.

        A deleted neighborhood excludes the central point x 0, written as (x0-ε,x0+ε)-{x0}.
    """);

        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            Quiz1 quiz1UI = new Quiz1();
            Scene quiz1Scene = quiz1UI.getQuizUI(stage);
            primaryStage.setScene(quiz1Scene);
        });

        back.setOnAction(event->{
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(theoryLabel, practiceButton, back);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(850);

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