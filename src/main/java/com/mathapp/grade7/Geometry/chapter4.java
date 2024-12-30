package com.mathapp.grade7.Geometry;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter4UIgeometry7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Orthogonal projections on a line '");
        Button buttonLesson1 = new Button("Orthogonal projections on a line");
        Label labelLesson2 = new Label("Let's learn more about the ' Height theorem '");
        Button buttonLesson2 = new Button("Height theorem");
        Label labelLesson3 = new Label("Let's learn more about the ' Leg theorem '");
        Button buttonLesson3 = new Button("Leg theorem");
        Label labelLesson4 = new Label("Let's learn more about the ' Pythagoras' theorem and its reciprocal '");
        Button buttonLesson4 = new Button("Pythagoras' theorem and its reciprocal");
        Label labelLesson5 = new Label("Let's learn more about ' Trigonometry concepts in the right triangle '");
        Button buttonLesson5 = new Button("Trigonometry concepts in the right triangle");
        Label labelLesson6 = new Label("Let's learn more about the ' Solving the right triangle '");
        Button buttonLesson6 = new Button("Solving the right triangle");
        Label labelLesson7 = new Label("Let's learn more about the ' Applications: calculating elements in regular polygons; approximating distances in practical situations '");
        Button buttonLesson7 = new Button("Applications: calculating elements in regular polygons; approximating distances in practical situations");
        Label labelLesson8 = new Label("Let's learn more about the ' Areas and distances '");
        Button buttonLesson8 = new Button("Areas and distances");

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

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson7.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson8.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show7thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, back);

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