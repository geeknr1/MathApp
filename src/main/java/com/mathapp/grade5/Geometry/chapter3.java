package com.mathapp.grade5.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about 'Congruent figures' and the 'Symmetry'");
        Button buttonLesson1 = new Button("Congruent figures. Symmetry");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1);

        return root;
    }
}