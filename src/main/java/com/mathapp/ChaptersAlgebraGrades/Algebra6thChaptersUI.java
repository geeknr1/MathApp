package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade6.Algebra.chapter1;
import com.mathapp.grade6.Algebra.chapter2;
import com.mathapp.grade6.Algebra.chapter3;
import com.mathapp.grade6.Algebra.chapter4;
import com.mathapp.grade6.Algebra.chapter5;
import com.mathapp.grade6.Algebra.chapter6;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a sasea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra6thChaptersUI{

    private static Stage primaryStage;

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VI-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/

    public Scene getAlgebra6thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Sets of numbers'");
        chapter1Label.getStyleClass().add("label");
        Button chapter1Button = new Button("Sets of numbers");
        chapter1Button.getStyleClass().add("button");
        Label chapter2Label = new Label("Let's learn about the 'Divisibility of natural numbers'");
        chapter2Label.getStyleClass().add("label");
        Button chapter2Button = new Button("Divisibility of natural numbers");
        chapter2Button.getStyleClass().add("button");
        Label chapter3Label = new Label("Let's learn about 'Methods of solving problems'");
        chapter3Label.getStyleClass().add("label");
        Button chapter3Button = new Button("Methods of solving problems");
        chapter3Button.getStyleClass().add("button");
        Label chapter4Label = new Label("Let's learn about 'Reports + Proportion + Derived proportions + The string of equal reports'");
        chapter4Label.getStyleClass().add("label");
        Button chapter4Button = new Button("Reports. Proportion. Derived proportions. String of equal reports.");
        chapter4Button.getStyleClass().add("button");
        Label chapter5Label = new Label("Let's learn about 'Data organization elements and probabilities'");
        chapter5Label.getStyleClass().add("label");
        Button chapter5Button = new Button("Data organization elements and probabilities");
        chapter5Button.getStyleClass().add("button");
        Label chapter6Label = new Label("Let's learn about 'Integers'");
        chapter6Label.getStyleClass().add("label");
        Button chapter6Button = new Button("Integers");
        chapter6Button.getStyleClass().add("button");
        Label chapter7Label = new Label("Let's learn about 'Rational numbers'");
        chapter7Label.getStyleClass().add("label");
        Button chapter7Button = new Button("Rational numbers");
        chapter7Button.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");


        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra6 = new VBox(10);
	chapter1 algebra1UIalgebra6 = new chapter1();
	Label chap1Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra6.getChildren().addAll(chap1Algebra6Label, algebra1UIalgebra6.getChapter1UIalgebra6Grade(stage));
	Scene chapter1SceneAlg6 = new Scene(chapter1Algebra6, 600, 800);
	primaryStage.setScene(chapter1SceneAlg6);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra6 = new VBox(10);
	chapter2 algebra2UIalgebra6 = new chapter2();
	Label chap2Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra6.getChildren().addAll(chap2Algebra6Label, algebra2UIalgebra6.getChapter2UIalgebra6Grade(stage));
	Scene chapter2SceneAlg6 = new Scene(chapter2Algebra6, 600, 800);
	primaryStage.setScene(chapter2SceneAlg6);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra6 = new VBox(10);
	chapter3 algebra3UIalgebra6 = new chapter3();
	Label chap3Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra6.getChildren().addAll(chap3Algebra6Label, algebra3UIalgebra6.getChapter3UIalgebra6Grade(stage));
	Scene chapter3SceneAlg6 = new Scene(chapter3Algebra6, 600, 800);
	primaryStage.setScene(chapter3SceneAlg6);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Algebra6 = new VBox(10);
	chapter4 algebra4UIalgebra6 = new chapter4();
	Label chap4Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Algebra6.getChildren().addAll(chap4Algebra6Label, algebra4UIalgebra6.getChapter4UIalgebra6Grade(stage));
	Scene chapter4SceneAlg6 = new Scene(chapter4Algebra6, 600, 800);
	primaryStage.setScene(chapter4SceneAlg6);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Algebra6 = new VBox(10);
	chapter5 algebra5UIalgebra6 = new chapter5();
	Label chap5Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Algebra6.getChildren().addAll(chap5Algebra6Label, algebra5UIalgebra6.getChapter5UIalgebra6Grade(stage));
	Scene chapter5SceneAlg6 = new Scene(chapter5Algebra6, 600, 800);
	primaryStage.setScene(chapter5SceneAlg6);
        });

        chapter6Button.setOnAction(event->{
    VBox chapter6Algebra6 = new VBox(10);
	chapter6 algebra6UIalgebra6 = new chapter6();
	Label chap6Algebra6Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter6Algebra6.getChildren().addAll(chap6Algebra6Label, algebra6UIalgebra6.getChapter6UIalgebra6Grade(stage));
	Scene chapter6SceneAlg6 = new Scene(chapter6Algebra6, 600, 800);
	primaryStage.setScene(chapter6SceneAlg6);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, back);

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
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/6thGrade.css").toExternalForm());

        return scene;
   }

}