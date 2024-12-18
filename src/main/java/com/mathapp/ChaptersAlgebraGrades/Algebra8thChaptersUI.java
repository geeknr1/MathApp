package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a opta, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra8thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a VIII-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getAlgebra8thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Intervals of real numbers + Inequations in R'");
        Button chapter1Button = new Button("Intervals of real numbers. Inequations in R.");
        Label chapter2Label = new Label("Let's learn about the 'Algebraic calculation'");
        Button chapter2Button = new Button("Algebraic calculation");
        Label chapter3Label = new Label("Let's learn about 'Functions + Data organization and probabilities'");
        Button chapter3Button = new Button("Functions. Data organization and probabilities.");

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