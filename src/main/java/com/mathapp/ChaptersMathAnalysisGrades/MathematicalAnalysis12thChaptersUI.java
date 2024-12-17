package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MathematicalAnalysis12thChaptersUI{

    public VBox getMathematicalAnalysis12thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Primitives' + 'Indefinite integral of a function'");
        Button chapter1Button = new Button("Primitives. Indefinite integral of a function.");
        Label chapter2Label = new Label("Let's learn about 'Integrable functions' + 'Definite integral of a function'");
        Button chapter2Button = new Button("Integrable functions. Definite integral of a function");
        Label chapter3Label = new Label("Let's look at some 'Applications of the definite integral'");
        Button chapter3Button = new Button("Applications of the definite integral"); 

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

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}