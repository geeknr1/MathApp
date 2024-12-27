package com.mathapp.grade12.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UImathanalysis12Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Leibniz-Newton formula '");
        Button buttonLesson1 = new Button("Leibniz-Newton formula");
        Label labelLesson2 = new Label("Let's learn more about the 'Leibniz-Newton formula' and the 'Definite integral of elementary functions'");
        Button buttonLesson2 = new Button("Leibniz-Newton formula. Definite integral of elementary functions");
        Label labelLesson3 = new Label("Let's learn more about the ' Methods of calculating definite integrals '");
        Button buttonLesson3 = new Button("Methods of calculating definite integrals");
        Label labelLesson4 = new Label("Let's learn more about the ' Properties of definite integrals '");
        Button buttonLesson4 = new Button("Properties of definite integrals");
       
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4);

        return root;
    }
}