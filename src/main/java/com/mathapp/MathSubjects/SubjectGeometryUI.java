package com.mathapp.MathSubjects;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SubjectGeometryUI{

    public VBox getGeometrySubjectUI(){

        Label fifthGradeLabel = new Label("Geometry chapters for the 5th grade");
        Button fifthGradeButton = new Button("5th grade");
        Label sixthGradeLabel = new Label("Geometry chapters for the 6th grade");
        Button sixthGradeButton = new Button("6th grade");
        Label seventhGradeLabel = new Label("Geometry chapters for the 7th grade");
        Button seventhGradeButton = new Button("7th grade");
        Label eigthGradeLabel = new Label("Geometry chapters for the 8th grade");
        Button eithGradeButton = new Button("8th grade");
        Label ninthGradeLabel = new Label("Geometry chapters for the 9th grade");
        Button ninthGradeButton = new Button("9th grade");
        Label tenthGradeLabel = new Label("Geometry chapters for 10th grade");
        Button tenthGradeButton = new Button("10th grade");

        Label resultLabel = new Label();

        Button back = new Button("Back");

        fifthGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        sixthGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        seventhGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        eithGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        ninthGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        tenthGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, back, resultLabel);

        return root;
   }

}