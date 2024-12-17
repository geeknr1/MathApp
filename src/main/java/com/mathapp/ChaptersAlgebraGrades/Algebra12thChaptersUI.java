package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class Algebra12thChaptersUI{

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