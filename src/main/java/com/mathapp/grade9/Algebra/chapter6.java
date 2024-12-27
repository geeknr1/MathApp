package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Definition' ; 'Graph' ; 'Attached equation' and 'Monotonicity'");
        Button buttonLesson1 = new Button("Definition. Graph. Attached equation. Monotonicity.");
        Label labelLesson2 = new Label("Let's learn more about the 'Sign of the quadratic function' and the 'Quadratic inequalities'");
        Button buttonLesson2 = new Button("The sign of the quadratic function. Quadratic inequalities.");
        Label labelLesson3 = new Label("Let's learn more about the 'Viete's relations' ; the 'Symmetrical systems of linear equations' and the 'Sign and position of the roots of the quadratic function'");
        Button buttonLesson3 = new Button("Viete's relations. Symmetrical systems of linear equations. The sign and position of the roots of the quadratic function");
        Label labelLesson4 = new Label("Let's learn more about the 'Relative positions of a line with respect to a parabola' ; the 'Relative positions of two parabolas' and the 'Systems of equations'");
        Button buttonLesson4 = new Button("The relative positions of a line with respect to a parabola. The relative positions of two parabolas. Systems of equations");

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