package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a noua, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra9thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a IX-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra9thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set of real numbers");
        Label chapter2Label = new Label("Let's learn about 'Elements of mathematical logic'");
        Button chapter2Button = new Button("Elements of mathematical logic");
        Label chapter3Label = new Label("Let's learn about 'Strings of real numbers + Progressions'");
        Button chapter3Button = new Button("Strings of real numbers. Progressions.");
        Label chapter4Label = new Label("Let's learn about 'General properties of functions'");
        Button chapter4Button = new Button("General properties of functions.");
        Label chapter5Label = new Label("Let's learn about 'First grade functions'");
        Button chapter5Button = new Button("First grade function");
        Label chapter6Label = new Label("Let's learn about 'Second grade functions'");
        Button chapter6Button = new Button("Second grade function");

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