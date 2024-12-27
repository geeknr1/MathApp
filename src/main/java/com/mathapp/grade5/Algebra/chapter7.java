package com.mathapp.grade5.Algebra;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class chapter7{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Adding and Subtracting Decimals '");
        Button buttonLesson1 = new Button("Adding and Subtracting Decimals");
        Label labelLesson2 = new Label("Let's learn more about the ' Multiplying Decimals '");
        Button buttonLesson2 = new Button("Multiplying Decimals");
        Label labelLesson3 = new Label("Let's learn more about the ' Dividing Decimals '");
        Button buttonLesson3 = new Button("Dividing Decimals");
        Label labelLesson4 = new Label("Let's learn more about the ' Raising Decimals '");
        Button buttonLesson4 = new Button("Raising Decimals");
        Label labelLesson5 = new Label("Let's learn more about ' Practical Problems with Decimals '");
        Button buttonLesson5 = new Button("Practical Problems with Decimals");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5);

        return root;
    }
}