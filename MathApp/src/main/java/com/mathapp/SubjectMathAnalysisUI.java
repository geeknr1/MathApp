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

        eleventhGradeButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        twelthGradeButton.setOnAction(event->{
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