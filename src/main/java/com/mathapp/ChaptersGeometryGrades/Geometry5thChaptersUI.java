package com.mathapp.ChaptersGeometryGrades;

import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
public class Geometry5thChaptersUI{

    public VBox getGeometry5thChaptersUI(){

        Label chapter1Label = new Label("Let's learn about the 'Point' + 'Straight line' + 'Plain'");
        Button chapter1Button = new Button("Point. Straight line. Plain.");
        Label chapter2Label = new Label("Let's learn about the 'Angle'");
        Button chapter2Button = new Button("Angle");
        Label chapter3Label = new Label("Let's learn about 'Congruent figures' + 'Simetry'");
        Button chapter3Button = new Button("Congruent figures. Simetry.");
        Label chapter4Label = new Label("Let's learn about the 'Measuring unit'");
        Button chapter4Button = new Button("Measuring unit");
        Label chapter5Label = new Label("Let's learn about 'Perimeters' + 'Surfaces' + 'Volumes'");
        Button chapter5Button = new Button("Perimeters. Surfaces. Volumes.");

        Button back = new Button("Back");

        chapter1Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter2Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter3Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter4Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        chapter5Button.setOnAction(event->{
            MathApp.showToBeContinued();
        });

        back.setOnAction(event->{
            MathApp.showGeometrySubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, back);

        return root;
   }

}