package com.mathapp.grade11.Math_Analysis.ch1Lessons;

import java.util.Arrays;

import com.mathapp.Pair;
import com.mathapp.Quiz;
import com.mathapp.grade11.Math_Analysis.chapter1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz3{
    private static Stage primaryStage;
    private static Quiz quiz3 = new Quiz();

    public void generateQuestions(){
        quiz3.addQuizMultipleChoice("Here we have the sequence a_{n} = (n+2)/(n+1), n≥1. Select the affirmations which are correct.", Arrays.asList(new Pair("the sequence is strictly increasing", false), 
                                                                                                                                    new Pair("the sequence is strictly decreasing", true),
                                                                                                                                    new Pair("the sequence is divergent", false),
                                                                                                                                    new Pair("the sequence has limit 1", true)));
        
        quiz3.addQuizMultipleChoice("The limit of the following sequence a_{n} = n^2 * sin(2π/n) * ln((π + n)/n), n≥1 is equal with:", Arrays.asList(new Pair("π", false),
                                                                                                                                                  new Pair("π^2", false),
                                                                                                                                                  new Pair("2π", false),
                                                                                                                                                  new Pair("2π^2", true)));
                                                                                                                                                 
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        generateQuestions();
        VBox root = quiz3.generateQuiz(primaryStage);

        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showMA5thCh1Lesson3();
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