package com.mathapp.grade5.Geometry;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Point' ; 'Line' ; 'Plane' ; 'Half-plane' ; 'Half-line' ; 'Segment'");
        Button buttonLesson1 = new Button("Point, line, plane, half-plane, half-line, segment");
        Label labelLesson2 = new Label("Let's learn more about ' Relative positions '");
        Button buttonLesson2 = new Button("Relative positions");
        Label labelLesson3 = new Label("Let's learn more about the 'Segments' ;  'Operations with segments' ; the 'Midpoint of a segment'");
        Button buttonLesson3 = new Button("Segments. Operations with segments. Midpoint of a segment");

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