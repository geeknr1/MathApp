package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Differentiable functions at a point' and the 'Geometric interpretation'");
        Button buttonLesson1 = new Button("Differentiable functions at a point. Geometric interpretation");
        Label labelLesson2 = new Label("Let's learn more about the 'Lateral derivatives' and the 'Differentiability and continuity'");
        Button buttonLesson2 = new Button("Lateral derivatives. Differentiability and continuity");
        Label labelLesson3 = new Label("Let's learn more about the 'Derivatives of elementary functions' and the 'Derivative rules'");
        Button buttonLesson3 = new Button("Derivatives of elementary functions. Derivative rules");
        Label labelLesson4 = new Label("Let's learn more about the ' Higher-order derivatives '");
        Button buttonLesson4 = new Button("Higher-order derivatives");
        Label labelLesson5 = new Label("Let's learn more about 'Limits of functions' and the 'L'Hospital's rules'");
        Button buttonLesson5 = new Button("Limits of functions. L'Hospital's rules");

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