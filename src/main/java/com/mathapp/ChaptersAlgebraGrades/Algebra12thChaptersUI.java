package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a doisprezecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra12thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a XII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra12thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Groups'");
        Button chapter1Button = new Button("Groups");
        Label chapter2Label = new Label("Let's learn about 'Rings + Bodies'");
        Button chapter2Button = new Button("Rings. Bodies");
        Label chapter3Label = new Label("Let's learn about 'Rings of polynomials with coefficients in a commutative field'");
        Button chapter3Button = new Button("Rings of polynomials with coefficients in a commutative field");

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
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}