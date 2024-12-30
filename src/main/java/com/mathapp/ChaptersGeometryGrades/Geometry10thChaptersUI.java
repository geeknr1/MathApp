package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade10.Geometry.chapter1;
import com.mathapp.grade10.Geometry.chapter2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a zecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry10thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a X-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry10thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Elements of trigonometry'");
        Button chapter1Button = new Button("Elements of trigonometry");
        Label chapter2Label = new Label("Let's learn about the 'Elements of analytical trigonometry'");
        Button chapter2Button = new Button("Elements of analytical trigonometry");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
    VBox chapter1Geometry10 = new VBox(10);
	chapter1 geometry1UIgeometry10 = new chapter1();
	Label chap1Geometry10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry10.getChildren().addAll(chap1Geometry10Label, geometry1UIgeometry10.getChapter1UIgeometry10Grade(stage));
	Scene chapter1SceneGeo10 = new Scene(chapter1Geometry10, 600, 800);
	primaryStage.setScene(chapter1SceneGeo10);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry10 = new VBox(10);
	chapter2 geometry2UIgeometry10 = new chapter2();
	Label chap2Geometry10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry10.getChildren().addAll(chap2Geometry10Label, geometry2UIgeometry10.getChapter2UIgeometry10Grade(stage));
	Scene chapter2SceneGeo10 = new Scene(chapter2Geometry10, 600, 800);
	primaryStage.setScene(chapter2SceneGeo10);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, back);

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