package com.mathapp.grade6.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Integer' and the 'Modulus of an integer'");
        Button buttonLesson1 = new Button("Integer. Modulus of an integer");
        Label labelLesson2 = new Label("Let's learn more about the 'Placement on the number line' and 'Comparing integers'");
        Button buttonLesson2 = new Button("Placement on the number line. Comparing integers");
        Label labelLesson3 = new Label("Let's learn more about the ' Addition and subtraction of integers '");
        Button buttonLesson3 = new Button("Addition and subtraction of integers");
        Label labelLesson4 = new Label("Let's learn more about the ' Multiplication of integers '");
        Button buttonLesson4 = new Button("Multiplication of integers");
        Label labelLesson5 = new Label("Let's learn more about the ' Division of integers '");
        Button buttonLesson5 = new Button("Division of integers");
        Label labelLesson6 = new Label("Let's learn more about the ' Power of an integer with a natural exponent '");
        Button buttonLesson6 = new Button("Power of an integer with a natural exponent");
        Label labelLesson7 = new Label("Let's learn more about the ' Order of operations with integers '");
        Button buttonLesson7 = new Button("Order of operations with integers");
        Label labelLesson8 = new Label("Let's learn more about ' Solving equations in the set of integers '");
        Button buttonLesson8 = new Button("Solving equations in the set of integers");
        Label labelLesson9 = new Label("Let's learn more about ' Solving inequalities in the set of integers '");
        Button buttonLesson9 = new Button("Solving inequalities in the set of integers");
        Label labelLesson10 = new Label("Let's learn more about ' Problems that can be solved using equations '");
        Button buttonLesson10 = new Button("Problems that can be solved using equations");

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

        buttonLesson9.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson10.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10);

        return root;
    }
}