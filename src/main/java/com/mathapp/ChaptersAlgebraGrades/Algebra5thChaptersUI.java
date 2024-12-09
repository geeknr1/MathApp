package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Algebra5thChaptersUI{

    public VBox getAlgebra5thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Natural numbers'");
        Button chapter1Button = new Button("Natural numbers");
        Label chapter2Label = new Label("Let's do some 'Operations with natural numbers'");
        Button chapter2Button = new Button("Operations with natural numbers");
        Label chapter3Label = new Label("Let's learn about 'Methods of solving problems'");
        Button chapter3Button = new Button("Methods of solving problems");
        Label chapter4Label = new Label("Let's learn about 'Divisibility'");
        Button chapter4Button = new Button("Divisibility");
        Label chapter5Label = new Label("Let's learn about 'Ordinary fractions'");
        Button chapter5Button = new Button("Ordinary fractions");
        Label chapter6Label = new Label("Let's learn about 'Decimal fractions'");
        Button chapter6Button = new Button("Decimal fractions");
        Label chapter7Label = new Label("Let's do some 'Operations with decimal fractions'");
        Button chapter7Button = new Button("Operations with decimal fractions");
        Label chapter8Label = new Label("Let's learn about 'Periodic decimal fractions'");
        Button chapter8Button = new Button("Periodic decimal fractions");
        Label chapter9Label = new Label("Let's learn about the 'Positive rational number'");
        Button chapter9Button = new Button("Positive rational number");
        Label chapter10Label = new Label("Let's learn about 'Arithmetic methods for solving problems with fractions in which units of measure also intervene'");
        Button chapter10Button = new Button("Arithmetic methods for solving problems with fractions in which units of measure also intervene");
        Label chapter11Label = new Label("Let's learn about 'Data organization problems'");
        Button chapter11Button = new Button("Data organization problems.");

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

        chapter5Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter6Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter7Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter8Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter9Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter10Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter11Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, chapter9Label, chapter9Button, chapter10Label, chapter10Button, chapter11Label, chapter11Button, back);

        return root;
   }

}