package com.mathapp.MathSubjects;

import com.mathapp.ChaptersGeometryGrades.Geometry10thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry5thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry6thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry7thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry8thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry9thChaptersUI;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta contine o lista cu butoanele claselor V - XII care duc catre capitolele fiecarei clase enumerate si care apartine de subiectul geometriei.
*/

public class SubjectGeometryUI{

    private static Stage primaryStage;

/**
 * Cea mai importanta functie built-in din aceasta metoda este reprezentata de 'setOnAction' al carei rol este sa creeze legatura dintre aceasta pagina din ui si pagina urmatoare care contine butoanele catre capitolele claselor V - XII care apartin geometriei
*/
    public Scene getGeometrySubjectUI(Stage stage){

        primaryStage = stage;

        Label geometryLabel = new Label("Welcome to Geometry ");
        geometryLabel.getStyleClass().add("label");

        Label fifthGradeLabel = new Label("Geometry chapters for the 5th grade");
        fifthGradeLabel.getStyleClass().add("label");
        Button fifthGradeButton = new Button("5th grade");
        fifthGradeButton.getStyleClass().add("button");
        Label sixthGradeLabel = new Label("Geometry chapters for the 6th grade");
        sixthGradeLabel.getStyleClass().add("label");
        Button sixthGradeButton = new Button("6th grade");
        sixthGradeButton.getStyleClass().add("button");
        Label seventhGradeLabel = new Label("Geometry chapters for the 7th grade");
        seventhGradeLabel.getStyleClass().add("label");
        Button seventhGradeButton = new Button("7th grade");
        seventhGradeButton.getStyleClass().add("button");
        Label eigthGradeLabel = new Label("Geometry chapters for the 8th grade");
        eigthGradeLabel.getStyleClass().add("label");
        Button eithGradeButton = new Button("8th grade");
        eithGradeButton.getStyleClass().add("button");
        Label ninthGradeLabel = new Label("Geometry chapters for the 9th grade");
        ninthGradeLabel.getStyleClass().add("label");
        Button ninthGradeButton = new Button("9th grade");
        ninthGradeButton.getStyleClass().add("button");
        Label tenthGradeLabel = new Label("Geometry chapters for 10th grade");
        tenthGradeLabel.getStyleClass().add("label");
        Button tenthGradeButton = new Button("10th grade");
        tenthGradeButton.getStyleClass().add("button");

        Label resultLabel = new Label();
        resultLabel.getStyleClass().add("label");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        fifthGradeButton.setOnAction(event->{
            Geometry5thChaptersUI fifthGradeUI = new Geometry5thChaptersUI();
            Scene fifthGradeScene = fifthGradeUI.getGeometry5thChaptersUI(stage);
            primaryStage.setScene(fifthGradeScene);
        });

        sixthGradeButton.setOnAction(event->{
            VBox sixthGrade = new VBox(10);
            Geometry6thChaptersUI sixthGradeUI = new Geometry6thChaptersUI();
            Label sixGradeLabel = new Label("Welcome to 6th grade in Geometry!");
            sixthGrade.getChildren().addAll(sixGradeLabel, sixthGradeUI.getGeometry6thChaptersUI(stage));
            Scene sixthGradeScene = new Scene(sixthGrade, 600, 800);
            primaryStage.setScene(sixthGradeScene);
        });

        seventhGradeButton.setOnAction(event->{
            VBox seventhGrade = new VBox(10);
            Geometry7thChaptersUI seventhGradeUI = new Geometry7thChaptersUI();
            Label sevenGradeLabel = new Label("Welcome to 7th grade in Geometry!");
            seventhGrade.getChildren().addAll(sevenGradeLabel, seventhGradeUI.getGeometry7thChaptersUI(stage));
            Scene seventhGradeScene = new Scene(seventhGrade, 600, 800);
            primaryStage.setScene(seventhGradeScene);
        });

        eithGradeButton.setOnAction(event->{
            VBox eithGrade = new VBox(10);
            Geometry8thChaptersUI eithGradeUI = new Geometry8thChaptersUI();
            Label eightGradeLabel = new Label("Welcome to 8th grade in Geometry!");
            eithGrade.getChildren().addAll(eightGradeLabel, eithGradeUI.getGeometry8thChaptersUI(stage));
            Scene eithGradeScene = new Scene(eithGrade, 600, 800);
            primaryStage.setScene(eithGradeScene);
        });

        ninthGradeButton.setOnAction(event->{
            VBox ninthGrade = new VBox(10);
            Geometry9thChaptersUI ninthGradeUI = new Geometry9thChaptersUI();
            Label nineGradeLabel = new Label("Welcome to 9th grade in Geometry!");
            ninthGrade.getChildren().addAll(nineGradeLabel, ninthGradeUI.getGeometry9thChaptersUI(stage));
            Scene ninthGradeScene = new Scene(ninthGrade, 600, 800);
            primaryStage.setScene(ninthGradeScene);
        });

        tenthGradeButton.setOnAction(event->{
            VBox tenthGrade = new VBox(10);
            Geometry10thChaptersUI tenthGradeUI = new Geometry10thChaptersUI();
            Label tenGradeLabel = new Label("Welcome to 10th grade in Geometry!");
            tenthGrade.getChildren().addAll(tenGradeLabel, tenthGradeUI.getGeometry10thChaptersUI(stage));
            Scene tenthGradeScene = new Scene(tenthGrade, 600, 800);
            primaryStage.setScene(tenthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(geometryLabel, fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, back, resultLabel);

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