package com.mathapp.ChaptersGeometryGrades;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import com.mathapp.MathApp;

public class Geometry8thChaptersUI{

    public VBox getGeometry8thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Relations between points, straight lines and planes'");
        Button chapter1Button = new Button("Relations between points, straight lines and planes");
        Label chapter2Label = new Label("Let's learn about 'Geometric bodies, in other words their representation, elements, development'");
        Button chapter2Button = new Button("Geometric bodies - representation, elements, development");
        Label chapter3Label = new Label("Let's learn about 'Parallelism'");
        Button chapter3Button = new Button("Parallelism");
        Label chapter4Label = new Label("Let's learn about 'Perpendicularity'");
        Button chapter4Button = new Button("Perpendicularity");
        Label chapter5Label = new Label("Let's learn about 'Orthogonal projections on a plane'");
        Button chapter5Button = new Button("Orthogonal projections on a plane");
        Label chapter6Label = new Label("Let's learn about 'Theorem of the 3 perpendiculars + Distances'");
        Button chapter6Button = new Button("Theorem of the 3 perpendiculars. Distances");
        Label chapter7Label = new Label("Let's learn about the 'Calculation areas and volumes for polyhedra'");
        Button chapter7Button = new Button("Calculating areas and volumes for polyhedra");
        Label chapter8Label = new Label("Let's learn about 'Formulas'");
        Button chapter8Button = new Button("Formulas");

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