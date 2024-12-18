package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a zecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra10thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a X-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra10thChaptersUI(){

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

        chapter5Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter6Button.setOnAction(event->{
           MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, back);

        return root;
   }

}