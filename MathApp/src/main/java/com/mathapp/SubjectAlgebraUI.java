package com.mathapp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SubjectAlgebraUI{

    public VBox getAlgebraChaptersUI(){

        Label fifthGradeLabel = new Label("Algebra chapters for the 5th grade");
        Button fifthGradeButton = new Button("5th grade");
        Label sixthGradeLabel = new Label("Algebra chapters for the 6th grade");
        Button sixthGradeButton = new Button("6th grade");
        Label seventhGradeLabel = new Label("Algebra chapters for the 7th grade");
        Button seventhGradeButton = new Button("7th grade");
        Label eigthGradeLabel = new Label("Algebra chapters for the 8th grade");
        Button eithGradeButton = new Button("8th grade");
        Label ninthGradeLabel = new Label("Algebra chapters for the 9th grade");
        Button ninthGradeButton = new Button("9th grade");
        Label tenthGradeLabel = new Label("Algebra chapters for 10th grade");
        Button tenthGradeButton = new Button("10th grade");
        Label eleventhGradeLabel = new Label("Algebra chapters for 11th grade");
        Button eleventhGradeButton = new Button("11th grade");
        Label twelthGradeLabel = new Label("Algebra chapters for 12th grade");
        Button twelthGradeButton = new Button("12th grade");

        Label resultLabel = new Label();

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
        root.getChildren().addAll(fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Login Account");
        // primaryStage.show();


        return root;
   }

}