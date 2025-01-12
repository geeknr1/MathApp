package com.mathapp.MostImportantUIs;

import com.mathapp.MathApp;
import com.mathapp.MathSubjects.SubjectAlgebraUI;
import com.mathapp.MathSubjects.SubjectGeometryUI;
import com.mathapp.MathSubjects.SubjectMathAnalysisUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta ne arata interfata cu subiectele matematicii care vor fi studiate in cadrul acestei aplicatii
 */
public class MathSubjectsUI{

    private static Stage primaryStage;

/**
 * In cadrul acestei metode se returneaza scena care afiseaza interfata paginii care duce catre curriculumul algebrei / geometriei / analizei matematice, subiecte din cadrul matematicii care va fi studiata in cele ce urmeaza.
 */
    public Scene getMathSubjectsUI(Stage stage){

        primaryStage = stage;
        Label AlgebraLabel = new Label("Algebra curriculum for 5th - 12th grade.");
        AlgebraLabel.getStyleClass().add("label");
        Label GeometryLabel = new Label("Geometry curriculum for 5th - 12th grade");
        GeometryLabel.getStyleClass().add("label");
        Label MathematicalAnalysisLabel = new Label("Mathematical Analysis curriculum for 5th - 12th grade");
        MathematicalAnalysisLabel.getStyleClass().add("label");

        Label resultLabel = new Label();

        Button AlgebraButton = new Button("Algebra curriculum");
        AlgebraButton.getStyleClass().add("button");
        Button GeometryButton = new Button("Geometry curriculum");
        GeometryButton.getStyleClass().add("button");
        Button MathematicalAnalysisButton = new Button("Mathematical Analysis curriculum");
        MathematicalAnalysisButton.getStyleClass().add("button");
        Button mathMemes = new Button("Math Memes :)");
        Button disconnect = new Button("Quit");
        disconnect.getStyleClass().add("button");

        AlgebraButton.setOnAction(event->{
            SubjectAlgebraUI algebraUI = new SubjectAlgebraUI();
            Scene algebraScene = algebraUI.getAlgebraChaptersUI(primaryStage);
            primaryStage.setScene(algebraScene);

        });

        GeometryButton.setOnAction(event->{
            SubjectGeometryUI geometryUI = new SubjectGeometryUI();
            Scene geometryScene = geometryUI.getGeometrySubjectUI(primaryStage);
            primaryStage.setScene(geometryScene);
        });

        MathematicalAnalysisButton.setOnAction(event->{
            SubjectMathAnalysisUI mathAnalysisUI = new SubjectMathAnalysisUI();
            Scene mathAnalysisScene = mathAnalysisUI.getMathAnalysisSubjectUI(primaryStage);
            primaryStage.setScene(mathAnalysisScene);
        });

        mathMemes.setOnAction(event->{
            MemeUI memesUI = new MemeUI();
            Scene memeScene = memesUI.getMemeListUI(primaryStage);
            primaryStage.setScene(memeScene);
        });

        disconnect.setOnAction(event->{
            MathApp.showLogIn();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(AlgebraLabel, AlgebraButton, GeometryLabel, GeometryButton, MathematicalAnalysisLabel, MathematicalAnalysisButton, mathMemes, disconnect, resultLabel);

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

   public static void showMathSubjectsUI(){
    MathSubjectsUI mathSubjectsUI = new MathSubjectsUI();
    Scene subjectsScene = mathSubjectsUI.getMathSubjectsUI(primaryStage);
    primaryStage.setScene(subjectsScene);
   }

}