package com.mathapp.grade5.Algebra;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class chapter4{
    private static Stage primaryStage;

    public Scene getChapter4UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Divisor ' and the ' Multiple '");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Divisor and Multiple");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Divisibility by 2, 3, 5, 9 and 10 '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Divisibility by 2, 3, 5, 9 and 10");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the ' Prime and composite numbers '");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Prime and composite numbers");
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
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}