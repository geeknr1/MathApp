package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class Algebra11thChaptersUI{

    public VBox getAlgebra11thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Permutations'");
        Button chapter1Button = new Button("Permutation");
        Label chapter2Label = new Label("Let's learn about the 'Matrix'");
        Button chapter2Button = new Button("Matrix");
        Label chapter3Label = new Label("Let's learn about the 'Determinand of the matrix'");
        Button chapter3Button = new Button("Determinand");
        Label chapter4Label = new Label("Let's learn about 'Systems of linear equations'");
        Button chapter4Button = new Button("Systems of linear equations");

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

        chapter4Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);
        
        return root;
   }

}