package com.mathapp.ChaptersAlgebraGrades;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Algebra10thChaptersUI{

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

        chapter5Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter6Button.setOnAction(event->{
           System.out.println("To be updated.");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button);

        return root;
   }

}