package com.mathapp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SubjectGeometryUI{

    public VBox getMathSubjectsUI(){

        Label fifthGradeLabel = new Label("Geometry chapters for the 5th grade");
        Label sixthGradeLabel = new Label("Geometry chapters for the 6th grade");
        Label seventhGradeLabel = new Label("Geometry chapters for the 7th grade");
        Label eigthGradeLabel = new Label("Geometry chapters for the 8th grade");
        Label ninthGradeLabel = new Label("Geometry chapters for the 9th grade");
        Label tenthGradeLabel = new Label("Geometry chapters for 10th grade");

        Label resultLabel = new Label();

        Button fifthGradeButton = new Button("5th grade");
        Button sixthGradeButton = new Button("6th grade");
        Button seventhGradeButton = new Button("7th grade");
        Button eithGradeButton = new Button("8th grade");
        Button ninthGradeButton = new Button("9th grade");
        Button tenthGradeButton = new Button("10th grade");


        fifthGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        sixthGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        seventhGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        eithGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        ninthGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        tenthGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });


        VBox root = new VBox(10);
        //root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, checkButton, resultLabel);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Login Account");
        // primaryStage.show();


        return root;
   }

}