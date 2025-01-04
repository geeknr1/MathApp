package com.mathapp.grade5.Algebra;

import com.mathapp.MathApp;
import com.mathapp.grade5.Algebra.ch1Lessons.Lesson1;
import com.mathapp.grade5.Algebra.ch1Lessons.Lesson2;
import com.mathapp.grade5.Algebra.ch1Lessons.Lesson3;
import com.mathapp.grade5.Algebra.ch1Lessons.Lesson4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class chapter1{
    private static Stage primaryStage;

    public Scene getChapter1UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Writing and reading natural numbers in the decimal number system '");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Writing and reading natural numbers in the decimal number system");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about ' The sequence of natural numbers. Representing natural numbers on the \nnumber line '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("The sequence of natural numbers. Representing natural numbers on the number line");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about ' Comparing and ordering natural numbers '");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Comparing and ordering natural numbers");
        buttonLesson3.getStyleClass().add("button");
        Label labelLesson4 = new Label("Let's learn more about ' Approximating natural numbers. Rounding '");
        labelLesson4.getStyleClass().add("label");
        Button buttonLesson4 = new Button("Approximating natural numbers. Rounding");
        buttonLesson4.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        buttonLesson1.setOnAction(event->{
            Lesson1 algebraCh1Gr5Lesson1UI = new Lesson1();
            Scene algebraCh1Gr5Lesson1Scene = algebraCh1Gr5Lesson1UI.getLesson1UIch1(stage);
            primaryStage.setScene(algebraCh1Gr5Lesson1Scene);
        });

        buttonLesson2.setOnAction(event->{
            Lesson2 algebraCh1Gr5Lesson2UI = new Lesson2();
            Scene algebraCh1Gr5Lesson2Scene = algebraCh1Gr5Lesson2UI.getLesson2UIch1(stage);
            primaryStage.setScene(algebraCh1Gr5Lesson2Scene);
        });

        buttonLesson3.setOnAction(event->{
            Lesson3 algebraCh1Gr5Lesson3UI = new Lesson3();
            Scene algebraCh1Gr5Lesson3Scene = algebraCh1Gr5Lesson3UI.getLesson3UIch1(stage);
            primaryStage.setScene(algebraCh1Gr5Lesson3Scene);
        });

        buttonLesson4.setOnAction(event->{
            Lesson4 algebraCh1Gr5Lesson4UI = new Lesson4();
            Scene algebraCh1Gr5Lesson4Scene = algebraCh1Gr5Lesson4UI.getLesson4UIch1(stage);
            primaryStage.setScene(algebraCh1Gr5Lesson4Scene);
        });

        back.setOnAction(event->{
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/mathsubjects.css").toExternalForm());

        return scene;
    }
}