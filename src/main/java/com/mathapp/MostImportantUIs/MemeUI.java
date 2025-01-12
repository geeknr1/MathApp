package com.mathapp.MostImportantUIs;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MemeUI{

    private static Stage primaryStage;

    public Scene getMemeListUI(Stage stage){
        primaryStage = stage;
// /home/alex/programming/MathApp/Math_Memes/meme1.jpg
        VBox root = new VBox(10);
// /com/mathapp/MostImportantUIs/meme1.jpg
        for (int i = 1; i < 11; i++) {
            String imagePath = getClass().getResource("/assets/meme" + i + ".jpg").toExternalForm();
            Image image = new Image(imagePath);
            ImageView imageView = new ImageView(image);

            imageView.setFitWidth(150);
            imageView.setPreserveRatio(true);
            Label imgLabel = new Label("Math meme " + i);
            root.getChildren().addAll(imageView, imgLabel);
        }
        
        Button back = new Button("back");
        back.setOnAction(event->{
            MathSubjectsUI.showMathSubjectsUI();
        });
        root.getChildren().add(back);

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(580);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root, scrollBar);

        VBox newRoot = new VBox(contentPane);
        Scene scene = new Scene(newRoot, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/mathsubjects.css").toExternalForm());

        return scene;
   }

}