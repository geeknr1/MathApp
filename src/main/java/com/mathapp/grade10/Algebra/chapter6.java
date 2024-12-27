package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter6UIalgebra10Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Percentage '");
        Button buttonLesson1 = new Button("Percentage");
        Label labelLesson2 = new Label("Let's learn more about ' Interest '");
        Button buttonLesson2 = new Button("Interest");
        
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