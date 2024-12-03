package com.mathapp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MathSubjectsUI{

    public VBox getMathSubjectsUI(){

        Label AlgebraLabel = new Label("Algebra curriculum for 5th - 12th grade.");
        Label GeometryLabel = new Label("Geometry curriculum for 5th - 12th grade");
        Label MathematicalAnalysisLabel = new Label("Mathematical Analysis curriculum for 5th - 12th grade");

        Label resultLabel = new Label();

        Button AlgebraButton = new Button("Algebra curriculum");
        Button GeometryButton = new Button("Geometry curriculum");
        Button MathematicalAnalysisButton = new Button("Mathematical Analysis curriculum");

        AlgebraButton.setOnAction(event->{
            SubjectAlgebraUI algebraUI = new SubjectAlgebraUI();
            Label algebraLabel = new Label();
        });

        GeometryButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        MathematicalAnalysisButton.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(AlgebraLabel, AlgebraButton, GeometryLabel, GeometryButton, MathematicalAnalysisLabel, MathematicalAnalysisButton, resultLabel);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Login Account");
        // primaryStage.show();


        return root;
   }

}