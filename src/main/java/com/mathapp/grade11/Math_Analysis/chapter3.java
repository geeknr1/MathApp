package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public Scene getChapter3UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Continuous functions at a point' and the 'Continuous functions on a set'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Continuous functions at a point. Continuous functions on a set");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Properties of continuous functions on intervals '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Properties of continuous functions on intervals");
        buttonLesson2.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show11thGradeMathAnalysis();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}