package com.mathapp.grade11.Math_Analysis.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson2{
    private static Stage primaryStage;

    public Scene getLesson2UIch1Grade11MA(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        A monotone sequence is a sequence of real numbers {a_{n}} that has a consistent direction of change. It can be classified as:
            1)  Monotonically increasing: a_{n} ≤ a_{n+1} for all n.
            2)  Monotonically decreasing: a_{n} ≥ a_{n+1} for all n.
            3)  Strictly increasing/decreasing: The inequality is strict (< or >).
        Monotone sequences are important in analysis because they exhibit predictable behavior and are often easier to study.

        A bounded sequence {a_{n}} is one that stays within fixed limits. Specifically:
            1)  Bounded above: There exists a real number M such that a_{n} ≤ M for all n.
            2)  Bounded below: There exists a real number m such that a_{n} ≥ m for all n.
            3)  Bounded: The sequence is both bounded above and below, meaning m ≤ a_{n} ≤ M for all n.
        Boundedness is a key property used in the study of convergence.

        A convergent sequence {a_{n}} approaches a specific real number L (the limit) as n→∞. 
        Formally:lim n→∞ a_{n} = L if for every 𝜀>0,there exists N∈N such that |a_{n}-L|<𝜀 for all n≥N.
        Convergence implies the sequence becomes arbitrarily close to L after a certain point. Every convergent sequence is bounded, 
        but not every bounded sequence converges.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            Quiz2 quiz2UI = new Quiz2();
            Scene quiz2Scene = quiz2UI.getQuizUI(stage);
            primaryStage.setScene(quiz2Scene);
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