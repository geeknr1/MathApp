package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.grade5.Algebra.chapter1;

import java.util.Arrays;

import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Quiz1{
    private static Stage primaryStage;
    private static Quiz quiz1 = new Quiz();

    public void generateQuestions(Stage stage){
        quiz1.addQuizMultipleChoice("Type the following roman numbers in arabic digits: LXII, CLXV, CLXIII, XXXIII and CCCLXXXVII", Arrays.asList(new Pair("62, 163, 63, 25, 300", false), 
                                                                                                                                    new Pair("41, 165, 163, 33, 300", false),
                                                                                                                                    new Pair("62, 165, 163, 33, 387", true),
                                                                                                                                    new Pair("63, 50, 163, 35, 1554", false)));
        
        quiz1.addQuizMultipleChoice("What is the smallest 4-digit natural number for which the digit sum is equal to the product of its digits?", Arrays.asList(new Pair("2134", false),
                                                                                                                                                  new Pair("1124", true),
                                                                                                                                                  new Pair("1421", false),
                                                                                                                                                  new Pair("1685", false)));
                                                                                                                                                 

        quiz1.addQuizMultipleChoice("How many 2-digit natural numbers can be written using only even digits?", Arrays.asList(new Pair("45", true),
                                                                                                               new Pair("55", false),
                                                                                                               new Pair("60", false),
                                                                                                               new Pair("100", false)));

        quiz1.addQuizMultipleChoice("Write all the 4-digit numbers using just the digits '0' and '3'. Find their sum afterwards.",  Arrays.asList(new Pair("20000", false),
                                                                                                                                   new Pair("2505", false),
                                                                                                                                   new Pair("45000", false),
                                                                                                                                   new Pair("25332", true)));

        quiz1.addQuizSingleChoice("What's the smallest 4-digit natural number, knowing the digits are distinct?", "1023");
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        generateQuestions(stage);
        VBox root = quiz1.generateQuiz(primaryStage);

        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showAlgebra5thCh1Lesson1();
        });

        root.getChildren().add(back);

        
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
        Scene quizScene = new Scene(newRoot, 800, 600);
        quizScene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return quizScene;
    }
}