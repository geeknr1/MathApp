package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Algebra8thChaptersUI{

    public VBox getAlgebra8thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Intervals of real numbers + Inequations in R'");
        Button chapter1Button = new Button("Intervals of real numbers. Inequations in R.");
        Label chapter2Label = new Label("Let's learn about the 'Algebraic calculation'");
        Button chapter2Button = new Button("Algebraic calculation");
        Label chapter3Label = new Label("Let's learn about 'Functions + Data organization and probabilities'");
        Button chapter3Button = new Button("Functions. Data organization and probabilities.");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter2Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter3Button.setOnAction(event->{
           System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, back);

        return root;
   }

}