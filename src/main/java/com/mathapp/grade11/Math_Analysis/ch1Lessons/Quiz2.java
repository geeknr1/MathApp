package com.mathapp.grade11.Math_Analysis.ch1Lessons;

import com.mathapp.grade11.Math_Analysis.chapter1;
import com.mathapp.Quiz;
import com.mathapp.Pair;

import java.util.Arrays;

import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Quiz2{
    private static Stage primaryStage;
    private static Quiz quiz2 = new Quiz();

    public void generateQuestions(Stage stage){
        quiz2.addQuizMultipleChoice("What is the result of calculating the limit of the following sequence: a_{n} = (4*n+2)/(5^n), n≥1", Arrays.asList(new Pair("0", true), 
                                                                                                                                    new Pair("1", false),
                                                                                                                                    new Pair("4/5", false),
                                                                                                                                    new Pair("e", false)));

        quiz2.addQuizSingleChoice("The sequence defined by x_{1} = 3, 2*x_{n+1} = x_{n} - 2, n≥1 has its limit equal to: ", "-2");
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        generateQuestions(stage);
        VBox root = quiz2.generateQuiz(primaryStage);

        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showMA5thCh1Lesson2();
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