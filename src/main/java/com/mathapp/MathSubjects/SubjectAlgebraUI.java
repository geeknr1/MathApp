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
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta contine o lista cu butoanele claselor V - XII care duc catre capitolele fiecarei clase enumerate si care apartine de subiectul algebrei.
*/
public class SubjectAlgebraUI{

    private static Stage primaryStage;

/**
 * Cea mai importanta functie built-in din aceasta metoda este reprezentata de 'setOnAction' al carei rol este sa creeze legatura dintre aceasta pagina din ui si pagina urmatoare care contine butoanele catre capitolele claselor V - XII care apartin algebrei
*/
    public Scene getAlgebraChaptersUI(Stage stage){

        primaryStage = stage;

        Label algebraLabel = new Label("Welcome to Algebra ");
        algebraLabel.getStyleClass().add("label");

        Label fifthGradeLabel = new Label("Algebra chapters for the 5th grade");
        fifthGradeLabel.getStyleClass().add("label");
        Button fifthGradeButton = new Button("5th grade");
        fifthGradeButton.getStyleClass().add("button");
        Label sixthGradeLabel = new Label("Algebra chapters for the 6th grade");
        sixthGradeLabel.getStyleClass().add("label");
        Button sixthGradeButton = new Button("6th grade");
        sixthGradeButton.getStyleClass().add("button");
        Label seventhGradeLabel = new Label("Algebra chapters for the 7th grade");
        seventhGradeLabel.getStyleClass().add("label");
        Button seventhGradeButton = new Button("7th grade");
        seventhGradeButton.getStyleClass().add("button");
        Label eigthGradeLabel = new Label("Algebra chapters for the 8th grade");
        eigthGradeLabel.getStyleClass().add("label");
        Button eithGradeButton = new Button("8th grade");
        eithGradeButton.getStyleClass().add("button");
        Label ninthGradeLabel = new Label("Algebra chapters for the 9th grade");
        ninthGradeLabel.getStyleClass().add("label");
        Button ninthGradeButton = new Button("9th grade");
        ninthGradeButton.getStyleClass().add("button");
        Label tenthGradeLabel = new Label("Algebra chapters for 10th grade");
        tenthGradeLabel.getStyleClass().add("label");
        Button tenthGradeButton = new Button("10th grade");
        tenthGradeButton.getStyleClass().add("button");
        Label eleventhGradeLabel = new Label("Algebra chapters for 11th grade");
        eleventhGradeLabel.getStyleClass().add("label");
        Button eleventhGradeButton = new Button("11th grade");
        eleventhGradeButton.getStyleClass().add("button");
        Label twelthGradeLabel = new Label("Algebra chapters for 12th grade");
        twelthGradeLabel.getStyleClass().add("label");
        Button twelthGradeButton = new Button("12th grade");
        twelthGradeButton.getStyleClass().add("button");

        Label resultLabel = new Label();
        resultLabel.getStyleClass().add("label");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        fifthGradeButton.setOnAction(event->{
            Algebra5thChaptersUI fifthGradeUI = new Algebra5thChaptersUI();
            Scene fifthGradeScene = fifthGradeUI.getAlgebra5thChaptersUI(stage);
            primaryStage.setScene(fifthGradeScene);
        });

        sixthGradeButton.setOnAction(event->{
            Algebra6thChaptersUI sixthGradeUI = new Algebra6thChaptersUI();
            Scene sixthGradeScene = sixthGradeUI.getAlgebra6thChaptersUI(stage);
            primaryStage.setScene(sixthGradeScene);
        });

        seventhGradeButton.setOnAction(event->{
            VBox seventhGrade = new VBox(10);
            Algebra7thChaptersUI seventhGradeUI = new Algebra7thChaptersUI();
            Label sevenGradeLabel = new Label("Welcome to 7th grade in Algebra!");
            seventhGrade.getChildren().addAll(sevenGradeLabel, seventhGradeUI.getAlgebra7thChaptersUI(stage));
            Scene seventhGradeScene = new Scene(seventhGrade, 600, 800);
            primaryStage.setScene(seventhGradeScene);
        });

        eithGradeButton.setOnAction(event->{
            VBox eithGrade = new VBox(10);
            Algebra8thChaptersUI eithGradeUI = new Algebra8thChaptersUI();
            Label eightGradeLabel = new Label("Welcome to 8th grade in Algebra!");
            eithGrade.getChildren().addAll(eightGradeLabel, eithGradeUI.getAlgebra8thChaptersUI(stage));
            Scene eithGradeScene = new Scene(eithGrade, 600, 800);
            primaryStage.setScene(eithGradeScene);
        });

        ninthGradeButton.setOnAction(event->{
            VBox ninthGrade = new VBox(10);
            Algebra9thChaptersUI ninthGradeUI = new Algebra9thChaptersUI();
            Label nineGradeLabel = new Label("Welcome to 9th grade in Algebra!");
            ninthGrade.getChildren().addAll(nineGradeLabel, ninthGradeUI.getAlgebra9thChaptersUI(stage));
            Scene ninthGradeScene = new Scene(ninthGrade, 600, 800);
            primaryStage.setScene(ninthGradeScene);
        });

        tenthGradeButton.setOnAction(event->{
            VBox tenthGrade = new VBox(10);
            Algebra10thChaptersUI tenthGradeUI = new Algebra10thChaptersUI();
            Label tenGradeLabel = new Label("Welcome to 10th grade in Algebra!");
            tenthGrade.getChildren().addAll(tenGradeLabel, tenthGradeUI.getAlgebra10thChaptersUI(stage));
            Scene tenthGradeScene = new Scene(tenthGrade, 600, 800);
            primaryStage.setScene(tenthGradeScene);
        });

        eleventhGradeButton.setOnAction(event->{
            VBox eleventhGrade = new VBox(10);
            Algebra11thChaptersUI eleventhGradeUI = new Algebra11thChaptersUI();
            Label elevenGradeLabel = new Label("Welcome to 11th grade in Algebra!");
            eleventhGrade.getChildren().addAll(elevenGradeLabel, eleventhGradeUI.getAlgebra11thChaptersUI(stage));
            Scene eleventhGradeScene = new Scene(eleventhGrade, 600, 800);
            primaryStage.setScene(eleventhGradeScene);
        });

        twelthGradeButton.setOnAction(event->{
            VBox twelthGrade = new VBox(10);
            Algebra12thChaptersUI twelthGradeUI = new Algebra12thChaptersUI();
            Label twelveGradeLabel = new Label("Welcome to 8th grade in Algebra!");
            twelthGrade.getChildren().addAll(twelveGradeLabel, twelthGradeUI.getAlgebra12thChaptersUI(stage));
            Scene twelthGradeScene = new Scene(twelthGrade, 600, 800);
            primaryStage.setScene(twelthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(algebraLabel, fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, eleventhGradeLabel, eleventhGradeButton, twelthGradeLabel, twelthGradeButton, back, resultLabel);

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