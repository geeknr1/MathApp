package com.mathapp.grade10.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about 'Ordered Finite Sets' ; 'Permutations' ; 'Arrangements' and 'Combinations'");
        Button buttonLesson1 = new Button("Ordered Finite Sets. Permutations. Arrangements. Combinations");
        Label labelLesson2 = new Label("Let's learn more about the 'Counting Problems' and 'Probabilities'");
        Button buttonLesson2 = new Button("Counting Problems. Probabilities");
        Label labelLesson3 = new Label("Let's learn more about the ' Newton's Binomial '");
        Button buttonLesson3 = new Button("Newton's Binomial");
        
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