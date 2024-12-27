package com.mathapp.grade8.Geometry;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class chapter7{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Regular pyramid '");
        Button buttonLesson1 = new Button("Regular pyramid");
        Label labelLesson2 = new Label("Let's learn more about the ' Right prism '");
        Button buttonLesson2 = new Button("Right prism");
        Label labelLesson3 = new Label("Let's learn more about the ' Rectangular parallelepiped '");
        Button buttonLesson3 = new Button("Rectangular parallelepiped");
        Label labelLesson4 = new Label("Let's learn more about the ' Cube '");
        Button buttonLesson4 = new Button("Cube");
        Label labelLesson5 = new Label("Let's learn more about the ' Frustum of the regular pyramid '");
        Button buttonLesson5 = new Button("Frustum of the regular pyramid");
        Label labelLesson6 = new Label("Let's learn more about the ' Distances and angle measures on the faces or inside the studied geometric bodies (determination by calculation) '");
        Button buttonLesson6 = new Button("Distances and angle measures on the faces or inside the studied geometric bodies");
        
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6);

        return root;
    }
}