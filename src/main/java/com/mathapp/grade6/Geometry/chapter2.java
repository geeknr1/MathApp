package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Parallel Lines '");
        Button buttonLesson1 = new Button("Parallel Lines");
        Label labelLesson2 = new Label("Let's learn more about the ' Parallelism Criteria '");
        Button buttonLesson2 = new Button("Parallelism Criteria");
        Label labelLesson3 = new Label("Let's learn more about ' Practical applications in polygons and geometric solids '");
        Button buttonLesson3 = new Button("Practical Applications in Polygons and Geometric Solids");
        
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