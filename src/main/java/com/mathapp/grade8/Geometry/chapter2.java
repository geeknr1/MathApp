package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter2{
    private static Stage primaryStage;

    public VBox getChapter2UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Pyramid '");
        Button buttonLesson1 = new Button("Pyramid");
        Label labelLesson2 = new Label("Let's learn more about the ' Right prism '");
        Button buttonLesson2 = new Button("Right prism");
        Label labelLesson3 = new Label("Let's learn more about the ' Right circular cylinder '");
        Button buttonLesson3 = new Button("Right circular cylinder");
        Label labelLesson4 = new Label("Let's learn more about the ' Right circular cone '");
        Button buttonLesson4 = new Button("Right circular cone");

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
            MathApp.show8thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, back);

        return root;
    }
}