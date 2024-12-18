package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele geometriei in clasa a sasea, fiecare capitol avand o eticheta si un buton de acces
 */

public class Geometry6thChaptersUI{

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de geometria clasei a VI-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/
    public VBox getGeometry6thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Angles'");
        Button chapter1Button = new Button("Angles");
        Label chapter2Label = new Label("Let's learn about 'Parallelism'");
        Button chapter2Button = new Button("Parallelism");
        Label chapter3Label = new Label("Let's learn about 'Perpendicularity'");
        Button chapter3Button = new Button("Perpendicularity");
        Label chapter4Label = new Label("Let's learn about the 'Circle'");
        Button chapter4Button = new Button("Circle");
        Label chapter5Label = new Label("Let's learn about the 'Triangle'");
        Button chapter5Button = new Button("Triangle");
        Label chapter6Label = new Label("Let's learn about the 'Important lines in triangles'");
        Button chapter6Button = new Button("Important lines in triangles");
        Label chapter7Label = new Label("Let's learn about the 'Congruence of triangles'");
        Button chapter7Button = new Button("Congruence of triangles");
        Label chapter8Label = new Label("Let's learn about the 'Properties of triangles'");
        Button chapter8Button = new Button("Properties of triangles");

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

        chapter8Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, back);

        return root;
   }
}