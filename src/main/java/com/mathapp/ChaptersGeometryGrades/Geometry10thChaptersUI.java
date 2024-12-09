package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Geometry10thChaptersUI{

    public VBox getGeometry10thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Elements of trigonometry'");
        Button chapter1Button = new Button("Elements of trigonometry");
        Label chapter2Label = new Label("Let's learn about the 'Elements of analytical trigonometry'");
        Button chapter2Button = new Button("Elements of analytical trigonometry");

        Button back = new Button("Back");
        
        chapter1Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter2Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, back);

        return root;
   }

}