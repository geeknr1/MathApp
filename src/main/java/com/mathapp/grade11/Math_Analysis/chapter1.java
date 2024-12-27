package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Sets of points on the real line' ; 'Intervals' and 'Neighborhoods'");
        Button buttonLesson1 = new Button("Sets of points on the real line. Intervals. Neighborhoods");
        Label labelLesson2 = new Label("Let's learn more about 'Monotonic sequences' ; 'Bounded sequences' and 'Convergent sequences'");
        Button buttonLesson2 = new Button("Monotonic sequences. Bounded sequences. Convergent sequences");
        Label labelLesson3 = new Label("Let's learn more about the 'Limits of sequences' and the 'Cases of indeterminacy'");
        Button buttonLesson3 = new Button("Limits of sequences. Cases of indeterminacy");
        
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