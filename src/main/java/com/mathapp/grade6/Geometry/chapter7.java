package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter7{
    private static Stage primaryStage;

    public VBox getChapter7UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Congruence of random triangles '");
        Button buttonLesson1 = new Button("Congruence of any triangles");
        Label labelLesson2 = new Label("Let's learn more about the ' Congruence of right triangles '");
        Button buttonLesson2 = new Button("Congruence of right triangles");
        Label labelLesson3 = new Label("Let's learn more about the ' Method of congruent triangles '");
        Button buttonLesson3 = new Button("Method of congruent triangles");
    
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