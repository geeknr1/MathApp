package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Algebraic form of a complex number' ; do some 'Operations with complex numbers' and learn about the 'Solving the quadratic equation'");
        Button buttonLesson1 = new Button("Algebraic form of a complex number. Operations with complex numbers. Solving the quadratic equation.");
        Label labelLesson2 = new Label("Let's learn more about the ' Geometric interpretation of a complex number '");
        Button buttonLesson2 = new Button("Geometric interpretation of a complex number");
        Label labelLesson3 = new Label("Let's learn more about the ' Trigonometric form of complex numbers. Operations '");
        Button buttonLesson3 = new Button("Trigonometric form of complex numbers. Operations");
        
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