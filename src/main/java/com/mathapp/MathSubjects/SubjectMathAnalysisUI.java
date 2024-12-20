package com.mathapp.MathSubjects;

import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis11thChaptersUI;
import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis12thChaptersUI;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta contine o lista cu butoanele claselor V - XII care duc catre capitolele fiecarei clase enumerate si care apartine de subiectul analizei matematice.
*/

public class SubjectMathAnalysisUI{

    private static Stage primaryStage;

/**
 * Cea mai importanta functie built-in din aceasta metoda este reprezentata de 'setOnAction' al carei rol este sa creeze legatura dintre aceasta pagina din ui si pagina urmatoare care contine butoanele catre capitolele claselor V - XII care apartin analizei matematice
*/
    public VBox getMathAnalysisSubjectUI(Stage stage){

        primaryStage = stage;

        Label eleventhGradeLabel = new Label("Mathematical Analysis chapters for 11th grade");
        Button eleventhGradeButton = new Button("11th grade");
        Label twelthGradeLabel = new Label("Mathematical Analysis chapters for 12th grade");
        Button twelthGradeButton = new Button("12th grade");

        Label resultLabel = new Label();

        Button back = new Button("Back");

        eleventhGradeButton.setOnAction(event->{
            VBox eleventhGrade = new VBox(10);
            MathematicalAnalysis11thChaptersUI eleventhGradeUI = new MathematicalAnalysis11thChaptersUI();
            Label elevenGradeLabel = new Label("Welcome to 11th grade in Mathematical Analysis!");
            eleventhGrade.getChildren().addAll(elevenGradeLabel, eleventhGradeUI.getMathematicalAnalysis11thChaptersUI());
            Scene eleventhGradeScene = new Scene(eleventhGrade, 600, 800);
            primaryStage.setScene(eleventhGradeScene);
        });

        twelthGradeButton.setOnAction(event->{
            VBox twelthGrade = new VBox(10);
            MathematicalAnalysis12thChaptersUI twelthGradeUI = new MathematicalAnalysis12thChaptersUI();
            Label twelveGradeLabel = new Label("Welcome to 8th grade in Mathematical Analysis!");
            twelthGrade.getChildren().addAll(twelveGradeLabel, twelthGradeUI.getMathematicalAnalysis12thChaptersUI());
            Scene twelthGradeScene = new Scene(twelthGrade, 600, 800);
            primaryStage.setScene(twelthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton, back, resultLabel);

        return root;
   }

}