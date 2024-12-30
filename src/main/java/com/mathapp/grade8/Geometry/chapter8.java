package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter8{
    private static Stage primaryStage;

    public VBox getChapter8UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Right circular cylinder '");
        Button buttonLesson1 = new Button("Right circular cylinder");
        Label labelLesson2 = new Label("Let's learn more about the ' Right circular cone '");
        Button buttonLesson2 = new Button("Right circular cone");
        Label labelLesson3 = new Label("Let's learn more about the ' Frustum of the right circular cone '");
        Button buttonLesson3 = new Button("Frustum of right circular cone");
        Label labelLesson4 = new Label("Let's learn more about the ' Sphere '");
        Button buttonLesson4 = new Button("Sphere");

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