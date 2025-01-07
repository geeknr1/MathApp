package com.mathapp.grade5.Geometry;

import com.mathapp.MathApp;
import com.mathapp.grade5.Geometry.ch1Lessons.Lesson1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public Scene getChapter1UIgeometry5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Point' ; 'Line' ; 'Plane' ; 'Half-plane' ; 'Half-line' ; 'Segment'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Point, line, plane, half-plane, half-line, segment");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about ' Relative positions '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Relative positions");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the 'Segments' ;  'Operations with segments' ; the 'Midpoint of a segment'");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Segments. Operations with segments. Midpoint of a segment");
        buttonLesson3.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        buttonLesson1.setOnAction(event->{
            Lesson1 geometryCh1Gr5Lesson1UI = new Lesson1();
            Scene geometryCh1Gr5Lesson1Scene = geometryCh1Gr5Lesson1UI.getLesson1UIch1Grade5Geo(stage);
            primaryStage.setScene(geometryCh1Gr5Lesson1Scene);
        });

        

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show5thGradeGeometry();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }

     public static void showGeometry5thCh1Lesson1(){
        Lesson1 lesson1Grade5AlgUI = new Lesson1();
        Scene lesson1Grade5AlgScene = lesson1Grade5AlgUI.getLesson1UIch1Grade5Geo(primaryStage);
        primaryStage.setScene(lesson1Grade5AlgScene);
    }
}