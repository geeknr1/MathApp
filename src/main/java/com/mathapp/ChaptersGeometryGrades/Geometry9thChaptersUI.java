package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;
import com.mathapp.grade9.Geometry.chapter1;
import com.mathapp.grade9.Geometry.chapter2;
import com.mathapp.grade9.Geometry.chapter3;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a noua, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry9thChaptersUI{

    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a IX-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry9thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Elements of vector calculus in the plane'");
        Button chapter1Button = new Button("Elements of vector calculus in the plane");
        Label chapter2Label = new Label("Let's learn about the 'Elements of trigonometry'");
        Button chapter2Button = new Button("Elements of trigonometry");
        Label chapter3Label = new Label("Let's learn about the 'Applications of trigonometry in plane geometry'");
        Button chapter3Button = new Button("Applications of trigonometry in plane geometry");

        Button back = new Button("Back");

chapter1Button.setOnAction(event->{
    VBox chapter1Geometry9 = new VBox(10);
	chapter1 geometry1UIgeometry9 = new chapter1();
	Label chap1Geometry9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Geometry9.getChildren().addAll(chap1Geometry9Label, geometry1UIgeometry9.getChapter1UIgeometry9Grade(stage));
	Scene chapter1SceneGeo9 = new Scene(chapter1Geometry9, 600, 800);
	primaryStage.setScene(chapter1SceneGeo9);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Geometry9 = new VBox(10);
	chapter2 geometry2UIgeometry9 = new chapter2();
	Label chap2Geometry9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Geometry9.getChildren().addAll(chap2Geometry9Label, geometry2UIgeometry9.getChapter2UIgeometry9Grade(stage));
	Scene chapter2SceneGeo9 = new Scene(chapter2Geometry9, 600, 800);
	primaryStage.setScene(chapter2SceneGeo9);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Geometry9 = new VBox(10);
	chapter3 geometry3UIgeometry9 = new chapter3();
	Label chap3Geometry9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Geometry9.getChildren().addAll(chap3Geometry9Label, geometry3UIgeometry9.getChapter3UIgeometry9Grade(stage));
	Scene chapter3SceneGeo9 = new Scene(chapter3Geometry9, 600, 800);
	primaryStage.setScene(chapter3SceneGeo9);
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}