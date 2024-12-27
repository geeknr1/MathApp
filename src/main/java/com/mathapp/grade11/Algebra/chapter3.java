package com.mathapp.grade11.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Determinants of order 2 or 3 '");
        Button buttonLesson1 = new Button("Determinants of order 2 or 3");
        Label labelLesson2 = new Label("Let's learn more about the ' Properties of determinants '");
        Button buttonLesson2 = new Button("Properties of determinants");
        Label labelLesson3 = new Label("Let's learn more about the 'Inverse of a matrix' and do some 'Matrix equations'");
        Button buttonLesson3 = new Button("Inverse of a matrix. Matrix equations");
        Label labelLesson4 = new Label("Let's learn more about the ' Applications of determinants in analytic geometry '");
        Button buttonLesson4 = new Button("Applications of determinants in analytic geometry");

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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4);

        return root;
    }
}