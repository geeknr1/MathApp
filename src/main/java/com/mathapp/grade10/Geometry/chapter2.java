package com.mathapp.grade10.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIgeometry10Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Cartesian reference in the plane' and the 'Distances in the plane'");
        Button buttonLesson1 = new Button("Cartesian reference in the plane. Distances in the plane");
        Label labelLesson2 = new Label("Let's learn more about the ' Line in the plane '");
        Button buttonLesson2 = new Button("The line in the plane");

        Button back = new Button("Back");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show10thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}