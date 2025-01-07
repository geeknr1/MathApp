package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.grade5.Algebra.chapter1;
import com.mathapp.Quiz;
import com.mathapp.Pair;

import java.util.Arrays;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;

public class Quiz4{
    private static Stage primaryStage;
    private static Quiz quiz4 = new Quiz();

    public void generateQuiz(){
        quiz4.addQuizMultipleChoice("Round to hundreds the number 857", Arrays.asList(new Pair("800", false), 
                                                                                      new Pair("870", false),
                                                                                      new Pair("743", false),
                                                                                      new Pair("900", true)));
        
        quiz4.addQuizMultipleChoice("Approximate by subtracting to tens the number 2056", Arrays.asList(new Pair("2025", false),
                                                                                                        new Pair("5000", false),
                                                                                                        new Pair("2050", true),
                                                                                                        new Pair("3000", false)));
                                                                                                                                                 

        quiz4.addQuizMultipleChoice("Approximate by adding to hundreds the number 13783", Arrays.asList(new Pair("13800", true),
                                                                                                        new Pair("12546", false),
                                                                                                        new Pair("11323", false),
                                                                                                        new Pair("79863", false)));

        quiz4.addQuizMultipleChoice("Round to tens the number 2013",  Arrays.asList(new Pair("2000", false),
                                                                                    new Pair("2010", true),
                                                                                    new Pair("2016", false),
                                                                                    new Pair("2017", false)));

        quiz4.addQuizSingleChoice("Approximate by adding to hundreds the number 7254", "7300");
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        VBox root = quiz4.generateQuiz(primaryStage);

        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showAlgebra5thCh1Lesson2();
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