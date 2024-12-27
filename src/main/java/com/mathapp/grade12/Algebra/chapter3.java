package com.mathapp.grade12.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter3{
    private static Stage primaryStage;

    public VBox getChapter3UIalgebra12Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Algebraic form of a polynomial' ; the 'Degree of a polynomial' ; the 'Operations with polynomials (addition, multiplication)' and the 'Roots of a polynomial'");
        Button buttonLesson1 = new Button("Algebraic form of a polynomial. Degree of a polynomial. Operations with polynomials (addition, multiplication). Roots of a polynomial");
        Label labelLesson2 = new Label("Let's learn more about the 'Theorem of division with remainder' ; the 'Division of polynomials' ; the 'Remainder theorem' and 'Horner's scheme'");
        Button buttonLesson2 = new Button("Theorem of division with remainder. Division of polynomials. Remainder theorem. Horner's scheme");
        Label labelLesson3 = new Label("Let's learn more about the 'Multiple roots' ; the 'Irreducible polynomials' and the 'Irreducible factorization'");
        Button buttonLesson3 = new Button("Multiple roots. Irreducible polynomials. Irreducible factorization");
        Label labelLesson4 = new Label("Let's learn more about the ' Divisibility of polynomials '");
        Button buttonLesson4 = new Button("Divisibility of polynomials");
        Label labelLesson5 = new Label("Let's learn more about ' Viete's relations '");
        Button buttonLesson5 = new Button("Viete's relations");
        Label labelLesson6 = new Label("Let's learn more about the 'Polynomials with real coefficients' ; the 'Polynomials with rational coefficients' ; and the 'Polynomials with integer coefficients'");
        Button buttonLesson6 = new Button("Polynomials with real coefficients. Polynomials with rational coefficients. Polynomials with integer coefficients");
        Label labelLesson7 = new Label("Let's learn more about the ' Higher degree algebraic equations '");
        Button buttonLesson7 = new Button("Higher degree algebraic equations");
        
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7);

        return root;
    }
}