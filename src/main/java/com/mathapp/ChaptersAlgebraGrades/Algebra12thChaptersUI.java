package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade12.Algebra.chapter1;
import com.mathapp.grade12.Algebra.chapter2;
import com.mathapp.grade12.Algebra.chapter3;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a doisprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra12thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a XII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra12thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Groups'");
        Button chapter1Button = new Button("Groups");
        Label chapter2Label = new Label("Let's learn about 'Rings + Bodies'");
        Button chapter2Button = new Button("Rings. Bodies");
        Label chapter3Label = new Label("Let's learn about 'Rings of polynomials with coefficients in a commutative field'");
        Button chapter3Button = new Button("Rings of polynomials with coefficients in a commutative field");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra12 = new VBox(10);
	chapter1 algebra1UIalgebra12 = new chapter1();
	Label chap1Algebra12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra12.getChildren().addAll(chap1Algebra12Label, algebra1UIalgebra12.getChapter1UIalgebra12Grade(stage));
	Scene chapter1SceneAlg12 = new Scene(chapter1Algebra12, 600, 800);
	primaryStage.setScene(chapter1SceneAlg12);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra12 = new VBox(10);
	chapter2 algebra2UIalgebra12 = new chapter2();
	Label chap2Algebra12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra12.getChildren().addAll(chap2Algebra12Label, algebra2UIalgebra12.getChapter2UIalgebra12Grade(stage));
	Scene chapter2SceneAlg12 = new Scene(chapter2Algebra12, 600, 800);
	primaryStage.setScene(chapter2SceneAlg12);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra12 = new VBox(10);
	chapter3 algebra3UIalgebra12 = new chapter3();
	Label chap3Algebra12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra12.getChildren().addAll(chap3Algebra12Label, algebra3UIalgebra12.getChapter3UIalgebra12Grade(stage));
	Scene chapter3SceneAlg12 = new Scene(chapter3Algebra12, 600, 800);
	primaryStage.setScene(chapter3SceneAlg12);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

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