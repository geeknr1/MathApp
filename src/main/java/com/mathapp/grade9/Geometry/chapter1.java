package com.mathapp.grade9.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Vector Calculus in the Plane '");
        Button buttonLesson1 = new Button("Vector Calculus in the Plane");
        Label labelLesson2 = new Label("Let's learn more about the ' Scalar Product '");
        Button buttonLesson2 = new Button("Scalar Product");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2);

        return root;
    }
}