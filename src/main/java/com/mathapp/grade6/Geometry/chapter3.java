package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about 'Perpendicularity' and 'Oblique lines'");
        Button buttonLesson1 = new Button("Perpendicularity. Oblique lines");
        Label labelLesson2 = new Label("Let's learn more about ' Practical applications in polygons and geometric bodies '");
        Button buttonLesson2 = new Button("Practical applications in polygons and geometric bodies");
        Label labelLesson3 = new Label("Let's learn more about the 'Median of a segment' and the 'Symmetry with respect to a line'");
        Button buttonLesson3 = new Button("The median of a segment. Symmetry with respect to a line");

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