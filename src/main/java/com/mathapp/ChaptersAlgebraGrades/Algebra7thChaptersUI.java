package com.mathapp.ChaptersAlgebraGrades;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Algebra7thChaptersUI{

    public VBox getAlgebra7thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Set of real numbers'");
        Button chapter1Button = new Button("The set or real numbers");
        Label chapter2Label = new Label("Let's do some 'Operations with real numbers'");
        Button chapter2Button = new Button("Operations with real numbers");
        Label chapter3Label = new Label("Let's learn about and do some 'Equations and systems of equations'");
        Button chapter3Button = new Button("Equations and systems of equations");
        Label chapter4Label = new Label("Let's learn about 'Data organization elements'");
        Button chapter4Button = new Button("Data organization elements");

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

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button);

        return root;
   }

}