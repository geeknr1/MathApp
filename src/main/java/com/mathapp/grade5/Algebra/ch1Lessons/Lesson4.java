package com.mathapp.grade5.Algebra.ch1Lessons;

import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson4{
    private static Stage primaryStage;

    public Scene getLesson4UIch1(Stage stage){

        primaryStage = stage;

    Label theoryLabel = new Label("""
    Approximating natural numbers and rounding involves simplifying numbers to make them easier to work with 
    while maintaining a reasonable degree of accuracy.

    Rounding a number means adjusting it to the nearest specified place value. 
    
    For example, rounding 68 to the nearest ten results in 70, and rounding 143 to the nearest hundred gives 100.

    The rules for rounding are the following:
       1)   If the digit in the next smaller place value is 5 or greater, round up.
       2)   If it is less than 5, round down.
       3)   This method is used to make calculations simpler and faster, especially when exact precision is 
            not necessary.
    """);
        theoryLabel.getStyleClass().add("label");
        
        Button practiceButton = new Button("Practice");
        practiceButton.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        practiceButton.setOnAction(event->{
            System.out.println("To be continued");
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