package com.mathapp.grade5.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Angle: definition, notations, elements' ; the 'Interior of an angle' ; the 'Exterior of an angle'");
        Button buttonLesson1 = new Button("Angle: definition, notations, elements; interior of an angle, exterior of an angle");
        Label labelLesson2 = new Label("Let's learn more about the 'Measure of an angle' ; the 'Congruent angles' ; 'Classification'");
        Button buttonLesson2 = new Button("Measure of an angle, congruent angles. Classification");
        Label labelLesson3 = new Label("Let's learn more about ' Calculations with angle measures '");
        Button buttonLesson3 = new Button("Calculations with angle measures");
    
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