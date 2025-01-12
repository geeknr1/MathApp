package com.mathapp.grade5.Algebra.ch1Lessons;

import java.util.List;

import com.mathapp.grade5.Algebra.chapter1;
import com.mathapp.Quiz;
import com.mathapp.Pair;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2{
    private static Stage primaryStage;
    private static Quiz quiz2 = new Quiz();

    public void generateQuestions(){
        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 1, ..., 9, 27, 81, 243", List.of(new Pair("3", true), 
                                                                                                                      new Pair("5", false),
                                                                                                                      new Pair("7", false),
                                                                                                                      new Pair("9", false)));
        
        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 3, 7, 11, 15, ..., ..., 27, 31, ..., ...", List.of(new Pair("16, 17, 18, 19", false),
                                                                                                                                                  new Pair("18, 23, 32, 8", true),
                                                                                                                                                  new Pair("19, 23, 35, 39", false),
                                                                                                                                                  new Pair("9, 8, 7, 6", false)));
                                                                                                                                                 

        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 4, 12, 36, 108, 324, ...", List.of(new Pair("900", true),
                                                                                                               new Pair("972", false),
                                                                                                               new Pair("1000", false),
                                                                                                               new Pair("870", false)));

        quiz2.addQuizMultipleChoice("Complete the following string of numbers: 8, ..., 20, 26, 32, 38",  List.of(new Pair("17", false),
                                                                                                                                   new Pair("16", false),
                                                                                                                                   new Pair("15", false),
                                                                                                                                   new Pair("14", true)));

        quiz2.addQuizSingleChoice("Complete the following string of numbers: 1, 2, ..., 8, 16", "4");
    }

    public Scene getQuizUI(Stage stage){
        generateQuestions();
        VBox root = quiz2.generateQuiz(stage); 

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