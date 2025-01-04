package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson1{
    private static Stage primaryStage;

    public Scene getLesson1UIch1(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
        In the decimal number system, also known as the base-10 system, numbers are written and read using 
        10 digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, and 9. The value of each digit depends on its position, with each 
        position representing a power of 10.\n\n 
        For example, in the number 245, the "2" is in the hundreds place (2 * 10²), the "4" is in the tens place \n(4 * 10¹), and the "5" is in the ones place (5 * 10⁰). This system allows for the representation of 
        any natural number by combining these digits. To read a number, we simply interpret each digit 
        based on its position and corresponding power of 10.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            Quiz1 quiz1UI = new Quiz1();
            Scene quiz1Scene = quiz1UI.getQuizUI(stage);
            primaryStage.setScene(quiz1Scene);
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