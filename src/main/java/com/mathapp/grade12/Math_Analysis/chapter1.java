package com.mathapp.grade12.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Methods of calculating the primitives of a function '");
        Button buttonLesson1 = new Button("Methods of calculating the primitives of a function");
        Label labelLesson2 = new Label("Let's learn more about the 'Functions that admit primitives' and the 'Primitive of a function'");
        Button buttonLesson2 = new Button("Subtraction of natural numbers");
        
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