package com.mathapp.MathSubjects;

import com.mathapp.ChaptersAlgebraGrades.Algebra10thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra11thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra12thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra5thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra6thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra7thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra8thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra9thChaptersUI;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SubjectAlgebraUI{

    private static Stage primaryStage;

    public VBox getAlgebraChaptersUI(Stage stage){

        primaryStage = stage;


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

        Button back = new Button("Back");

        fifthGradeButton.setOnAction(event->{
            VBox fifthGrade = new VBox(10);
            Algebra5thChaptersUI fifthGradeUI = new Algebra5thChaptersUI();
            Label fiveGradeLabel = new Label("Welcome to the 5th grade in Algebra!");
            fifthGrade.getChildren().addAll(fiveGradeLabel, fifthGradeUI.getAlgebra5thChaptersUI());
            Scene fifthGradeScene = new Scene(fifthGrade, 600, 800);
            primaryStage.setScene(fifthGradeScene);
        });

        sixthGradeButton.setOnAction(event->{
            VBox sixthGrade = new VBox(10);
            Algebra6thChaptersUI sixthGradeUI = new Algebra6thChaptersUI();
            Label sixGradeLabel = new Label("Welcome to 6th grade in Algebra!");
            sixthGrade.getChildren().addAll(sixGradeLabel, sixthGradeUI.getAlgebra6thChaptersUI());
            Scene sixthGradeScene = new Scene(sixthGrade, 600, 800);
            primaryStage.setScene(sixthGradeScene);
        });

        seventhGradeButton.setOnAction(event->{
            VBox seventhGrade = new VBox(10);
            Algebra7thChaptersUI seventhGradeUI = new Algebra7thChaptersUI();
            Label sevenGradeLabel = new Label("Welcome to 7th grade in Algebra!");
            seventhGrade.getChildren().addAll(sevenGradeLabel, seventhGradeUI.getAlgebra7thChaptersUI());
            Scene seventhGradeScene = new Scene(seventhGrade, 600, 800);
            primaryStage.setScene(seventhGradeScene);
        });

        eithGradeButton.setOnAction(event->{
            VBox eithGrade = new VBox(10);
            Algebra8thChaptersUI eithGradeUI = new Algebra8thChaptersUI();
            Label eightGradeLabel = new Label("Welcome to 8th grade in Algebra!");
            eithGrade.getChildren().addAll(eightGradeLabel, eithGradeUI.getAlgebra8thChaptersUI());
            Scene eithGradeScene = new Scene(eithGrade, 600, 800);
            primaryStage.setScene(eithGradeScene);
        });

        ninthGradeButton.setOnAction(event->{
            VBox ninthGrade = new VBox(10);
            Algebra9thChaptersUI ninthGradeUI = new Algebra9thChaptersUI();
            Label nineGradeLabel = new Label("Welcome to 9th grade in Algebra!");
            ninthGrade.getChildren().addAll(nineGradeLabel, ninthGradeUI.getAlgebra9thChaptersUI());
            Scene ninthGradeScene = new Scene(ninthGrade, 600, 800);
            primaryStage.setScene(ninthGradeScene);
        });

        tenthGradeButton.setOnAction(event->{
            VBox tenthGrade = new VBox(10);
            Algebra10thChaptersUI tenthGradeUI = new Algebra10thChaptersUI();
            Label tenGradeLabel = new Label("Welcome to 10th grade in Algebra!");
            tenthGrade.getChildren().addAll(tenGradeLabel, tenthGradeUI.getAlgebra10thChaptersUI());
            Scene tenthGradeScene = new Scene(tenthGrade, 600, 800);
            primaryStage.setScene(tenthGradeScene);
        });

        eleventhGradeButton.setOnAction(event->{
            VBox eleventhGrade = new VBox(10);
            Algebra11thChaptersUI eleventhGradeUI = new Algebra11thChaptersUI();
            Label elevenGradeLabel = new Label("Welcome to 11th grade in Algebra!");
            eleventhGrade.getChildren().addAll(elevenGradeLabel, eleventhGradeUI.getAlgebra11thChaptersUI());
            Scene eleventhGradeScene = new Scene(eleventhGrade, 600, 800);
            primaryStage.setScene(eleventhGradeScene);
        });

        twelthGradeButton.setOnAction(event->{
            VBox twelthGrade = new VBox(10);
            Algebra12thChaptersUI twelthGradeUI = new Algebra12thChaptersUI();
            Label twelveGradeLabel = new Label("Welcome to 8th grade in Algebra!");
            twelthGrade.getChildren().addAll(twelveGradeLabel, twelthGradeUI.getAlgebra12thChaptersUI());
            Scene twelthGradeScene = new Scene(twelthGrade, 600, 800);
            primaryStage.setScene(twelthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton, back, resultLabel);

        return root;
   }

}