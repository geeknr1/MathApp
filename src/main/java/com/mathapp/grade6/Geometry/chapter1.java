package com.mathapp.grade6.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIgeometry6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Adjacent angles' and the 'Angle bisector'");
        Button buttonLesson1 = new Button("Adjacent angles. Angle bisector.");
        Label labelLesson2 = new Label("Let's learn more about ' Opposite angles at the vertex, angles formed about a point '");
        Button buttonLesson2 = new Button("Opposite angles at the vertex, angles formed about a point");
        Label labelLesson3 = new Label("Let's learn more about the ' Supplementary and complementary angles '");
        Button buttonLesson3 = new Button("Supplementary and complementary angles");
       
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