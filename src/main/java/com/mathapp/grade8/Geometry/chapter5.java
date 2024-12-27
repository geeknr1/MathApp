package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter5UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Orthogonal Projections on a Plane '");
        Button buttonLesson1 = new Button("Orthogonal Projections on a Plane");
        Label labelLesson2 = new Label("Let's learn more about the 'Angle between a Line and a Plane' and the 'Projection Length of a Segment'");
        Button buttonLesson2 = new Button("Angle between a Line and a Plane. Projection Length of a Segment.");
        Label labelLesson3 = new Label("Let's learn more about the 'Dihedral Angle' ; the 'Angle of Two Planes' and the 'Perpendicular Planes'");
        Button buttonLesson3 = new Button("Dihedral Angle. Angle of Two Planes. Perpendicular Planes");
        
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