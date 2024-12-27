package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade5.Geometry.chapter1;
import com.mathapp.grade5.Geometry.chapter2;
import com.mathapp.grade5.Geometry.chapter3;
import com.mathapp.grade5.Geometry.chapter4;
import com.mathapp.grade5.Geometry.chapter5;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a cincea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry5thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a V-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry5thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Point' + 'Straight line' + 'Plain'");
        Button chapter1Button = new Button("Point. Straight line. Plain.");
        Label chapter2Label = new Label("Let's learn about the 'Angle'");
        Button chapter2Button = new Button("Angle");
        Label chapter3Label = new Label("Let's learn about 'Congruent figures' + 'Simetry'");
        Button chapter3Button = new Button("Congruent figures. Simetry.");
        Label chapter4Label = new Label("Let's learn about the 'Measuring unit'");
        Button chapter4Button = new Button("Measuring unit");
        Label chapter5Label = new Label("Let's learn about 'Perimeters' + 'Surfaces' + 'Volumes'");
        Button chapter5Button = new Button("Perimeters. Surfaces. Volumes.");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Geometry5 = new VBox(10);
	chapter1 geometry1UIgeometry5 = new chapter1();
	Label chap1Geometry5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry5.getChildren().addAll(chap1Geometry5Label, geometry1UIgeometry5.getChapter1UIgeometry5Grade(stage));
	Scene chapter1SceneGeo5 = new Scene(chapter1Geometry5, 600, 800);
	primaryStage.setScene(chapter1SceneGeo5);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry5 = new VBox(10);
	chapter2 geometry2UIgeometry5 = new chapter2();
	Label chap2Geometry5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry5.getChildren().addAll(chap2Geometry5Label, geometry2UIgeometry5.getChapter2UIgeometry5Grade(stage));
	Scene chapter2SceneGeo5 = new Scene(chapter2Geometry5, 600, 800);
	primaryStage.setScene(chapter2SceneGeo5);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Geometry5 = new VBox(10);
	chapter3 geometry3UIgeometry5 = new chapter3();
	Label chap3Geometry5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Geometry5.getChildren().addAll(chap3Geometry5Label, geometry3UIgeometry5.getChapter3UIgeometry5Grade(stage));
	Scene chapter3SceneGeo5 = new Scene(chapter3Geometry5, 600, 800);
	primaryStage.setScene(chapter3SceneGeo5);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Geometry5 = new VBox(10);
	chapter4 geometry4UIgeometry5 = new chapter4();
	Label chap4Geometry5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Geometry5.getChildren().addAll(chap4Geometry5Label, geometry4UIgeometry5.getChapter4UIgeometry5Grade(stage));
	Scene chapter4SceneGeo5 = new Scene(chapter4Geometry5, 600, 800);
	primaryStage.setScene(chapter4SceneGeo5);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Geometry5 = new VBox(10);
	chapter5 geometry5UIgeometry5 = new chapter5();
	Label chap5Geometry5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Geometry5.getChildren().addAll(chap5Geometry5Label, geometry5UIgeometry5.getChapter5UIgeometry5Grade(stage));
	Scene chapter5SceneGeo5 = new Scene(chapter5Geometry5, 600, 800);
	primaryStage.setScene(chapter5SceneGeo5);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, back);

        return root;
   }

}