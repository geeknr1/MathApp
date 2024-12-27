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

    public VBox getAlgebra5thChaptersUI(Stage stage){

        primaryStage = stage;

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
            VBox chapter1Algebra5 = new VBox(10);
            chapter1 algebra1UIalgebra5 = new chapter1();
            Label chap1Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter1Algebra5.getChildren().addAll(chap1Algebra5Label, algebra1UIalgebra5.getChapter1UIalgebra5Grade(stage));
            Scene chapter1SceneAlg5 = new Scene(chapter1Algebra5, 600, 800);
            primaryStage.setScene(chapter1SceneAlg5);
        });

        chapter2Button.setOnAction(event->{
            VBox chapter2Algebra5 = new VBox(10);
            chapter2 algebra2UIalgebra5 = new chapter2();
            Label chap2Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter2Algebra5.getChildren().addAll(chap2Algebra5Label, algebra2UIalgebra5.getChapter2UIalgebra5Grade(stage));
            Scene chapter2SceneAlg5 = new Scene(chapter2Algebra5, 600, 800);
            primaryStage.setScene(chapter2SceneAlg5);
        });

        chapter3Button.setOnAction(event->{
            VBox chapter3Algebra5 = new VBox(10);
            chapter3 algebra3UIalgebra5 = new chapter3();
            Label chap3Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter3Algebra5.getChildren().addAll(chap3Algebra5Label, algebra3UIalgebra5.getChapter3UIalgebra5Grade(stage));
            Scene chapter3SceneAlg5 = new Scene(chapter3Algebra5, 600, 800);
            primaryStage.setScene(chapter3SceneAlg5);
        });

        chapter4Button.setOnAction(event->{
            VBox chapter4Algebra5 = new VBox(10);
            chapter4 algebra4UIalgebra5 = new chapter4();
            Label chap4Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter4Algebra5.getChildren().addAll(chap4Algebra5Label, algebra4UIalgebra5.getChapter4UIalgebra5Grade(stage));
            Scene chapter4SceneAlg5 = new Scene(chapter4Algebra5, 600, 800);
            primaryStage.setScene(chapter4SceneAlg5);
        });

        chapter5Button.setOnAction(event->{
            VBox chapter5Algebra5 = new VBox(10);
            chapter5 algebra5UIalgebra5 = new chapter5();
            Label chap5Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter5Algebra5.getChildren().addAll(chap5Algebra5Label, algebra5UIalgebra5.getChapter5UIalgebra5Grade(stage));
            Scene chapter5SceneAlg5 = new Scene(chapter5Algebra5, 600, 800);
            primaryStage.setScene(chapter5SceneAlg5);
        });

        chapter6Button.setOnAction(event->{
            VBox chapter6Algebra5 = new VBox(10);
            chapter6 algebra6UIalgebra5 = new chapter6();
            Label chap6Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter6Algebra5.getChildren().addAll(chap6Algebra5Label, algebra6UIalgebra5.getChapter6UIalgebra5Grade(stage));
            Scene chapter6SceneAlg5 = new Scene(chapter6Algebra5, 600, 800);
            primaryStage.setScene(chapter6SceneAlg5);
        });

        chapter7Button.setOnAction(event->{
            VBox chapter7Algebra5 = new VBox(10);
            chapter7 algebra7UIalgebra5 = new chapter7();
            Label chap7Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter7Algebra5.getChildren().addAll(chap7Algebra5Label, algebra7UIalgebra5.getChapter7UIalgebra5Grade(stage));
            Scene chapter7SceneAlg5 = new Scene(chapter7Algebra5, 600, 800);
            primaryStage.setScene(chapter7SceneAlg5);
        });

        chapter8Button.setOnAction(event->{
            VBox chapter8Algebra5 = new VBox(10);
            chapter8 algebra8UIalgebra5 = new chapter8();
            Label chap8Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter8Algebra5.getChildren().addAll(chap8Algebra5Label, algebra8UIalgebra5.getChapter8UIalgebra5Grade(stage));
            Scene chapter8SceneAlg5 = new Scene(chapter8Algebra5, 600, 800);
            primaryStage.setScene(chapter8SceneAlg5);
        });

        chapter9Button.setOnAction(event->{
            VBox chapter9Algebra5 = new VBox(10);
            chapter9 algebra9UIalgebra5 = new chapter9();
            Label chap9Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter9Algebra5.getChildren().addAll(chap9Algebra5Label, algebra9UIalgebra5.getChapter9UIalgebra5Grade(stage));
            Scene chapter9SceneAlg5 = new Scene(chapter9Algebra5, 600, 800);
            primaryStage.setScene(chapter9SceneAlg5);
        });

        chapter10Button.setOnAction(event->{
            VBox chapter10Algebra5 = new VBox(10);
            chapter10 algebra10UIalgebra5 = new chapter10();
            Label chap10Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter10Algebra5.getChildren().addAll(chap10Algebra5Label, algebra10UIalgebra5.getChapter10UIalgebra5Grade(stage));
            Scene chapter10SceneAlg5 = new Scene(chapter10Algebra5, 600, 800);
            primaryStage.setScene(chapter10SceneAlg5);
        });

        chapter11Button.setOnAction(event->{
            VBox chapter11Algebra5 = new VBox(10);
            chapter11 algebra11UIalgebra5 = new chapter11();
            Label chap11Algebra5Label = new Label("Welcome to the 1st chapter of the 5th grade!");
            chapter11Algebra5.getChildren().addAll(chap11Algebra5Label, algebra11UIalgebra5.getChapter11UIalgebra5Grade(stage));
            Scene chapter11SceneAlg5 = new Scene(chapter11Algebra5, 600, 800);
            primaryStage.setScene(chapter11SceneAlg5);
        });

        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(chapter1Label, chapter1Button, chapter2Label, chapter2Button, chapter3Label, chapter3Button, chapter4Label, chapter4Button, chapter5Label, chapter5Button, chapter6Label, chapter6Button, chapter7Label, chapter7Button, chapter8Label, chapter8Button, chapter9Label, chapter9Button, chapter10Label, chapter10Button, chapter11Label, chapter11Button, back);

        return root;
   }

}