package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Parallel lines' ; the 'Angle of two lines' ; the 'Line parallel to a plane' and 'Parallel planes'");
        Button buttonLesson1 = new Button("Parallel lines, angle of two lines, line parallel to a plane, parallel planes");
        Label labelLesson2 = new Label("Let's do some applications with the following subjects: the 'Sections parallel to the base in the geometric bodies studied' ; the 'Truncated pyramid' and the 'Truncated cone'");
        Button buttonLesson2 = new Button("Applications: sections parallel to the base in the geometric bodies studied. The truncated pyramid. The truncated cone");

        Button back = new Button("Back");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show8thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, back);

        return root;
    }
}