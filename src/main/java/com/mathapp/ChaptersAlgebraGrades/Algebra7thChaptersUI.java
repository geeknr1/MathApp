package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a saptea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra7thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/

    public VBox getAlgebra7thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set or real numbers");
        Label chapter2Label = new Label("Let's do some 'Operations with real numbers'");
        Button chapter2Button = new Button("Operations with real numbers");
        Label chapter3Label = new Label("Let's learn about and do some 'Equations and systems of equations'");
        Button chapter3Button = new Button("Equations and systems of equations");
        Label chapter4Label = new Label("Let's learn about 'Data organization elements'");
        Button chapter4Button = new Button("Data organization elements");

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
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}