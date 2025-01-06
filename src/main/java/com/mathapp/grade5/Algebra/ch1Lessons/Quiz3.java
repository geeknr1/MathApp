package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.grade5.Algebra.chapter1;

import java.util.Arrays;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Button;


public class Quiz3{
    private static Stage primaryStage;
    private static Quiz quiz3 = new Quiz();

    public void generateQuiz(){
        quiz3.addQuizMultipleChoice("It is known that a five-digit natural number is equal to its inverted one, and the tens digit is 4. What is the smallest number that satisfies this condition?", 
                                    Arrays.asList(new Pair("10000", true), 
                                                  new Pair("24041", false),
                                                  new Pair("14041", false),
                                                  new Pair("10041", false)));
        
        quiz3.addQuizMultipleChoice("What is the largest odd number that has different digits and the sum of the digits is equal to 10?", 
                                    Arrays.asList(new Pair("1000", false),
                                                  new Pair("1023", true),
                                                  new Pair("1027", false),
                                                  new Pair("9999", false)));
                                                                                                                                                 

        quiz3.addQuizMultipleChoice("What is the smallest number that has the sum of the digits equal to 29?", 
                                    Arrays.asList(new Pair("978", true),
                                                  new Pair("2999", false),
                                                  new Pair("3500", false),
                                                  new Pair("460", false)));

        quiz3.addQuizMultipleChoice("Ana is thinking of all 3-digit natural numbers, written with consecutive digits, in ascending order. How many such numbers can Ana write?",  
                                    Arrays.asList(new Pair("7", false),
                                                  new Pair("4", false),
                                                  new Pair("9", false),
                                                  new Pair("10", true)));

        quiz3.addQuizSingleChoice("Write in descending order all the 3-digit natural numbers whose product of digits is 9", "911, 331, 313, 191, 119");
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        VBox root = quiz3.generateQuiz(primaryStage); 

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