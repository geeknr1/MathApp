package com.mathapp.grade5.Algebra;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class chapter5{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Drawing. Notation. Subunitary, equiunitary, superunitary fractions; percentages '");
        Button buttonLesson1 = new Button("Drawing. Notation. Subunitary, equiunitary, superunitary fractions; percentages");
        Label labelLesson2 = new Label("Let's learn more about the ' Equivalent fractions '");
        Button buttonLesson2 = new Button("Equivalent fractions");
        Label labelLesson3 = new Label("Let's learn more about the ' Comparison, ordering and placement on the axis '");
        Button buttonLesson3 = new Button("Comparison, ordering and placement on the axis");
        Label labelLesson4 = new Label("Let's learn more about ' Subtracting and inserting integers from / into the fraction '");
        Button buttonLesson4 = new Button("Subtracting and inserting integers from / into the fraction");
        Label labelLesson5 = new Label("Let's learn more about ' Amplifying and simplifying fractions '");
        Button buttonLesson5 = new Button("Amplifying and simplifying fractions");
        Label labelLesson6 = new Label("Let's learn more about ' Adding and subtracting ordinary fractions that have the same denominator '");
        Button buttonLesson6 = new Button("Adding and subtracting ordinary fractions that have the same denominator");
        Label labelLesson7 = new Label("Let's learn more about the ' The least common multiple of two natural numbers. Bringing two or more fractions to a common denominator '");
        Button buttonLesson7 = new Button("The least common multiple of two natural numbers. Bringing two or more fractions to a common denominator");
        Label labelLesson8 = new Label("Let's learn more about ' Adding and subtracting ordinary fractions that do not have the same denominator '");
        Button buttonLesson8 = new Button("Adding and subtracting ordinary fractions that do not have the same denominator");
        Label labelLesson9 = new Label("Let's learn more about ' Multiplying ordinary fractions '");
        Button buttonLesson9 = new Button("Multiplying ordinary fractions");
        Label labelLesson10 = new Label("Let's learn more about ' Obtaining a fraction from a random number '");
        Button buttonLesson10 = new Button("Obtaining a fraction from a random number");
        Label labelLesson11 = new Label("Let's learn more about ' Raising fractions to a power '");
        Button buttonLesson11 = new Button("Raising fractions to a power");
        Label labelLesson12 = new Label("Let's learn more about ' Dividing ordinary fractions '");
        Button buttonLesson12 = new Button("Dividing ordinary fractions");
        Label labelLesson13 = new Label("Let's learn more about the ' Order of operations '");
        Button buttonLesson13 = new Button("Order of operations");
        Label labelLesson14 = new Label("Let's learn more about ' Percentages '");
        Button buttonLesson14 = new Button("Percentages");

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

        buttonLesson11.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson12.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson13.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson14.setOnAction(event->{
            System.out.println("To be continued");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10, labelLesson11, buttonLesson11, labelLesson12, 
                                  buttonLesson12, labelLesson13, buttonLesson13, labelLesson14, buttonLesson14);

        return root;
    }
}