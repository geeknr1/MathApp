package com.mathapp.grade12.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIalgebra12Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Composition laws' and the 'Modulo n operations'");
        Button buttonLesson1 = new Button("Composition laws. Modulo n operations");
        Label labelLesson2 = new Label("Let's learn more about the ' Properties of composition laws '");
        Button buttonLesson2 = new Button("Properties of composition laws");
        Label labelLesson3 = new Label("Let's learn more about ' Monoids '");
        Button buttonLesson3 = new Button("Monoids");
        Label labelLesson4 = new Label("Let's learn more about 'Groups' and 'Finite groups'");
        Button buttonLesson4 = new Button("Groups. Finite groups");
        Label labelLesson5 = new Label("Let's learn more about ' Subgroups '");
        Button buttonLesson5 = new Button("Subgroups");
        Label labelLesson6 = new Label("Let's learn more about the ' Morphisms and isomorphisms of groups '");
        Button buttonLesson6 = new Button("Morphisms and isomorphisms of groups");
        
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