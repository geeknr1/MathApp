package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter5UIalgebra9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ''Definition' ; 'Intersections with axes' ; 'Attached equation' ; 'Monotonicity' ; 'Image'");
        Button buttonLesson1 = new Button("Definition. Intersections with axes. Attached equation. Monotonicity. Image");
        Label labelLesson2 = new Label("Let's learn more about the 'Sign of the first degree function' and the 'First degree inequalities'");
        Button buttonLesson2 = new Button("Sign of the first degree function. First degree inequalities");
        Label labelLesson3 = new Label("Let's learn more about the 'Relative positions of two lines' and the 'Systems of linear equations'");
        Button buttonLesson3 = new Button("Relative positions of two lines. Systems of linear equations.");
        Label labelLesson4 = new Label("Let's learn more about the ' Systems of first degree inequalities '");
        Button buttonLesson4 = new Button("Systems of first degree inequalities");

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

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show9thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        return root;
    }
}