package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade8.Geometry.chapter1;
import com.mathapp.grade8.Geometry.chapter2;
import com.mathapp.grade8.Geometry.chapter3;
import com.mathapp.grade8.Geometry.chapter4;
import com.mathapp.grade8.Geometry.chapter5;
import com.mathapp.grade8.Geometry.chapter6;
import com.mathapp.grade8.Geometry.chapter7;
import com.mathapp.grade8.Geometry.chapter8;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;


/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a opta, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry8thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a VIII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry8thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Relations between points, straight lines and planes'");
        Button chapter1Button = new Button("Relations between points, straight lines and planes");
        Label chapter2Label = new Label("Let's learn about 'Geometric bodies, in other words their representation, elements, development'");
        Button chapter2Button = new Button("Geometric bodies - representation, elements, development");
        Label chapter3Label = new Label("Let's learn about 'Parallelism'");
        Button chapter3Button = new Button("Parallelism");
        Label chapter4Label = new Label("Let's learn about 'Perpendicularity'");
        Button chapter4Button = new Button("Perpendicularity");
        Label chapter5Label = new Label("Let's learn about 'Orthogonal projections on a plane'");
        Button chapter5Button = new Button("Orthogonal projections on a plane");
        Label chapter6Label = new Label("Let's learn about 'Theorem of the 3 perpendiculars + Distances'");
        Button chapter6Button = new Button("Theorem of the 3 perpendiculars. Distances");
        Label chapter7Label = new Label("Let's learn about the 'Calculation areas and volumes for polyhedra'");
        Button chapter7Button = new Button("Calculating areas and volumes for polyhedra");
        Label chapter8Label = new Label("Let's learn about 'Formulas'");
        Button chapter8Button = new Button("Formulas");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Geometry8 = new VBox(10);
	chapter1 geometry1UIgeometry8 = new chapter1();
	Label chap1Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry8.getChildren().addAll(chap1Geometry8Label, geometry1UIgeometry8.getChapter1UIgeometry8Grade(stage));
	Scene chapter1SceneGeo8 = new Scene(chapter1Geometry8, 600, 800);
	primaryStage.setScene(chapter1SceneGeo8);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry8 = new VBox(10);
	chapter2 geometry2UIgeometry8 = new chapter2();
	Label chap2Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry8.getChildren().addAll(chap2Geometry8Label, geometry2UIgeometry8.getChapter2UIgeometry8Grade(stage));
	Scene chapter2SceneGeo8 = new Scene(chapter2Geometry8, 600, 800);
	primaryStage.setScene(chapter2SceneGeo8);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Geometry8 = new VBox(10);
	chapter3 geometry3UIgeometry8 = new chapter3();
	Label chap3Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Geometry8.getChildren().addAll(chap3Geometry8Label, geometry3UIgeometry8.getChapter3UIgeometry8Grade(stage));
	Scene chapter3SceneGeo8 = new Scene(chapter3Geometry8, 600, 800);
	primaryStage.setScene(chapter3SceneGeo8);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Geometry8 = new VBox(10);
	chapter4 geometry4UIgeometry8 = new chapter4();
	Label chap4Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Geometry8.getChildren().addAll(chap4Geometry8Label, geometry4UIgeometry8.getChapter4UIgeometry8Grade(stage));
	Scene chapter4SceneGeo8 = new Scene(chapter4Geometry8, 600, 800);
	primaryStage.setScene(chapter4SceneGeo8);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Geometry8 = new VBox(10);
	chapter5 geometry5UIgeometry8 = new chapter5();
	Label chap5Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Geometry8.getChildren().addAll(chap5Geometry8Label, geometry5UIgeometry8.getChapter5UIgeometry8Grade(stage));
	Scene chapter5SceneGeo8 = new Scene(chapter5Geometry8, 600, 800);
	primaryStage.setScene(chapter5SceneGeo8);
        });

        chapter6Button.setOnAction(event->{
    VBox chapter6Geometry8 = new VBox(10);
	chapter6 geometry6UIgeometry8 = new chapter6();
	Label chap6Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter6Geometry8.getChildren().addAll(chap6Geometry8Label, geometry6UIgeometry8.getChapter6UIgeometry8Grade(stage));
	Scene chapter6SceneGeo8 = new Scene(chapter6Geometry8, 600, 800);
	primaryStage.setScene(chapter6SceneGeo8);
        });

        chapter7Button.setOnAction(event->{
    VBox chapter7Geometry8 = new VBox(10);
	chapter7 geometry7UIgeometry8 = new chapter7();
	Label chap7Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter7Geometry8.getChildren().addAll(chap7Geometry8Label, geometry7UIgeometry8.getChapter7UIgeometry8Grade(stage));
	Scene chapter7SceneGeo8 = new Scene(chapter7Geometry8, 600, 800);
	primaryStage.setScene(chapter7SceneGeo8);
        });

        chapter8Button.setOnAction(event->{
    VBox chapter8Geometry8 = new VBox(10);
	chapter8 geometry8UIgeometry8 = new chapter8();
	Label chap8Geometry8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter8Geometry8.getChildren().addAll(chap8Geometry8Label, geometry8UIgeometry8.getChapter8UIgeometry8Grade(stage));
	Scene chapter8SceneGeo8 = new Scene(chapter8Geometry8, 600, 800);
	primaryStage.setScene(chapter8SceneGeo8);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, back);

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

        return new VBox(contentPane);
   }

}