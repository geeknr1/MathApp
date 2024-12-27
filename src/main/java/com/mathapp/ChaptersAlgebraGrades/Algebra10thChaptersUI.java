package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade10.Algebra.chapter1;
import com.mathapp.grade10.Algebra.chapter2;
import com.mathapp.grade10.Algebra.chapter3;
import com.mathapp.grade10.Algebra.chapter4;
import com.mathapp.grade10.Algebra.chapter5;
import com.mathapp.grade10.Algebra.chapter6;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a zecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra10thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a X-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra10thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set of real numbers");
        Label chapter2Label = new Label("Let's learn about the 'Set of complex numbers'");
        Button chapter2Button = new Button("The set of complex numbers");
        Label chapter3Label = new Label("Let's learn about 'Functions'");
        Button chapter3Button = new Button("Functions");
        Label chapter4Label = new Label("Let's learn about 'Equations'");
        Button chapter4Button = new Button("Equations");
        Label chapter5Label = new Label("Let's learn about 'Combinatorics + Counting methods + Probabilities'");
        Button chapter5Button = new Button("Combinatorics. Counting methods. Probabilities.");
        Label chapter6Label = new Label("Let's learn about 'Financial mathematics'");
        Button chapter6Button = new Button("Financial mathematics");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra10 = new VBox(10);
	chapter1 algebra1UIalgebra10 = new chapter1();
	Label chap1Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra10.getChildren().addAll(chap1Algebra10Label, algebra1UIalgebra10.getChapter1UIalgebra10Grade(stage));
	Scene chapter1SceneAlg10 = new Scene(chapter1Algebra10, 600, 800);
	primaryStage.setScene(chapter1SceneAlg10);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra10 = new VBox(10);
	chapter2 algebra2UIalgebra10 = new chapter2();
	Label chap2Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra10.getChildren().addAll(chap2Algebra10Label, algebra2UIalgebra10.getChapter2UIalgebra10Grade(stage));
	Scene chapter2SceneAlg10 = new Scene(chapter2Algebra10, 600, 800);
	primaryStage.setScene(chapter2SceneAlg10);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra10 = new VBox(10);
	chapter3 algebra3UIalgebra10 = new chapter3();
	Label chap3Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra10.getChildren().addAll(chap3Algebra10Label, algebra3UIalgebra10.getChapter3UIalgebra10Grade(stage));
	Scene chapter3SceneAlg10 = new Scene(chapter3Algebra10, 600, 800);
	primaryStage.setScene(chapter3SceneAlg10);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4Algebra10 = new VBox(10);
	chapter4 algebra4UIalgebra10 = new chapter4();
	Label chap4Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4Algebra10.getChildren().addAll(chap4Algebra10Label, algebra4UIalgebra10.getChapter4UIalgebra10Grade(stage));
	Scene chapter4SceneAlg10 = new Scene(chapter4Algebra10, 600, 800);
	primaryStage.setScene(chapter4SceneAlg10);
        });

        chapter5Button.setOnAction(event->{
    VBox chapter5Algebra10 = new VBox(10);
	chapter5 algebra5UIalgebra10 = new chapter5();
	Label chap5Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter5Algebra10.getChildren().addAll(chap5Algebra10Label, algebra5UIalgebra10.getChapter5UIalgebra10Grade(stage));
	Scene chapter5SceneAlg10 = new Scene(chapter5Algebra10, 600, 800);
	primaryStage.setScene(chapter5SceneAlg10);
        });

        chapter6Button.setOnAction(event->{
    VBox chapter6Algebra10 = new VBox(10);
	chapter6 algebra6UIalgebra10 = new chapter6();
	Label chap6Algebra10Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter6Algebra10.getChildren().addAll(chap6Algebra10Label, algebra6UIalgebra10.getChapter6UIalgebra10Grade(stage));
	Scene chapter6SceneAlg10 = new Scene(chapter6Algebra10, 600, 800);
	primaryStage.setScene(chapter6SceneAlg10);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, back);

        return root;
   }

}