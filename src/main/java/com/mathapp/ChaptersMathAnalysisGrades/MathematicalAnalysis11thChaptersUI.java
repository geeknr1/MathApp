package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;
import com.mathapp.grade11.Math_Analysis.chapter1;
import com.mathapp.grade11.Math_Analysis.chapter2;
import com.mathapp.grade11.Math_Analysis.chapter3;
import com.mathapp.grade11.Math_Analysis.chapter4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele analizei matematice in clasa a unsprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class MathematicalAnalysis11thChaptersUI{

    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de clasa a XI-a a analizei matematice, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public Scene getMathematicalAnalysis11thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Sequences of real numbers'");
        chapter1Label.getStyleClass().add("label");
        Button chapter1Button = new Button("Sequences of real numbers");
        chapter1Button.getStyleClass().add("button");
        Label chapter2Label = new Label("Let's learn about the 'Limits of functions'");
        chapter2Label.getStyleClass().add("label");
        Button chapter2Button = new Button("Limits of functions");
        chapter2Button.getStyleClass().add("button");
        Label chapter3Label = new Label("Let's learn about 'Continuous functions'");
        chapter3Label.getStyleClass().add("label");
        Button chapter3Button = new Button("Continuous functions");
        chapter3Button.getStyleClass().add("button");
        Label chapter4Label = new Label("Let's learn about 'Derivable functions'");
        chapter4Label.getStyleClass().add("label");
        Button chapter4Button = new Button("Derivable functions");
        chapter4Button.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");
        
        chapter1Button.setOnAction(event->{
	chapter1 ma1UIma11 = new chapter1();
	Scene chapter1SceneMA11 = ma1UIma11.getChapter1UImathanalysis11Grade(stage);
	primaryStage.setScene(chapter1SceneMA11);
        });

        chapter2Button.setOnAction(event->{
	chapter2 ma2UIma11 = new chapter2();
	Scene chapter2SceneMA11 = ma2UIma11.getChapter2UImathanalysis11Grade(stage);
	primaryStage.setScene(chapter2SceneMA11);
        });

        chapter3Button.setOnAction(event->{
	chapter3 ma3UIma11 = new chapter3();
	Scene chapter3SceneMA11 = ma3UIma11.getChapter3UImathanalysis11Grade(stage);
	primaryStage.setScene(chapter3SceneMA11);
        });

        chapter4Button.setOnAction(event->{
	chapter4 ma4UIma11 = new chapter4();
	Scene chapter4SceneMA11 = ma4UIma11.getChapter4UImathanalysis11Grade(stage);
	primaryStage.setScene(chapter4SceneMA11);
        });

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

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
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
   }

}