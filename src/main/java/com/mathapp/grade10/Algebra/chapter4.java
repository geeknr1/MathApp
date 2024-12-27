package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Irrational equations of order 2 or 3 '");
        Button buttonLesson1 = new Button("Irrational equations of order 2 or 3");
        Label labelLesson2 = new Label("Let's learn more about ' Exponential equations '");
        Button buttonLesson2 = new Button("Exponential equations");
        Label labelLesson3 = new Label("Let's learn more about ' Logarithmic equations '");
        Button buttonLesson3 = new Button("Logarithmic equations");
        
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