package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about 'Points, lines, planes' and 'Relationships between points, lines, planes'");
        Button buttonLesson1 = new Button("Points, lines, planes and Relationships between points, lines, planes");
        Label labelLesson2 = new Label("Let's learn more about the 'Determination of the line' and the 'Determination of the plane'");
        Button buttonLesson2 = new Button("Determination of the line. Determination of the plane");

        Button back = new Button("Back");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show8thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}