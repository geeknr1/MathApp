package com.mathapp.ChaptersAlgebraGrades;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Algebra9thChaptersUI{

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