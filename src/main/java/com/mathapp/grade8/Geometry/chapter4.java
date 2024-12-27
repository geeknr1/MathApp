package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about and do some applications with ' Perpendicular lines, perpendicular line on a plane. Applications: heights of studied bodies '");
        Button buttonLesson1 = new Button("Perpendicular lines, perpendicular line on a plane. Applications: heights of studied bodies");
        Label labelLesson2 = new Label("Let's learn more about and do some applications with ' Perpendicular planes. Applications: diagonal sections, axial sections in studied bodies '");
        Button buttonLesson2 = new Button("Perpendicular planes. Applications: diagonal sections, axial sections in studied bodies");

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