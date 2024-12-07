package com.mathapp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SubjectMathAnalysisUI{

    public VBox getMathAnalysisSubjectUI(){

        Label eleventhGradeLabel = new Label("Mathematical Analysis chapters for 11th grade");
        Button eleventhGradeButton = new Button("11th grade");
        Label twelthGradeLabel = new Label("Mathematical Analysis chapters for 12th grade");
        Button twelthGradeButton = new Button("12th grade");

        Label resultLabel = new Label();

        Button back = new Button("Back");

        eleventhGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        twelthGradeButton.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton, back, resultLabel);

        return root;
   }

}