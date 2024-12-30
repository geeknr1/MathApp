package com.mathapp.grade5.Geometry;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class chapter4{
    private static Stage primaryStage;

    public Scene getChapter4UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Units of measurement for length' and \n'Conversions'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Units of measurement for length. Conversions");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Units of measurement for surfaces and \n'Conversions'");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Units of measurement for surfaces. Conversions");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the 'Units of measurement for volume and \n'Conversions'");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Units of measurement for volume. Conversions");
        buttonLesson3.getStyleClass().add("button");
        Label labelLesson4 = new Label("Let's learn more about the 'Units of measurement for capacity' and 'Conversions'");
        labelLesson4.getStyleClass().add("label");
        Button buttonLesson4 = new Button("Units of measurement for capacity. Conversions");
        buttonLesson4.getStyleClass().add("button");
        Label labelLesson5 = new Label("Let's learn more about 'Units of measurement for mass' and 'Conversions'");
        labelLesson5.getStyleClass().add("label");
        Button buttonLesson5 = new Button("Units of measurement for mass. Conversions");
        buttonLesson5.getStyleClass().add("button");
        Label labelLesson6 = new Label("Let's learn more about the 'Units of measurement for time' and \n'Conversions'");
        labelLesson6.getStyleClass().add("label");
        Button buttonLesson6 = new Button("Units of measurement for time. Conversions");
        buttonLesson6.getStyleClass().add("button");

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

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show5thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, back);

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

        VBox newRoot = new VBox(contentPane);
        Scene scene = new Scene(newRoot, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}