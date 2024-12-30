package com.mathapp.grade11.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIalgebra11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Definition. Composition of permutations. '");
        Button buttonLesson1 = new Button("Definition. Composition of permutations.");
        Label labelLesson2 = new Label("Let's learn more about the ' Inversions. Sign of a permutation. '");
        Button buttonLesson2 = new Button("Inversions. Sign of a permutation.");
        Label labelLesson3 = new Label("Let's learn more about the ' Transpositions '");
        Button buttonLesson3 = new Button("Transpositions");

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

        back.setOnAction(event->{
            MathApp.show11thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        return root;
    }
}