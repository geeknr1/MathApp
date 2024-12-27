package com.mathapp.grade8.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Functions defined on finite sets, expressed using diagrams, tables, formulas '");
        Button buttonLesson1 = new Button("Functions defined on finite sets, expressed using diagrams, tables, formulas");
        Label labelLesson2 = new Label("Let's learn more about the ' Functions f(x) = ax + b defined on finite sets of real numbers or non-degenerate intervals '");
        Button buttonLesson2 = new Button("Functions f(x) = ax + b defined on finite sets of real numbers or non-degenerate intervals");
        Label labelLesson3 = new Label("Let's learn more about the ' Elements of statistics '");
        Button buttonLesson3 = new Button("Elements of statistics");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3);

        return root;
    }
}