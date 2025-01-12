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

public class Quiz1{
    private static Stage primaryStage;
    private static Quiz quiz1 = new Quiz();

    public void generateQuestions(){
        quiz1.addQuizMultipleChoice("A set X has the property p if for any x,y \u2208 M we have (x+y) belonging to M. Determine which of the following sets has the property p.", Arrays.asList(new Pair("A=(0,∞)", false), 
                                                                                                                                    new Pair("B=(0,1)", false),
                                                                                                                                    new Pair("C={(1/(n+1)), n \u2208 N}", true),
                                                                                                                                    new Pair("R - Q", false)));
        
        quiz1.addQuizMultipleChoice("Which of the following sets are vecinities of 1?", Arrays.asList(new Pair("(0, ∞)", true),
                                                                                                      new Pair("[1, ∞)", false)
                                                                                                      ));
                                                                                                                                                 

        quiz1.addQuizMultipleChoice("Determine the set M = M1 U M2 U M3 U ... U Mn U ... knowing that Mk = (0; (2k) / (k+2)) where k \u2208 N*.", Arrays.asList(new Pair("M = [0, 2]", true),
                                                                                                               new Pair("M = [0, 2/3)", false),
                                                                                                               new Pair("M = [0,2)", false),
                                                                                                               new Pair("M = [0, ∞)", false)));

        quiz1.addQuizMultipleChoice("Write all the 4-digit numbers using just the digits '0' and '3'. Find their sum afterwards.",  Arrays.asList(new Pair("max(A) = 3", false),
                                                                                                                                   new Pair("max(A) doesn't exist", true),
                                                                                                                                   new Pair("sup(A) = 3", true),
                                                                                                                                   new Pair("A is a vecinity for x = 2", false)));
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        generateQuestions();
        VBox root = quiz1.generateQuiz(primaryStage);

        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showMA5thCh1Lesson1();
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