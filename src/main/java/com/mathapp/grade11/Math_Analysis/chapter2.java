package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Limits of elementary functions' and the 'Lateral limits'");
        Button buttonLesson1 = new Button("Limits of elementary functions. Lateral limits");
        Label labelLesson2 = new Label("Let's learn more about the ' Fundamental limits '");
        Button buttonLesson2 = new Button("Fundamental limits");
        Label labelLesson3 = new Label("Let's learn more about the ' Asymptotes of real functions '");
        Button buttonLesson3 = new Button("Asymptotes of real functions");
        
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