package com.mathapp.grade9.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.mathapp.MathApp;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIgeometry9Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Theorem of Cosine' and the 'Theorem of Sines'");
        Button buttonLesson1 = new Button("Theorem of Cosine. Theorem of Sines");
        Label labelLesson2 = new Label("Let's learn more about the ' Solving Any Triangles '");
        Button buttonLesson2 = new Button("Solving Any Triangles");
        Label labelLesson3 = new Label("Let's learn more about the 'Radius of the Inscribed Circle' ; the 'Radius of the Circumscribed Circle' ; and the 'Area of ​​a Triangle'");
        Button buttonLesson3 = new Button("Radius of the Inscribed Circle. Radius of the Circumscribed Circle. Area of ​a Triangle");

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
            MathApp.show9thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        return root;
    }
}