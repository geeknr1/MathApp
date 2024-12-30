package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade9.Algebra.chapter1;
import com.mathapp.grade9.Algebra.chapter2;
import com.mathapp.grade9.Algebra.chapter3;
import com.mathapp.grade9.Algebra.chapter4;
import com.mathapp.grade9.Algebra.chapter5;
import com.mathapp.grade9.Algebra.chapter6;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a noua, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra9thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a IX-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra9thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set of real numbers");
        Label chapter2Label = new Label("Let's learn about 'Elements of mathematical logic'");
        Button chapter2Button = new Button("Elements of mathematical logic");
        Label chapter3Label = new Label("Let's learn about 'Strings of real numbers + Progressions'");
        Button chapter3Button = new Button("Strings of real numbers. Progressions.");
        Label chapter4Label = new Label("Let's learn about 'General properties of functions'");
        Button chapter4Button = new Button("General properties of functions.");
        Label chapter5Label = new Label("Let's learn about 'First grade functions'");
        Button chapter5Button = new Button("First grade function");
        Label chapter6Label = new Label("Let's learn about 'Second grade functions'");
        Button chapter6Button = new Button("Second grade function");

        Button back = new Button("Back");
       
        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra9 = new VBox(10);
	chapter1 algebra1UIalgebra9 = new chapter1();
	Label chap1Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra9.getChildren().addAll(chap1Algebra9Label, algebra1UIalgebra9.getChapter1UIalgebra9Grade(stage));
	Scene chapter1SceneAlg9 = new Scene(chapter1Algebra9, 600, 800);
	primaryStage.setScene(chapter1SceneAlg9);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra9 = new VBox(10);
	chapter2 algebra2UIalgebra9 = new chapter2();
	Label chap2Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra9.getChildren().addAll(chap2Algebra9Label, algebra2UIalgebra9.getChapter2UIalgebra9Grade(stage));
	Scene chapter2SceneAlg9 = new Scene(chapter2Algebra9, 600, 800);
	primaryStage.setScene(chapter2SceneAlg9);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra9 = new VBox(10);
	chapter3 algebra3UIalgebra9 = new chapter3();
	Label chap3Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra9.getChildren().addAll(chap3Algebra9Label, algebra3UIalgebra9.getChapter3UIalgebra9Grade(stage));
	Scene chapter3SceneAlg9 = new Scene(chapter3Algebra9, 600, 800);
	primaryStage.setScene(chapter3SceneAlg9);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Algebra9 = new VBox(10);
	chapter4 algebra4UIalgebra9 = new chapter4();
	Label chap4Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Algebra9.getChildren().addAll(chap4Algebra9Label, algebra4UIalgebra9.getChapter4UIalgebra9Grade(stage));
	Scene chapter4SceneAlg9 = new Scene(chapter4Algebra9, 600, 800);
	primaryStage.setScene(chapter4SceneAlg9);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Algebra9 = new VBox(10);
	chapter5 algebra5UIalgebra9 = new chapter5();
	Label chap5Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Algebra9.getChildren().addAll(chap5Algebra9Label, algebra5UIalgebra9.getChapter5UIalgebra9Grade(stage));
	Scene chapter5SceneAlg9 = new Scene(chapter5Algebra9, 600, 800);
	primaryStage.setScene(chapter5SceneAlg9);
        });

        chapter6Button.setOnAction(event->{
    VBox chapter6Algebra9 = new VBox(10);
	chapter6 algebra6UIalgebra9 = new chapter6();
	Label chap6Algebra9Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter6Algebra9.getChildren().addAll(chap6Algebra9Label, algebra6UIalgebra9.getChapter6UIalgebra9Grade(stage));
	Scene chapter6SceneAlg9 = new Scene(chapter6Algebra9, 600, 800);
	primaryStage.setScene(chapter6SceneAlg9);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, back);

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