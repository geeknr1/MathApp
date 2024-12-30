package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade11.Algebra.chapter1;
import com.mathapp.grade11.Algebra.chapter2;
import com.mathapp.grade11.Algebra.chapter3;
import com.mathapp.grade11.Algebra.chapter4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a unsprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra11thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a XI-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra11thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Permutations'");
        Button chapter1Button = new Button("Permutation");
        Label chapter2Label = new Label("Let's learn about the 'Matrix'");
        Button chapter2Button = new Button("Matrix");
        Label chapter3Label = new Label("Let's learn about the 'Determinand of the matrix'");
        Button chapter3Button = new Button("Determinand");
        Label chapter4Label = new Label("Let's learn about 'Systems of linear equations'");
        Button chapter4Button = new Button("Systems of linear equations");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra11 = new VBox(10);
	chapter1 algebra1UIalgebra11 = new chapter1();
	Label chap1Algebra11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra11.getChildren().addAll(chap1Algebra11Label, algebra1UIalgebra11.getChapter1UIalgebra11Grade(stage));
	Scene chapter1SceneAlg11 = new Scene(chapter1Algebra11, 600, 800);
	primaryStage.setScene(chapter1SceneAlg11);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra11 = new VBox(10);
	chapter2 algebra2UIalgebra11 = new chapter2();
	Label chap2Algebra11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra11.getChildren().addAll(chap2Algebra11Label, algebra2UIalgebra11.getChapter2UIalgebra11Grade(stage));
	Scene chapter2SceneAlg11 = new Scene(chapter2Algebra11, 600, 800);
	primaryStage.setScene(chapter2SceneAlg11);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra11 = new VBox(10);
	chapter3 algebra3UIalgebra11 = new chapter3();
	Label chap3Algebra11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra11.getChildren().addAll(chap3Algebra11Label, algebra3UIalgebra11.getChapter3UIalgebra11Grade(stage));
	Scene chapter3SceneAlg11 = new Scene(chapter3Algebra11, 600, 800);
	primaryStage.setScene(chapter3SceneAlg11);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Algebra11 = new VBox(10);
	chapter4 algebra4UIalgebra11 = new chapter4();
	Label chap4Algebra11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Algebra11.getChildren().addAll(chap4Algebra11Label, algebra4UIalgebra11.getChapter4UIalgebra11Grade(stage));
	Scene chapter4SceneAlg11 = new Scene(chapter4Algebra11, 600, 800);
	primaryStage.setScene(chapter4SceneAlg11);
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