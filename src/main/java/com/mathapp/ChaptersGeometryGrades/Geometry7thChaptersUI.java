package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade7.Geometry.chapter1;
import com.mathapp.grade7.Geometry.chapter2;
import com.mathapp.grade7.Geometry.chapter3;
import com.mathapp.grade7.Geometry.chapter4;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a saptea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry7thChaptersUI{
    private static Stage primaryStage;

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a VII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry7thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Quadrilaterals'");
        Button chapter1Button = new Button("Quadrilaterals");
        Label chapter2Label = new Label("Let's learn about 'Surfaces and perimeters'");
        Button chapter2Button = new Button("Surfaces and perimeters");
        Label chapter3Label = new Label("Let's learn about the 'Similarity of triangles'");
        Button chapter3Button = new Button("Similarity of triangles");
        Label chapter4Label = new Label("Let's learn about 'Metric relations in right triangles'");
        Button chapter4Button = new Button("Metric relations in right triangles");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Geometry7 = new VBox(10);
	chapter1 geometry1UIgeometry7 = new chapter1();
	Label chap1Geometry7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry7.getChildren().addAll(chap1Geometry7Label, geometry1UIgeometry7.getChapter1UIgeometry7Grade(stage));
	Scene chapter1SceneGeo7 = new Scene(chapter1Geometry7, 600, 800);
	primaryStage.setScene(chapter1SceneGeo7);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry7 = new VBox(10);
	chapter2 geometry2UIgeometry7 = new chapter2();
	Label chap2Geometry7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry7.getChildren().addAll(chap2Geometry7Label, geometry2UIgeometry7.getChapter2UIgeometry7Grade(stage));
	Scene chapter2SceneGeo7 = new Scene(chapter2Geometry7, 600, 800);
	primaryStage.setScene(chapter2SceneGeo7);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Geometry7 = new VBox(10);
	chapter3 geometry3UIgeometry7 = new chapter3();
	Label chap3Geometry7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Geometry7.getChildren().addAll(chap3Geometry7Label, geometry3UIgeometry7.getChapter3UIgeometry7Grade(stage));
	Scene chapter3SceneGeo7 = new Scene(chapter3Geometry7, 600, 800);
	primaryStage.setScene(chapter3SceneGeo7);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Geometry7 = new VBox(10);
	chapter4 geometry4UIgeometry7 = new chapter4();
	Label chap4Geometry7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Geometry7.getChildren().addAll(chap4Geometry7Label, geometry4UIgeometry7.getChapter4UIgeometry7Grade(stage));
	Scene chapter4SceneGeo7 = new Scene(chapter4Geometry7, 600, 800);
	primaryStage.setScene(chapter4SceneGeo7);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}