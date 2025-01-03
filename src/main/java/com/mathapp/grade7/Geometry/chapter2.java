package com.mathapp.grade7.Geometry;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIgeometry7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Inscribed angle in a circle '");
        Button buttonLesson1 = new Button("Inscribed angle in a circle");
        Label labelLesson2 = new Label("Let's learn more about the ' Chords and arcs in a circle '");
        Button buttonLesson2 = new Button("Chords and arcs in a circle");
        Label labelLesson3 = new Label("Let's learn more about the ' Tangents from an external point to a circle '");
        Button buttonLesson3 = new Button("Tangents from an external point to a circle");
        Label labelLesson4 = new Label("Let's learn more about the ' Regular polygons inscribed in a circle '");
        Button buttonLesson4 = new Button("Regular polygons inscribed in a circle");
        Label labelLesson5 = new Label("Let's learn more about ' Circle length and disk area '");
        Button buttonLesson5 = new Button("Circle length and disk area");

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

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show7thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, back);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(580);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        return new VBox(contentPane);
    }
}