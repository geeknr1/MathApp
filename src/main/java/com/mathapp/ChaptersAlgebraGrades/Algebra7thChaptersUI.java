package com.mathapp;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Algebra7thChaptersUI{

    public VBox getAlgebra7thChaptersUI(){

        Button chapter1Button = new Button("The set or real numbers");
        Button chapter2Button = new Button("Operations with real numbers");
        Button chapter3Button = new Button("Equations and systems of equations");
        Button chapter4Button = new Button("Data organization elements");


        // fifthGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // sixthGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // seventhGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // eithGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // ninthGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // tenthGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // eleventhGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        // twelthGradeButton.setOnAction(event->{
        //     MathApp.showMathSubjects();
        // });

        VBox root = new VBox(10);
        //root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, checkButton, resultLabel);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Login Account");
        // primaryStage.show();


        return root;
   }

}