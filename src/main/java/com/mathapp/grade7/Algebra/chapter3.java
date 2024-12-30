package com.mathapp.grade7.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Equalities '");
        Button buttonLesson1 = new Button("Equalities");
        Label labelLesson2 = new Label("Let's learn more about the ' The equation ax + b = 0 '");
        Button buttonLesson2 = new Button("The equation ax + b = 0");
        Label labelLesson3 = new Label("Let's learn more about the ' Systems of first-degree equations with two unknowns '");
        Button buttonLesson3 = new Button("Systems of first-degree equations with two unknowns");
        Label labelLesson4 = new Label("Let's learn more about the ' Problems that can be solved using equations or systems of linear equations '");
        Button buttonLesson4 = new Button("Problems that can be solved using equations or systems of linear equations");

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
            MathApp.show7thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        return root;
    }
}