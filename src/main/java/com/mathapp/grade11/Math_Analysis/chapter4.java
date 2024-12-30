package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

import com.mathapp.MathApp;
public class chapter4{
    private static Stage primaryStage;

    public Scene getChapter4UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Differentiable functions at a point' and the \n'Geometric interpretation'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Differentiable functions at a point. Geometric interpretation");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the 'Lateral derivatives' and the 'Differentiability and \ncontinuity'");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Lateral derivatives. Differentiability and continuity");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the 'Derivatives of elementary functions' and the \n'Derivative rules'");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Derivatives of elementary functions. Derivative rules");
        buttonLesson3.getStyleClass().add("button");
        Label labelLesson4 = new Label("Let's learn more about the ' Higher-order derivatives '");
        labelLesson4.getStyleClass().add("label");
        Button buttonLesson4 = new Button("Higher-order derivatives");
        buttonLesson4.getStyleClass().add("button");
        Label labelLesson5 = new Label("Let's learn more about 'Limits of functions' and the 'L'Hospital's rules'");
        labelLesson5.getStyleClass().add("label");
        Button buttonLesson5 = new Button("Limits of functions. L'Hospital's rules");
        buttonLesson5.getStyleClass().add("button");

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

        back.setOnAction(event->{
            MathApp.show11thGradeMathAnalysis();
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

        VBox newRoot = new VBox(contentPane);
        Scene scene = new Scene(newRoot, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }
}