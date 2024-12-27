package com.mathapp.grade6.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter6{
    private static Stage primaryStage;

    public VBox getChapter6UIalgebra6Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about ' Rational numbers - writing forms, representations, comparison, ordering, modulus, opposite '");
        Button buttonLesson1 = new Button("Rational numbers - writing forms, representations, comparison, ordering, modulus, opposite");
        Label labelLesson2 = new Label("Let's learn more about 'Addition' and 'Subtraction'");
        Button buttonLesson2 = new Button("Addition and subtraction");
        Label labelLesson3 = new Label("Let's learn more about the ' Multiplication '");
        Button buttonLesson3 = new Button("Multiplication");
        Label labelLesson4 = new Label("Let's learn more about the 'Raising to power' and the 'Calculation rules'");
        Button buttonLesson4 = new Button("Raising to power. Calculation rules");
        Label labelLesson5 = new Label("Let's learn more about the ' Division '");
        Button buttonLesson5 = new Button("Division");
        Label labelLesson6 = new Label("Let's learn more about the ' Order of operations '");
        Button buttonLesson6 = new Button("Order of operations");
        Label labelLesson7 = new Label("Let's learn more about ' Equations '");
        Button buttonLesson7 = new Button("Equations");
        Label labelLesson8 = new Label("Let's learn more about ' Problems that can be solved with equations '");
        Button buttonLesson8 = new Button("Problems that can be solved with equations");
        
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

        buttonLesson8.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8);

        return root;
    }
}