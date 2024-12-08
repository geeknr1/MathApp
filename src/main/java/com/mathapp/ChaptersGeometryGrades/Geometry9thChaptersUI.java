package com.mathapp.ChaptersGeometryGrades;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Geometry9thChaptersUI{

    public VBox getGeometry9thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Elements of vector calculus in the plane'");
        Button chapter1Button = new Button("Elements of vector calculus in the plane");
        Label chapter2Label = new Label("Let's learn about the 'Elements of trigonometry'");
        Button chapter2Button = new Button("Elements of trigonometry");
        Label chapter3Label = new Label("Let's learn about the 'Applications of trigonometry in plane geometry'");
        Button chapter3Button = new Button("Applications of trigonometry in plane geometry");

        chapter1Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter2Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        chapter3Button.setOnAction(event->{
            System.out.println("To be updated.");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button);

        return root;
   }

}