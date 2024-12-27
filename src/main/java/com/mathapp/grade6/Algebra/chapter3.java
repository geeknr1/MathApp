package com.mathapp.grade6.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Ratios '");
        Button buttonLesson1 = new Button("Ratios");
        Label labelLesson2 = new Label("Let's learn more about the ' Concentration of a solution '");
        Button buttonLesson2 = new Button("Concentration of a solution");
        Label labelLesson3 = new Label("Let's learn more about the ' Title of an alloy '");
        Button buttonLesson3 = new Button("Title of an alloy");
        Label labelLesson4 = new Label("Let's learn more about the ' Scale of a map '");
        Button buttonLesson4 = new Button("Scale of a map");
        Label labelLesson5 = new Label("Let's learn more about ' Proportions. The fundamental property of proportions '");
        Button buttonLesson5 = new Button("Proportions. The fundamental property of proportions");
        Label labelLesson6 = new Label("Let's learn more about ' Percentages. Problems involving percentages '");
        Button buttonLesson6 = new Button("Percentages. Problems involving percentages");
        Label labelLesson7 = new Label("Let's learn more about ' Directly and inversely proportional quantities '");
        Button buttonLesson7 = new Button("Directly and inversely proportional quantities");
        Label labelLesson8 = new Label("Let's learn more about the ' Simple rule of three '");
        Button buttonLesson8 = new Button("Simple rule of three");
        Label labelLesson9 = new Label("Let's learn more about the ' Series of equal ratios '");
        Button buttonLesson9 = new Button("Series of equal ratios");

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

        buttonLesson7.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson8.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson9.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9);

        return root;
    }
}