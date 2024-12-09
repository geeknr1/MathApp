package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Geometry7thChaptersUI{

    public VBox getGeometry7thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about 'Quadrilaterals'");
        Button chapter1Button = new Button("Quadrilaterals");
        Label chapter2Label = new Label("Let's learn about 'Surfaces and perimeters'");
        Button chapter2Button = new Button("Surfaces and perimeters");
        Label chapter3Label = new Label("Let's learn about the 'Similarity of triangles'");
        Button chapter3Button = new Button("Similarity of triangles");
        Label chapter4Label = new Label("Let's learn about 'Metric relations in right triangles'");
        Button chapter4Button = new Button("Metric relations in right triangles");

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
            MathApp.showGeometrySubject();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, back);

        return root;
   }

}