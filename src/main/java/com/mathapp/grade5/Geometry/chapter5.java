package com.mathapp.grade5.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter5UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Perimeter'");
        Button buttonLesson1 = new Button("Perimeter");
        Label labelLesson2 = new Label("Let's learn more about the 'Surface'");
        Button buttonLesson2 = new Button("Surface");
        Label labelLesson3 = new Label("Let's learn more about the 'Volume'");
        Button buttonLesson3 = new Button("Volume");
        
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