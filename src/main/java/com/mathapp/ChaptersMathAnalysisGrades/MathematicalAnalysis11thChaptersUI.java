package com.mathapp.ChaptersMathAnalysisGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MathematicalAnalysis11thChaptersUI{

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
            System.out.println("To be updated.");
        });

        chapter2Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter3Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter4Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showMathematicalAnalysisSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}