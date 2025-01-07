package com.mathapp.grade5.Geometry.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson3{
    private static Stage primaryStage;

    public Scene getLesson3UIch1Grade5Alg(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        Comparing and ordering natural numbers involves determining which numbers are greater, smaller, or equal.
        To compare two natural numbers, we use the symbols:

            ">" (greater than)
            "<" (less than)
            "=" (equal to)
        
        For example, 5 > 3, meaning 5 is greater than 3, and 2 < 7, meaning 2 is less than 7.
        To order natural numbers, we arrange them from smallest to largest or vice versa.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{

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