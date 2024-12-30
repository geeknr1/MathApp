package com.mathapp.grade5.Algebra;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class chapter8{
    private static Stage primaryStage;

    public Scene getChapter8UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Transformations '");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Transformations");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Operations with recurring decimal fractions '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Operations with recurring decimal fractions");
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
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}