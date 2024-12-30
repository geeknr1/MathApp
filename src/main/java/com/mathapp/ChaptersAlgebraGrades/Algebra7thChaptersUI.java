package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade7.Algebra.chapter1;
import com.mathapp.grade7.Algebra.chapter2;
import com.mathapp.grade7.Algebra.chapter3;
import com.mathapp.grade7.Algebra.chapter4;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a saptea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra7thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/

    public VBox getAlgebra7thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set or real numbers");
        Label chapter2Label = new Label("Let's do some 'Operations with real numbers'");
        Button chapter2Button = new Button("Operations with real numbers");
        Label chapter3Label = new Label("Let's learn about and do some 'Equations and systems of equations'");
        Button chapter3Button = new Button("Equations and systems of equations");
        Label chapter4Label = new Label("Let's learn about 'Data organization elements'");
        Button chapter4Button = new Button("Data organization elements");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra7 = new VBox(10);
	chapter1 algebra1UIalgebra7 = new chapter1();
	Label chap1Algebra7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra7.getChildren().addAll(chap1Algebra7Label, algebra1UIalgebra7.getChapter1UIalgebra7Grade(stage));
	Scene chapter1SceneAlg7 = new Scene(chapter1Algebra7, 600, 800);
	primaryStage.setScene(chapter1SceneAlg7);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra7 = new VBox(10);
	chapter2 algebra2UIalgebra7 = new chapter2();
	Label chap2Algebra7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra7.getChildren().addAll(chap2Algebra7Label, algebra2UIalgebra7.getChapter2UIalgebra7Grade(stage));
	Scene chapter2SceneAlg7 = new Scene(chapter2Algebra7, 600, 800);
	primaryStage.setScene(chapter2SceneAlg7);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra7 = new VBox(10);
	chapter3 algebra3UIalgebra7 = new chapter3();
	Label chap3Algebra7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra7.getChildren().addAll(chap3Algebra7Label, algebra3UIalgebra7.getChapter3UIalgebra7Grade(stage));
	Scene chapter3SceneAlg7 = new Scene(chapter3Algebra7, 600, 800);
	primaryStage.setScene(chapter3SceneAlg7);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Algebra7 = new VBox(10);
	chapter4 algebra4UIalgebra7 = new chapter4();
	Label chap4Algebra7Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Algebra7.getChildren().addAll(chap4Algebra7Label, algebra4UIalgebra7.getChapter4UIalgebra7Grade(stage));
	Scene chapter4SceneAlg7 = new Scene(chapter4Algebra7, 600, 800);
	primaryStage.setScene(chapter4SceneAlg7);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
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

        return new VBox(contentPane);
   }

}