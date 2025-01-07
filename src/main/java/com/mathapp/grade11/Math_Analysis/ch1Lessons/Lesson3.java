package com.mathapp.grade11.Math_Analysis.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson3{
    private static Stage primaryStage;

    public Scene getLesson3UIch1Grade11MA(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        The limit of a sequence {a_{n}} describes the value L that the terms of the sequence approach as n→∞
        Formally:lim n→∞ a_{n} = L if for every 𝜀>0,there exists N∈N such that |a_{n}-L|<𝜀 for all n≥N.
            1) If such an L exists, the sequence is convergent
            2) If there's no such L, the sequence is divergent

        Indeterminate forms arise when the result of a limit cannot be directly determined without further analysis
        Here are some of the common cases:
            1) 0/0 ; ∞/∞ = simplification or L'Hôpital's Rule is necessary
            2) 0*∞ = rewriting the product into a fraction to analyze the behavior of each term
            3) ∞-∞ = simplification or limits of individual terms are necessary
            4) 0^0, ∞^0, 1^∞ = logarithmic transformations or advanced techniques for resolution are necessary

            Indeterminate forms often involve deeper analysis to determine the true limit, using methods like substitution, factorization, or series expansion.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            Quiz3 quiz3UI = new Quiz3();
            Scene quiz3Scene = quiz3UI.getQuizUI(stage);
            primaryStage.setScene(quiz3Scene);
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