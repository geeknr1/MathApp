package com.mathapp.grade11.Math_Analysis;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

import com.mathapp.MathApp;
import com.mathapp.grade11.Math_Analysis.ch1Lessons.Lesson1;
import com.mathapp.grade11.Math_Analysis.ch1Lessons.Lesson2;
import com.mathapp.grade11.Math_Analysis.ch1Lessons.Lesson3;
public class chapter1{
    private static Stage primaryStage;

    public Scene getChapter1UImathanalysis11Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Sets of points on the real line' ; 'Intervals' and 'Neighborhoods'");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Sets of points on the real line. Intervals. Neighborhoods");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about 'Monotonic sequences' ; 'Bounded sequences' and 'Convergent sequences'");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Monotonic sequences. Bounded sequences. Convergent sequences");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the 'Limits of sequences' and the 'Cases of indeterminacy'");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Limits of sequences. Cases of indeterminacy");
        buttonLesson3.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");
        
        buttonLesson1.setOnAction(event->{
            Lesson1 algebraCh1Gr11Lesson1UI = new Lesson1();
            Scene algebraCh1Gr11Lesson1Scene = algebraCh1Gr11Lesson1UI.getLesson1UIch1Grade11MA(stage);
            primaryStage.setScene(algebraCh1Gr11Lesson1Scene);
        });

        buttonLesson2.setOnAction(event->{
            Lesson2 algebraCh1Gr11Lesson2UI = new Lesson2();
            Scene algebraCh1Gr11Lesson2Scene = algebraCh1Gr11Lesson2UI.getLesson2UIch1Grade11MA(stage);
            primaryStage.setScene(algebraCh1Gr11Lesson2Scene);
        });

        buttonLesson3.setOnAction(event->{
            Lesson3 algebraCh1Gr11Lesson3UI = new Lesson3();
            Scene algebraCh1Gr11Lesson3Scene = algebraCh1Gr11Lesson3UI.getLesson3UIch1Grade11MA(stage);
            primaryStage.setScene(algebraCh1Gr11Lesson3Scene);
        });

        back.setOnAction(event->{
            MathApp.show11thGradeMathAnalysis();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, back);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return scene;
    }

    public static void showMA5thCh1Lesson1(){
        Lesson1 lesson1Grade11MAUI = new Lesson1();
        Scene lesson1Grade11MAScene = lesson1Grade11MAUI.getLesson1UIch1Grade11MA(primaryStage);
        primaryStage.setScene(lesson1Grade11MAScene);
    }

    public static void showMA5thCh1Lesson2(){
        Lesson2 lesson2Grade11MAUI = new Lesson2();
        Scene lesson2Grade11MAScene = lesson2Grade11MAUI.getLesson2UIch1Grade11MA(primaryStage);
        primaryStage.setScene(lesson2Grade11MAScene);
    }

    public static void showMA5thCh1Lesson3(){
        Lesson3 lesson3Grade5AlgUI = new Lesson3();
        Scene lesson3Grade5AlgScene = lesson3Grade5AlgUI.getLesson3UIch1Grade11MA(primaryStage);
        primaryStage.setScene(lesson3Grade5AlgScene);
    }
}
