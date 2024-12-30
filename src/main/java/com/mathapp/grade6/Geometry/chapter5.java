package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter5UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Triangle: definition, elements, classification, perimeter '");
        Button buttonLesson1 = new Button("Triangle: definition, elements, classification, perimeter");
        Label labelLesson2 = new Label("Let's learn more about the ' Sum of the measures of the angles of a triangle' and the 'Exterior angle of a triangle '");
        Button buttonLesson2 = new Button("Sum of the measures of the angles of a triangle; Exterior angle of a triangle");
        Label labelLesson3 = new Label("Let's learn more about the 'Construction of triangles' and the 'Triangle inequality'");
        Button buttonLesson3 = new Button("Construction of triangles. Triangle inequality");

        Button back = new Button("Back");
        
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
            MathApp.show6thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        return root;
    }
}