package com.mathapp.grade7.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Cartesian product of two nonempty sets '");
        Button buttonLesson1 = new Button("Cartesian product of two nonempty sets");
        Label labelLesson2 = new Label("Let's learn more about the 'Orthogonal axes system' ; the 'Representation of a point in a plane' and the 'Distance between two points'");
        Button buttonLesson2 = new Button("Orthogonal axes system. Representation of a point in the plane. Distance between two points");
        Label labelLesson3 = new Label("Let's learn more about 'Functional dependencies' ; 'Graphs' ; 'Diagrams' ; 'Tables' and the 'Frequency polygon'");
        Button buttonLesson3 = new Button("Functional dependencies. Graphs, diagrams, tables. Frequency polygon");

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