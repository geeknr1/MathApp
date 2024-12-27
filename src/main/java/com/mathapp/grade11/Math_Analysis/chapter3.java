package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Continuous functions at a point' and the 'Continuous functions on a set'");
        Button buttonLesson1 = new Button("Continuous functions at a point. Continuous functions on a set");
        Label labelLesson2 = new Label("Let's learn more about the ' Properties of continuous functions on intervals '");
        Button buttonLesson2 = new Button("Properties of continuous functions on intervals");
        
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