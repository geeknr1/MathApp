package com.mathapp.grade8.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIalgebra8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Real Number Intervals '");
        Button buttonLesson1 = new Button("Real Number Intervals");
        Label labelLesson2 = new Label("Let's learn more about the ' Inequalities '");
        Button buttonLesson2 = new Button("Inequalities");

        Button back = new Button("Back");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show8thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}