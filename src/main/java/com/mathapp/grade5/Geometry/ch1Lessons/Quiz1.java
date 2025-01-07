package com.mathapp.grade5.Geometry.ch1Lessons;

import java.util.Arrays;

import com.mathapp.Pair;
import com.mathapp.Quiz;
import com.mathapp.grade5.Geometry.chapter1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz1{
    private static Stage primaryStage;
    private static Quiz quiz1 = new Quiz();
    private static Quiz quiz1Part2 = new Quiz();

    public void generateQuestions(Stage stage){
        quiz1.addQuizSingleChoice("Mihai draws four different points on his notebook, denoted M, N, P and Q. What is the maximum number of lines determined by any 2 of the given points that Mihai can draw? Draw a drawing too!", "6");
        
        quiz1.addQuizMultipleChoice("Jessica says: 'I drew 4 distinct points on my notebook, R, S, T and U, and then drew 4 different lines determined by any 2 of the 4 points.'. What is the statement made by Jessica? Draw a drawing too!", 
                                                                                                                                    Arrays.asList(new Pair("True", false),
                                                                                                                                                  new Pair("False", true)));
                                                                                                                                                 
        quiz1.addQuizMultipleChoice("Consider the figure below. Specify a parallel line:",       Arrays.asList(new Pair("b", false),
                                                                                                               new Pair("c", false),
                                                                                                               new Pair("d", true),
                                                                                                               new Pair("e", false)));

    }

    public void generateQuestions2(){
        quiz1Part2.addQuizMultipleChoice("Consider the figure below. The lines e and a are intersecting at the point: ", Arrays.asList(new Pair("M", false),
                                                                                                                                       new Pair("P", false),
                                                                                                                                       new Pair("Q", false),
                                                                                                                                       new Pair("R", true)));
    }

    public Scene getQuizUI(Stage stage){
        primaryStage = stage;
        generateQuestions(stage);
        VBox root = quiz1.generateQuiz(primaryStage);

        Image image = new Image("/com/mathapp/grade5/Geometry/ch1Lessons/quiz1_img/abd1.PNG");
        ImageView imageView1 = new ImageView(image);
        imageView1.setFitHeight(155);
        imageView1.setFitWidth(200);
        imageView1.setPreserveRatio(true);
        root.getChildren().add(imageView1);
        
        generateQuestions2();
        VBox root2 = quiz1Part2.generateQuiz(primaryStage);

        Image image2 = new Image("/com/mathapp/grade5/Geometry/ch1Lessons/quiz1_img/abd2.PNG");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(155);
        imageView2.setFitWidth(200);
        imageView2.setPreserveRatio(true);
        root2.getChildren().addAll(imageView2, root);


        Button back = new Button("Back");

        back.setOnAction(event->{
            chapter1.showGeometry5thCh1Lesson1();
        });

        root2.getChildren().add(back);

        
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.VERTICAL);

        scrollBar.setMin(0);
        scrollBar.setMax(400);
        scrollBar.setPrefHeight(800);
        scrollBar.setLayoutX(850);

        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            root2.setLayoutY(-newVal.doubleValue());
        });

        Pane contentPane = new Pane();
        contentPane.getChildren().addAll(root2, scrollBar);

        VBox newRoot = new VBox(contentPane);
        Scene quizScene = new Scene(newRoot, 800, 600);
        quizScene.getStylesheets().add(getClass().getResource("/styles/algebra/5thGrade.css").toExternalForm());

        return quizScene;
    }
}