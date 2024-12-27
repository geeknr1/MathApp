package com.mathapp.grade8.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter9{
    private static Stage primaryStage;

    public VBox getChapter9UIgeometry8Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Angle '");
        Button buttonLesson1 = new Button("Angle");
        Label labelLesson2 = new Label("Let's learn more about the ' Important lines in triangles '");
        Button buttonLesson2 = new Button("Important lines in triangles");
        Label labelLesson3 = new Label("Let's learn more about the ' Quadrangulars '");
        Button buttonLesson3 = new Button("Quadrangulars");
        Label labelLesson4 = new Label("Let's learn more about the ' Areas '");
        Button buttonLesson4 = new Button("Areas");
        Label labelLesson5 = new Label("Let's learn more about ' Metric relations in right triangles '");
        Button buttonLesson5 = new Button("Metric relations in right triangles");
        Label labelLesson6 = new Label("Let's learn more about the ' Trigonometric functions '");
        Button buttonLesson6 = new Button("Trigonometric functions");
        Label labelLesson7 = new Label("Let's learn more about the ' Geometrical bodies '");
        Button buttonLesson7 = new Button("Geometrical bodies");
        
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

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson7.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7);

        return root;
    }
}