package com.mathapp.MostImportantUIs;

import com.mathapp.MathApp;
import com.mathapp.MathSubjects.SubjectAlgebraUI;
import com.mathapp.MathSubjects.SubjectGeometryUI;
import com.mathapp.MathSubjects.SubjectMathAnalysisUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MathSubjectsUI{

    private static Stage primaryStage;

    public VBox getMathSubjectsUI(Stage stage){

        primaryStage = stage;
        Label AlgebraLabel = new Label("Algebra curriculum for 5th - 12th grade.");
        Label GeometryLabel = new Label("Geometry curriculum for 5th - 12th grade");
        Label MathematicalAnalysisLabel = new Label("Mathematical Analysis curriculum for 5th - 12th grade");

        Label resultLabel = new Label();

        Button AlgebraButton = new Button("Algebra curriculum");
        Button GeometryButton = new Button("Geometry curriculum");
        Button MathematicalAnalysisButton = new Button("Mathematical Analysis curriculum");
        Button disconnect = new Button("Quit");

        AlgebraButton.setOnAction(event->{
            VBox algebra = new VBox(10);
            SubjectAlgebraUI algebraUI = new SubjectAlgebraUI();
            Label algebraLabel = new Label("Welcome to algebra ");
            algebra.getChildren().addAll(algebraLabel, algebraUI.getAlgebraChaptersUI(primaryStage));
            Scene algebraScene = new Scene(algebra, 600, 800);
            primaryStage.setScene(algebraScene);

        });

        GeometryButton.setOnAction(event->{
            VBox geometry = new VBox(10);
            SubjectGeometryUI geometryUI = new SubjectGeometryUI();
            Label geometryLabel = new Label("Welcome to geometry.");
            geometry.getChildren().addAll(geometryLabel, geometryUI.getGeometrySubjectUI(primaryStage));
            Scene geometryScene = new Scene(geometry, 600, 800);
            primaryStage.setScene(geometryScene);
        });

        MathematicalAnalysisButton.setOnAction(event->{
            VBox mathematicalAnalysis = new VBox(10);
            SubjectMathAnalysisUI mathAnalysisUI = new SubjectMathAnalysisUI();
            Label mathAnalysisLabel = new Label("Welcome to Mathematical Analysis.");
            mathematicalAnalysis.getChildren().addAll(mathAnalysisLabel, mathAnalysisUI.getMathAnalysisSubjectUI(primaryStage));
            Scene mathAnalysisScene = new Scene(mathematicalAnalysis, 600, 800);
            primaryStage.setScene(mathAnalysisScene);
        });

        disconnect.setOnAction(event->{
            MathApp.showLogIn();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(AlgebraLabel, AlgebraButton, GeometryLabel, GeometryButton, MathematicalAnalysisLabel, MathematicalAnalysisButton, disconnect, resultLabel);

        return root;
   }

}