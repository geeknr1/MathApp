package com.mathapp.grade6.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter1{
    private static Stage primaryStage;

    public VBox getChapter1UIalgebra6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Sets: description, notations, element, membership relation '");
        Button buttonLesson1 = new Button("Sets: description, notations, element, membership relation");
        Label labelLesson2 = new Label("Let's learn more about ' Finite and infinite sets '");
        Button buttonLesson2 = new Button("Finite and infinite sets");
        Label labelLesson3 = new Label("Let's learn more about ' Relations between 2 subsets' and the 'Subset'");
        Button buttonLesson3 = new Button("Relations between 2 subsets. Subset");
        Label labelLesson4 = new Label("Let's learn more about ' Operations with sets '");
        Button buttonLesson4 = new Button("Operations with sets");
        
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4);

        return root;
    }
}