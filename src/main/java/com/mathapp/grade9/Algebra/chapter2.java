package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Propositions. Predicates. Quantifiers '");
        Button buttonLesson1 = new Button("Propositions. Predicates. Quantifiers");
        Label labelLesson2 = new Label("Let's learn more about the ' Elementary Logical Operations '");
        Button buttonLesson2 = new Button("Elementary Logical Operations");
        Label labelLesson3 = new Label("Let's learn more about the ' Mathematical Induction '");
        Button buttonLesson3 = new Button("Mathematical Induction");
        Label labelLesson4 = new Label("Let's do some ' Counting Problems '");
        Button buttonLesson4 = new Button("Counting Problems");

        Button back = new Button("Back");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show9thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        return root;
    }
}