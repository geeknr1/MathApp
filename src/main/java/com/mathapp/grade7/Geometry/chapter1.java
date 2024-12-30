package com.mathapp.grade7.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIgeometry7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Perimeters '");
        Button buttonLesson1 = new Button("Perimeters");
        Label labelLesson2 = new Label("Let's learn more about the ' Area of a triangle '");
        Button buttonLesson2 = new Button("Area of a triangle");
        Label labelLesson3 = new Label("Let's learn more about the ' Areas of quadrilaterals '");
        Button buttonLesson3 = new Button("Areas of quadrilaterals");

        Button back = new Button("Back");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show7thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        return root;
    }
}