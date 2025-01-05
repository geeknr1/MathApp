package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson2{
    private static Stage primaryStage;

    public Scene getLesson2UIch1(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        The sequence of natural numbers starts from 0 (or 1, depending on the definition) and includes all positive 
        whole numbers: 0, 1, 2, 3, 4, 5, and so on, 
        without any fractions or decimals. Natural numbers are used for counting and ordering.
        On the number line, natural numbers are represented as points that are evenly spaced from one another. 
        The number line starts at 0 (or 1) and extends infinitely to the right. Each point corresponds to a 
        unique natural number, and the distance between consecutive numbers is always the same. 
        As you move to the right on the number line, the numbers increase by one unit at a time. 
        The number line helps visualize the relative positions and order of natural numbers.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            Quiz2 quiz2UI = new Quiz2();
            Scene quiz2Scene = quiz2UI.getQuizUI(stage);
            primaryStage.setScene(quiz2Scene);
        });

        back.setOnAction(event->{
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(theoryLabel, practiceButton, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/mathsubjects.css").toExternalForm());

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(850);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        VBox newRoot = new VBox(contentPane);
        Scene sceneNew = new Scene(newRoot, 800, 600);
        sceneNew.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return sceneNew;
    }
}