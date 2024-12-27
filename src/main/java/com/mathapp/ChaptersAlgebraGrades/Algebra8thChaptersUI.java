package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade8.Algebra.chapter1;
import com.mathapp.grade8.Algebra.chapter2;
import com.mathapp.grade8.Algebra.chapter3;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a opta, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra8thChaptersUI{
    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VIII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra8thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Intervals of real numbers + Inequations in R'");
        Button chapter1Button = new Button("Intervals of real numbers. Inequations in R.");
        Label chapter2Label = new Label("Let's learn about the 'Algebraic calculation'");
        Button chapter2Button = new Button("Algebraic calculation");
        Label chapter3Label = new Label("Let's learn about 'Functions + Data organization and probabilities'");
        Button chapter3Button = new Button("Functions. Data organization and probabilities.");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
    VBox chapter1Algebra8 = new VBox(10);
	chapter1 algebra1UIalgebra8 = new chapter1();
	Label chap1Algebra8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1Algebra8.getChildren().addAll(chap1Algebra8Label, algebra1UIalgebra8.getChapter1UIalgebra8Grade(stage));
	Scene chapter1SceneAlg8 = new Scene(chapter1Algebra8, 600, 800);
	primaryStage.setScene(chapter1SceneAlg8);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2Algebra8 = new VBox(10);
	chapter2 algebra2UIalgebra8 = new chapter2();
	Label chap2Algebra8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2Algebra8.getChildren().addAll(chap2Algebra8Label, algebra2UIalgebra8.getChapter2UIalgebra8Grade(stage));
	Scene chapter2SceneAlg8 = new Scene(chapter2Algebra8, 600, 800);
	primaryStage.setScene(chapter2SceneAlg8);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3Algebra8 = new VBox(10);
	chapter3 algebra3UIalgebra8 = new chapter3();
	Label chap3Algebra8Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3Algebra8.getChildren().addAll(chap3Algebra8Label, algebra3UIalgebra8.getChapter3UIalgebra8Grade(stage));
	Scene chapter3SceneAlg8 = new Scene(chapter3Algebra8, 600, 800);
	primaryStage.setScene(chapter3SceneAlg8);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}