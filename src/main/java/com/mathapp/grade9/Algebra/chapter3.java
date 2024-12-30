package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Arithmetic Progressions '");
        Button buttonLesson1 = new Button("Arithmetic Progressions");
        Label labelLesson2 = new Label("Let's learn more about the ' Geometric Progressions '");
        Button buttonLesson2 = new Button("Geometric Progressions");

        Button back = new Button("Back");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show9thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}