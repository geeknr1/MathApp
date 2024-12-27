package com.mathapp.grade9.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIalgebra9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Cartesian frame' and the 'Line in the plane'");
        Button buttonLesson1 = new Button("Cartesian frame. Line in the plane");
        Label labelLesson2 = new Label("Let's learn more about the 'Notion of the function' and 'Numerical functions'");
        Button buttonLesson2 = new Button("The notion of the function. Numerical functions");
        Label labelLesson3 = new Label("Let's learn more about the 'Boundary' and the 'Monotonicity'");
        Button buttonLesson3 = new Button("Boundary. Monotonicity");
        Label labelLesson4 = new Label("Let's learn more about the 'Parity' and the 'Periodicity'");
        Button buttonLesson4 = new Button("Parity. Periodicity");
        Label labelLesson5 = new Label("Let's learn more about the ' Composition of functions '");
        Button buttonLesson5 = new Button("Composition of functions");
        
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