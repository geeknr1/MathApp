package com.mathapp.grade12.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIalgebra12Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Rings '");
        Button buttonLesson1 = new Button("Rings");
        Label labelLesson2 = new Label("Let's learn more about ' Fields '");
        Button buttonLesson2 = new Button("Fields");
        Label labelLesson3 = new Label("Let's learn more about the ' Remarkable rings and fields '");
        Button buttonLesson3 = new Button("Remarkable rings and fields");

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

        back.setOnAction(event->{
            MathApp.show12thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        return root;
    }
}