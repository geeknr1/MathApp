package com.mathapp.MathSubjects;

import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis11thChaptersUI;
import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis12thChaptersUI;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
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
    public Scene getMathAnalysisSubjectUI(Stage stage){

        primaryStage = stage;

        Label maLabel = new Label("Welcome to Mathematical Analysis");
        maLabel.getStyleClass().add("label");

        Label eleventhGradeLabel = new Label("Mathematical Analysis chapters for 11th grade");
        eleventhGradeLabel.getStyleClass().add("label");
        Button eleventhGradeButton = new Button("11th grade");
        eleventhGradeButton.getStyleClass().add("button");
        Label twelthGradeLabel = new Label("Mathematical Analysis chapters for 12th grade");
        twelthGradeLabel.getStyleClass().add("label");
        Button twelthGradeButton = new Button("12th grade");
        twelthGradeButton.getStyleClass().add("button");

        Label resultLabel = new Label();
        resultLabel.getStyleClass().add("label");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        eleventhGradeButton.setOnAction(event->{
            MathematicalAnalysis11thChaptersUI eleventhGradeUI = new MathematicalAnalysis11thChaptersUI();
            Scene eleventhGradeScene = eleventhGradeUI.getMathematicalAnalysis11thChaptersUI(stage);
            primaryStage.setScene(eleventhGradeScene);
        });

        twelthGradeButton.setOnAction(event->{
            VBox twelthGrade = new VBox(10);
            MathematicalAnalysis12thChaptersUI twelthGradeUI = new MathematicalAnalysis12thChaptersUI();
            Label twelveGradeLabel = new Label("Welcome to 8th grade in Mathematical Analysis!");
            twelthGrade.getChildren().addAll(twelveGradeLabel, twelthGradeUI.getMathematicalAnalysis12thChaptersUI(stage));
            Scene twelthGradeScene = new Scene(twelthGrade, 600, 800);
            primaryStage.setScene(twelthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(maLabel, eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton, back, resultLabel);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(580);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        
        VBox newRoot = new VBox(contentPane);
        Scene scene = new Scene(newRoot, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/mathsubjects.css").toExternalForm());

        return scene;
   }

}