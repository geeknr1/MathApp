package com.mathapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MathApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        DataBase database = new DataBase();
        database.connect();
        Label label = new Label("Welcome to Math Learning Application");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Math Learning Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}