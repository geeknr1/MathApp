package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a zecea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Geometry10thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a X-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry10thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Elements of trigonometry'");
        Button chapter1Button = new Button("Elements of trigonometry");
        Label chapter2Label = new Label("Let's learn about the 'Elements of analytical trigonometry'");
        Button chapter2Button = new Button("Elements of analytical trigonometry");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter2Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, back);

        return root;
   }

}