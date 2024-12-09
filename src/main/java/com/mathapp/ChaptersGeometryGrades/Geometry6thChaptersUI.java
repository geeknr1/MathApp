package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Geometry6thChaptersUI{

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

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, back);

        return root;
   }
}