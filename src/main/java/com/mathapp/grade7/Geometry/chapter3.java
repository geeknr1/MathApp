package com.mathapp.grade7.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIgeometry7Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Ratio of two segments' ; 'Proportional segments' and the 'Equidistant parallel theorem'");
        Button buttonLesson1 = new Button("Ratio of two segments. Proportional segments. Equidistant parallel theorem");
        Label labelLesson2 = new Label("Let's learn more about 'Thales' theorem and its reciprocal' and 'Dividing a segment into parts proportional to given numbers'");
        Button buttonLesson2 = new Button("Thales' theorem and its reciprocal. Dividing a segment into parts proportional to given numbers");
        Label labelLesson3 = new Label("Let's learn more about 'Similar triangles' and the 'Similarity criteria'");
        Button buttonLesson3 = new Button("Similar triangles. Similarity criteria.");
        Label labelLesson4 = new Label("Let's learn more about the ' Fundamental similarity theorem '");
        Button buttonLesson4 = new Button("Fundamental similarity theorem");

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

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show7thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        return root;
    }
}