package com.mathapp.grade5.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public Scene getChapter2UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Angle: definition, notations, elements' ; \nthe 'Interior of an angle' ; the 'Exterior of an angle'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Angle: definition, notations, elements; interior of an angle, exterior of an angle");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the 'Measure of an angle' ; the 'Congruent angles' ; 'Classification'");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Measure of an angle, congruent angles. Classification");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about ' Calculations with angle measures '");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Calculations with angle measures");
        buttonLesson3.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");
    
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
            MathApp.show5thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}