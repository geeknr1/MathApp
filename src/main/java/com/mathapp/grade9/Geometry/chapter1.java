package com.mathapp.grade9.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIgeometry9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Vector Calculus in the Plane '");
        Button buttonLesson1 = new Button("Vector Calculus in the Plane");
        Label labelLesson2 = new Label("Let's learn more about the ' Scalar Product '");
        Button buttonLesson2 = new Button("Scalar Product");

        Button back = new Button("Back");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show9thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}