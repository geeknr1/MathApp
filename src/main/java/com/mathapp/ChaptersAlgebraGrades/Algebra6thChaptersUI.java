package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a sasea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra6thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VI-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/

    public VBox getAlgebra6thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Sets of numbers'");
        Button chapter1Button = new Button("Sets of numbers");
        Label chapter2Label = new Label("Let's learn about the 'Divisibility of natural numbers'");
        Button chapter2Button = new Button("Divisibility of natural numbers");
        Label chapter3Label = new Label("Let's learn about 'Methods of solving problems'");
        Button chapter3Button = new Button("Methods of solving problems");
        Label chapter4Label = new Label("Let's learn about 'Reports + Proportion + Derived proportions + The string of equal reports'");
        Button chapter4Button = new Button("Reports. Proportion. Derived proportions. String of equal reports.");
        Label chapter5Label = new Label("Let's learn about 'Data organization elements and probabilities'");
        Button chapter5Button = new Button("Data organization elements and probabilities");
        Label chapter6Label = new Label("Let's learn about 'Integers'");
        Button chapter6Button = new Button("Integers");
        Label chapter7Label = new Label("Let's learn about 'Rational numbers'");
        Button chapter7Button = new Button("Rational numbers");

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

        chapter7Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, back);

        return root;
   }

}