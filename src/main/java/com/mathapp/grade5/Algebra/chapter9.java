package com.mathapp.grade5.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter9{
    private static Stage primaryStage;

    public VBox getChapter9UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Forms of writing a positive rational number '");
        Button buttonLesson1 = new Button("Forms of writing a positive rational number");
        Label labelLesson2 = new Label("Let's learn more about the ' Order of operations '");
        Button buttonLesson2 = new Button("Order of operations");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2);

        return root;
    }
}