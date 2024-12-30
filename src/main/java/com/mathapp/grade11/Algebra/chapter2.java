package com.mathapp.grade11.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about 'Definitions' ; 'Particular matrices' and the 'Equality of two matrices'");
        Button buttonLesson1 = new Button("Definitions. Particular matrices. Equality of two matrices");
        Label labelLesson2 = new Label("Let's do some ' Matrix operations '");
        Button buttonLesson2 = new Button("Matrix operations");
        Label labelLesson3 = new Label("Let's learn more about the ' Power of a matrix '");
        Button buttonLesson3 = new Button("Power of a matrix");

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