package com.mathapp.ChaptersAlgebraGrades;

import com.mathapp.MathApp;
import com.mathapp.grade5.Algebra.chapter1;
import com.mathapp.grade5.Algebra.chapter10;
import com.mathapp.grade5.Algebra.chapter11;
import com.mathapp.grade5.Algebra.chapter2;
import com.mathapp.grade5.Algebra.chapter3;
import com.mathapp.grade5.Algebra.chapter4;
import com.mathapp.grade5.Algebra.chapter5;
import com.mathapp.grade5.Algebra.chapter6;
import com.mathapp.grade5.Algebra.chapter7;
import com.mathapp.grade5.Algebra.chapter8;
import com.mathapp.grade5.Algebra.chapter9;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta arata capitolele pe care ar trebui sa le aiba subiectele algebrei in clasa a cincea, fiecare capitol avand o eticheta si un buton de acces
 */
public class Algebra5thChaptersUI{

    private static Stage primaryStage;

/**
* Clasa aceasta arata butoanele catre continutul lectiilor capitolelor care apartin de algebra clasei a V-a, cu tot cu etichetele de deasupra butoanelor, acestea avand un rol decorativ
*/

    public Scene getAlgebra5thChaptersUI(Stage stage){

        primaryStage = stage;

        Label chapter1Label = new Label("Let's learn about 'Natural numbers'");
        chapter1Label.getStyleClass().add("label");
        Button chapter1Button = new Button("Natural numbers");
        chapter1Button.getStyleClass().add("button");
        Label chapter2Label = new Label("Let's do some 'Operations with natural numbers'");
        chapter2Label.getStyleClass().add("label");
        Button chapter2Button = new Button("Operations with natural numbers");
        chapter2Button.getStyleClass().add("button");
        Label chapter3Label = new Label("Let's learn about 'Methods of solving problems'");
        chapter3Label.getStyleClass().add("label");
        Button chapter3Button = new Button("Methods of solving problems");
        chapter3Button.getStyleClass().add("button");
        Label chapter4Label = new Label("Let's learn about 'Divisibility'");
        chapter4Label.getStyleClass().add("label");
        Button chapter4Button = new Button("Divisibility");
        chapter4Button.getStyleClass().add("button");
        Label chapter5Label = new Label("Let's learn about 'Ordinary fractions'");
        chapter5Label.getStyleClass().add("label");
        Button chapter5Button = new Button("Ordinary fractions");
        chapter5Button.getStyleClass().add("button");
        Label chapter6Label = new Label("Let's learn about 'Decimal fractions'");
        chapter6Label.getStyleClass().add("label");
        Button chapter6Button = new Button("Decimal fractions");
        chapter6Button.getStyleClass().add("button");
        Label chapter7Label = new Label("Let's do some 'Operations with decimal fractions'");
        chapter7Label.getStyleClass().add("label");
        Button chapter7Button = new Button("Operations with decimal fractions");
        chapter7Button.getStyleClass().add("button");
        Label chapter8Label = new Label("Let's learn about 'Periodic decimal fractions'");
        chapter8Label.getStyleClass().add("label");
        Button chapter8Button = new Button("Periodic decimal fractions");
        chapter8Button.getStyleClass().add("button");
        Label chapter9Label = new Label("Let's learn about the 'Positive rational number'");
        chapter9Label.getStyleClass().add("label");
        Button chapter9Button = new Button("Positive rational number");
        chapter9Button.getStyleClass().add("button");
        Label chapter10Label = new Label("Let's learn about 'Arithmetic methods for solving problems with fractions \nin which units of measure also intervene'");
        chapter10Label.getStyleClass().add("label");
        Button chapter10Button = new Button("Arithmetic methods for solving problems with fractions in which units of \nmeasure also intervene");
        chapter10Button.getStyleClass().add("button");
        Label chapter11Label = new Label("Let's learn about 'Data organization problems'");
        chapter11Label.getStyleClass().add("label");
        Button chapter11Button = new Button("Data organization problems.");
        chapter11Button.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");


        chapter1Button.setOnAction(event->{
            chapter1 algebra1UIalgebra5 = new chapter1();
            Scene chapter1SceneAlg5 = algebra1UIalgebra5.getChapter1UIalgebra5Grade(stage);
            primaryStage.setScene(chapter1SceneAlg5);
        });

        chapter2Button.setOnAction(event->{
            chapter2 algebra2UIalgebra5 = new chapter2();
            Scene chapter2SceneAlg5 = algebra2UIalgebra5.getChapter2UIalgebra5Grade(stage);
            primaryStage.setScene(chapter2SceneAlg5);
        });

        chapter3Button.setOnAction(event->{
            chapter3 algebra3UIalgebra5 = new chapter3();
            Scene chapter3SceneAlg5 = algebra3UIalgebra5.getChapter3UIalgebra5Grade(stage);
            primaryStage.setScene(chapter3SceneAlg5);
        });

        chapter4Button.setOnAction(event->{
            chapter4 algebra4UIalgebra5 = new chapter4();
            Scene chapter4SceneAlg5 = algebra4UIalgebra5.getChapter4UIalgebra5Grade(stage);
            primaryStage.setScene(chapter4SceneAlg5);
        });

        chapter5Button.setOnAction(event->{
            chapter5 algebra5UIalgebra5 = new chapter5();
            Scene chapter5SceneAlg5 = algebra5UIalgebra5.getChapter5UIalgebra5Grade(stage);
            primaryStage.setScene(chapter5SceneAlg5);
        });

        chapter6Button.setOnAction(event->{
            chapter6 algebra6UIalgebra5 = new chapter6();
            Scene chapter6SceneAlg5 = algebra6UIalgebra5.getChapter6UIalgebra5Grade(stage);
            primaryStage.setScene(chapter6SceneAlg5);
        });

        chapter7Button.setOnAction(event->{
            chapter7 algebra7UIalgebra5 = new chapter7();
            Scene chapter7SceneAlg5 = algebra7UIalgebra5.getChapter7UIalgebra5Grade(stage);
            primaryStage.setScene(chapter7SceneAlg5);
        });

        chapter8Button.setOnAction(event->{
            chapter8 algebra8UIalgebra5 = new chapter8();
            Scene chapter8SceneAlg5 = algebra8UIalgebra5.getChapter8UIalgebra5Grade(stage);
            primaryStage.setScene(chapter8SceneAlg5);
        });

        chapter9Button.setOnAction(event->{
            chapter9 algebra9UIalgebra5 = new chapter9();
            Scene chapter9SceneAlg5 = algebra9UIalgebra5.getChapter9UIalgebra5Grade(stage);
            primaryStage.setScene(chapter9SceneAlg5);
        });

        chapter10Button.setOnAction(event->{
            chapter10 algebra10UIalgebra5 = new chapter10();
            Scene chapter10SceneAlg5 = algebra10UIalgebra5.getChapter10UIalgebra5Grade(stage);
            primaryStage.setScene(chapter10SceneAlg5);
        });

        chapter11Button.setOnAction(event->{
            chapter11 algebra11UIalgebra5 = new chapter11();
            Scene chapter11SceneAlg5 = algebra11UIalgebra5.getChapter11UIalgebra5Grade(stage);
            primaryStage.setScene(chapter11SceneAlg5);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, chapter9Label, chapter9Button, chapter10Label, chapter10Button, chapter11Label, chapter11Button, back);

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
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
   }

}