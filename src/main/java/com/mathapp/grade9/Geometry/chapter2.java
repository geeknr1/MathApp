package com.mathapp.grade9.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Trigonometric formulas in the right triangle '");
        Button buttonLesson1 = new Button("Trigonometric formulas in the right triangle");
        Label labelLesson2 = new Label("Let's learn more about the 'Trigonometric circle' ; 'Reduction to the first quadrant'");
        Button buttonLesson2 = new Button("Trigonometric circle. Reduction to the first quadrant");
        Label labelLesson3 = new Label("Let's learn more about the 'Properties of trigonometric functions' ; 'Parity' ; 'Periodicity' and 'Sign'");
        Button buttonLesson3 = new Button("Properties of trigonometric functions. Parity. Periodicity. Sign");
        Label labelLesson4 = new Label("Let's learn more about the ' Relations between trigonometric functions of the same angle '");
        Button buttonLesson4 = new Button("Relations between trigonometric functions of the same angle");
        Label labelLesson5 = new Label("Let's learn more about ' Trigonometric functions of a sum and a difference of angles '");
        Button buttonLesson5 = new Button("Trigonometric functions of a sum and a difference of angles");
        Label labelLesson6 = new Label("Let's learn more about the ' Transformation of sums into products and vice versa '");
        Button buttonLesson6 = new Button("Transformation of sums into products and vice versa");
        
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

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6);

        return root;
    }
}