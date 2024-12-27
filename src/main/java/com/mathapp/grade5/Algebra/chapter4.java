package com.mathapp.grade5.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Divisor ' and the ' Multiple '");
        Button buttonLesson1 = new Button("Divisor and Multiple");
        Label labelLesson2 = new Label("Let's learn more about the ' Divisibility by 2, 3, 5, 9 and 10 '");
        Button buttonLesson2 = new Button("Divisibility by 2, 3, 5, 9 and 10");
        Label labelLesson3 = new Label("Let's learn more about the ' Prime and composite numbers '");
        Button buttonLesson3 = new Button("Prime and composite numbers");
        

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