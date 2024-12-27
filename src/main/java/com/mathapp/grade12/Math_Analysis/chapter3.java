package com.mathapp.grade12.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UImathanalysis12Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Area of ​​a plane surface '");
        Button buttonLesson1 = new Button("Area of ​​a plane surface");
        Label labelLesson2 = new Label("Let's learn more about the ' Volume of bodies of revolution '");
        Button buttonLesson2 = new Button("Volume of bodies of revolution");
        Label labelLesson3 = new Label("Let's learn more about the ' Multiplication of natural numbers '");
        Button buttonLesson3 = new Button("Calculation of limits of series using the definite integral");
        
        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3);

        return root;
    }
}