package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter6UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Distance from a point to a line '");
        Button buttonLesson1 = new Button("Distance from a point to a line");
        Label labelLesson2 = new Label("Let's learn more about the 'Distance from a point to a plane' and the 'Distance between two parallel planes'");
        Button buttonLesson2 = new Button("Distance from a point to a plane. Distance between two parallel planes");

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