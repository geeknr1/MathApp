package com.mathapp.grade11.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIalgebra11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Matrix form of linear systems' and 'Cramer-type systems'");
        Button buttonLesson1 = new Button("Matrix form of linear systems. Cramer-type systems");
        Label labelLesson2 = new Label("Let's learn more about the ' Rank of a matrix '");
        Button buttonLesson2 = new Button("Rank of a matrix");
        Label labelLesson3 = new Label("Let's learn more about the ' Gauss' method for solving systems '");
        Button buttonLesson3 = new Button("Gauss' method for solving systems");
        Label labelLesson4 = new Label("Let's learn more about the ' Study of compatibility of linear systems '");
        Button buttonLesson4 = new Button("Study of compatibility of linear systems");
        
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