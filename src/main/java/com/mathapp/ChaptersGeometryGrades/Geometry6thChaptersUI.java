package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade6.Geometry.chapter1;
import com.mathapp.grade6.Geometry.chapter2;
import com.mathapp.grade6.Geometry.chapter3;
import com.mathapp.grade6.Geometry.chapter4;
import com.mathapp.grade6.Geometry.chapter5;
import com.mathapp.grade6.Geometry.chapter6;
import com.mathapp.grade6.Geometry.chapter7;
import com.mathapp.grade6.Geometry.chapter8;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a sasea, fiecare capitol avand o eticheta si un buton de acces
 */

public class Geometry6thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a VI-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry6thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Angles'");
        Button chapter1Button = new Button("Angles");
        Label chapter2Label = new Label("Let's learn about 'Parallelism'");
        Button chapter2Button = new Button("Parallelism");
        Label chapter3Label = new Label("Let's learn about 'Perpendicularity'");
        Button chapter3Button = new Button("Perpendicularity");
        Label chapter4Label = new Label("Let's learn about the 'Circle'");
        Button chapter4Button = new Button("Circle");
        Label chapter5Label = new Label("Let's learn about the 'Triangle'");
        Button chapter5Button = new Button("Triangle");
        Label chapter6Label = new Label("Let's learn about the 'Important lines in triangles'");
        Button chapter6Button = new Button("Important lines in triangles");
        Label chapter7Label = new Label("Let's learn about the 'Congruence of triangles'");
        Button chapter7Button = new Button("Congruence of triangles");
        Label chapter8Label = new Label("Let's learn about the 'Properties of triangles'");
        Button chapter8Button = new Button("Properties of triangles");

        Button back = new Button("Back");


        chapter1Button.setOnAction(event->{
    VBox chapter1Geometry6 = new VBox(10);
	chapter1 geometry1UIgeometry6 = new chapter1();
	Label chap1Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry6.getChildren().addAll(chap1Geometry6Label, geometry1UIgeometry6.getChapter1UIgeometry6Grade(stage));
	Scene chapter1SceneGeo6 = new Scene(chapter1Geometry6, 600, 800);
	primaryStage.setScene(chapter1SceneGeo6);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry6 = new VBox(10);
	chapter2 geometry2UIgeometry6 = new chapter2();
	Label chap2Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry6.getChildren().addAll(chap2Geometry6Label, geometry2UIgeometry6.getChapter2UIgeometry6Grade(stage));
	Scene chapter2SceneGeo6 = new Scene(chapter2Geometry6, 600, 800);
	primaryStage.setScene(chapter2SceneGeo6);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Geometry6 = new VBox(10);
	chapter3 geometry3UIgeometry6 = new chapter3();
	Label chap3Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Geometry6.getChildren().addAll(chap3Geometry6Label, geometry3UIgeometry6.getChapter3UIgeometry6Grade(stage));
	Scene chapter3SceneGeo6 = new Scene(chapter3Geometry6, 600, 800);
	primaryStage.setScene(chapter3SceneGeo6);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Geometry6 = new VBox(10);
	chapter4 geometry4UIgeometry6 = new chapter4();
	Label chap4Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Geometry6.getChildren().addAll(chap4Geometry6Label, geometry4UIgeometry6.getChapter4UIgeometry6Grade(stage));
	Scene chapter4SceneGeo6 = new Scene(chapter4Geometry6, 600, 800);
	primaryStage.setScene(chapter4SceneGeo6);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Geometry6 = new VBox(10);
	chapter5 geometry5UIgeometry6 = new chapter5();
	Label chap5Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Geometry6.getChildren().addAll(chap5Geometry6Label, geometry5UIgeometry6.getChapter5UIgeometry6Grade(stage));
	Scene chapter5SceneGeo6 = new Scene(chapter5Geometry6, 600, 800);
	primaryStage.setScene(chapter5SceneGeo6);
        });

        chapter6Button.setOnAction(event->{
    VBox chapter6Geometry6 = new VBox(10);
	chapter6 geometry6UIgeometry6 = new chapter6();
	Label chap6Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter6Geometry6.getChildren().addAll(chap6Geometry6Label, geometry6UIgeometry6.getChapter6UIgeometry6Grade(stage));
	Scene chapter6SceneGeo6 = new Scene(chapter6Geometry6, 600, 800);
	primaryStage.setScene(chapter6SceneGeo6);
        });

        chapter7Button.setOnAction(event->{
    VBox chapter7Geometry6 = new VBox(10);
	chapter7 geometry7UIgeometry6 = new chapter7();
	Label chap7Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter7Geometry6.getChildren().addAll(chap7Geometry6Label, geometry7UIgeometry6.getChapter7UIgeometry6Grade(stage));
	Scene chapter7SceneGeo6 = new Scene(chapter7Geometry6, 600, 800);
	primaryStage.setScene(chapter7SceneGeo6);
        });

        chapter8Button.setOnAction(event->{
    VBox chapter8Geometry6 = new VBox(10);
	chapter8 geometry8UIgeometry6 = new chapter8();
	Label chap8Geometry6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter8Geometry6.getChildren().addAll(chap8Geometry6Label, geometry8UIgeometry6.getChapter8UIgeometry6Grade(stage));
	Scene chapter8SceneGeo6 = new Scene(chapter8Geometry6, 600, 800);
	primaryStage.setScene(chapter8SceneGeo6);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, back);

        return root;
   }
}