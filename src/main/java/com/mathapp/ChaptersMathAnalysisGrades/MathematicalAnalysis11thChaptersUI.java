package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele analizei matematice in clasa a unsprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class MathematicalAnalysis11thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de clasa a XI-a a analizei matematice, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getMathematicalAnalysis11thChaptersUI(){

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
            MathApp.showToBeContinued();
        });

        chapter2Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter3Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter4Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}