package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;
import com.mathapp.grade11.Math_Analysis.chapter1;
import com.mathapp.grade11.Math_Analysis.chapter2;
import com.mathapp.grade11.Math_Analysis.chapter3;
import com.mathapp.grade11.Math_Analysis.chapter4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele analizei matematice in clasa a unsprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class MathematicalAnalysis11thChaptersUI{

    private static Stage primaryStage;
/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de clasa a XI-a a analizei matematice, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getMathematicalAnalysis11thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about the 'Sequences of real numbers'");
        Button chapter1Button = new Button("Sequences of real numbers");
        Label chapter2Label = new Label("Let's learn about the 'Limits of functions'");
        Button chapter2Button = new Button("Limits of functions");
        Label chapter3Label = new Label("Let's learn about 'Continuous functions'");
        Button chapter3Button = new Button("Continuous functions");
        Label chapter4Label = new Label("Let's learn about 'Derivable functions'");
        Button chapter4Button = new Button("Derivable functions");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
    VBox chapter1MA11 = new VBox(10);
	chapter1 ma1UIma11 = new chapter1();
	Label chap1MA11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter1MA11.getChildren().addAll(chap1MA11Label, ma1UIma11.getChapter1UImathanalysis11Grade(stage));
	Scene chapter1SceneMA11 = new Scene(chapter1MA11, 600, 800);
	primaryStage.setScene(chapter1SceneMA11);
        });

        chapter2Button.setOnAction(event->{
    VBox chapter2MA11 = new VBox(10);
	chapter2 ma2UIma11 = new chapter2();
	Label chap2MA11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter2MA11.getChildren().addAll(chap2MA11Label, ma2UIma11.getChapter2UImathanalysis11Grade(stage));
	Scene chapter2SceneMA11 = new Scene(chapter2MA11, 600, 800);
	primaryStage.setScene(chapter2SceneMA11);
        });

        chapter3Button.setOnAction(event->{
    VBox chapter3MA11 = new VBox(10);
	chapter3 ma3UIma11 = new chapter3();
	Label chap3MA11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter3MA11.getChildren().addAll(chap3MA11Label, ma3UIma11.getChapter3UImathanalysis11Grade(stage));
	Scene chapter3SceneMA11 = new Scene(chapter3MA11, 600, 800);
	primaryStage.setScene(chapter3SceneMA11);
        });

        chapter4Button.setOnAction(event->{
    VBox chapter4MA11 = new VBox(10);
	chapter4 ma4UIma11 = new chapter4();
	Label chap4MA11Label = new Label("Welcome to the 1st chapter of the 5th grade!");
	chapter4MA11.getChildren().addAll(chap4MA11Label, ma4UIma11.getChapter4UImathanalysis11Grade(stage));
	Scene chapter4SceneMA11 = new Scene(chapter4MA11, 600, 800);
	primaryStage.setScene(chapter4SceneMA11);
        });

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}