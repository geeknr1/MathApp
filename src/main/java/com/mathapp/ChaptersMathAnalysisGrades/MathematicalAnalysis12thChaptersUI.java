package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;
import com.mathapp.grade12.Math_Analysis.chapter1;
import com.mathapp.grade12.Math_Analysis.chapter2;
import com.mathapp.grade12.Math_Analysis.chapter3;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele analizei matematice in clasa a doisprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class MathematicalAnalysis12thChaptersUI{

    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de clasa a XII-a a analizei matematice, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getMathematicalAnalysis12thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Primitives' + 'Indefinite integral of a function'");
        Button chapter1Button = new Button("Primitives. Indefinite integral of a function.");
        Label chapter2Label = new Label("Let's learn about 'Integrable functions' + 'Definite integral of a function'");
        Button chapter2Button = new Button("Integrable functions. Definite integral of a function");
        Label chapter3Label = new Label("Let's look at some 'Applications of the definite integral'");
        Button chapter3Button = new Button("Applications of the definite integral"); 

        Button back = new Button("Back");       

    chapter1Button.setOnAction(event->{
        VBox chapter1MA12 = new VBox(10);
        chapter1 ma1UIma12 = new chapter1();
        Label chap1MA12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
        chapter1MA12.getChildren().addAll(chap1MA12Label, ma1UIma12.getChapter1UImathanalysis12Grade(stage));
        Scene chapter1SceneMA12 = new Scene(chapter1MA12, 600, 800);
        primaryStage.setScene(chapter1SceneMA12);
            });

        chapter2Button.setOnAction(event->{
    VBox chapter2MA12 = new VBox(10);
	chapter2 ma2UIma12 = new chapter2();
	Label chap2MA12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2MA12.getChildren().addAll(chap2MA12Label, ma2UIma12.getChapter2UImathanalysis12Grade(stage));
	Scene chapter2SceneMA12 = new Scene(chapter2MA12, 600, 800);
	primaryStage.setScene(chapter2SceneMA12);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3MA12 = new VBox(10);
	chapter3 ma3UIma12 = new chapter3();
	Label chap3MA12Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3MA12.getChildren().addAll(chap3MA12Label, ma3UIma12.getChapter3UImathanalysis12Grade(stage));
	Scene chapter3SceneMA12 = new Scene(chapter3MA12, 600, 800);
	primaryStage.setScene(chapter3SceneMA12);
        });

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}