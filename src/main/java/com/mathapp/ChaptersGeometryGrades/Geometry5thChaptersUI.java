package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade5.Geometry.chapter1;
import com.mathapp.grade5.Geometry.chapter2;
import com.mathapp.grade5.Geometry.chapter3;
import com.mathapp.grade5.Geometry.chapter4;
import com.mathapp.grade5.Geometry.chapter5;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a cincea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry5thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a V-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public Scene getGeometry5thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Point' + 'Straight line' + 'Plain'");
        chapter1Label.getStyleClass().add("label");
        Button chapter1Button = new Button("Point. Straight line. Plain.");
        chapter1Button.getStyleClass().add("button");
        Label chapter2Label = new Label("Let's learn about the 'Angle'");
        chapter2Label.getStyleClass().add("label");
        Button chapter2Button = new Button("Angle");
        chapter2Button.getStyleClass().add("button");
        Label chapter3Label = new Label("Let's learn about 'Congruent figures' + 'Simetry'");
        chapter3Label.getStyleClass().add("label");
        Button chapter3Button = new Button("Congruent figures. Simetry.");
        chapter3Button.getStyleClass().add("button");
        Label chapter4Label = new Label("Let's learn about the 'Measuring unit'");
        chapter4Label.getStyleClass().add("label");
        Button chapter4Button = new Button("Measuring unit");
        chapter4Button.getStyleClass().add("button");
        Label chapter5Label = new Label("Let's learn about 'Perimeters' + 'Surfaces' + 'Volumes'");
        chapter5Label.getStyleClass().add("label");
        Button chapter5Button = new Button("Perimeters. Surfaces. Volumes.");
        chapter5Button.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        chapter1Button.setOnAction(event->{
	chapter1 geometry1UIgeometry5 = new chapter1();
	Scene chapter1SceneGeo5 = geometry1UIgeometry5.getChapter1UIgeometry5Grade(stage);
	primaryStage.setScene(chapter1SceneGeo5);
        });

        chapter2Button.setOnAction(event->{
	chapter2 geometry2UIgeometry5 = new chapter2();
	Scene chapter2SceneGeo5 = geometry2UIgeometry5.getChapter2UIgeometry5Grade(stage);
	primaryStage.setScene(chapter2SceneGeo5);
        });

        chapter3Button.setOnAction(event->{
	chapter3 geometry3UIgeometry5 = new chapter3();
	Scene chapter3SceneGeo5 = geometry3UIgeometry5.getChapter3UIgeometry5Grade(stage);
	primaryStage.setScene(chapter3SceneGeo5);
        });

        chapter4Button.setOnAction(event->{
	chapter4 geometry4UIgeometry5 = new chapter4();
	Scene chapter4SceneGeo5 = geometry4UIgeometry5.getChapter4UIgeometry5Grade(stage);
	primaryStage.setScene(chapter4SceneGeo5);
        });

        chapter5Button.setOnAction(event->{
	chapter5 geometry5UIgeometry5 = new chapter5();
	Scene chapter5SceneGeo5 = geometry5UIgeometry5.getChapter5UIgeometry5Grade(stage);
	primaryStage.setScene(chapter5SceneGeo5);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, back);

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
        scene.getStylesheets().add(getClass().getResource("/styles/geometry/5thGrade.css").toExternalForm());

        return scene;
   }

}