package com.mathapp.grade5.Algebra;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

import com.mathapp.MathApp;
public class chapter5{
    private static Stage primaryStage;

    public Scene getChapter5UIalgebra5Grade(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the ' Drawing. Notation. Subunitary, equiunitary, superunitary fractions; percentages '");
        labelLesson1.getStyleClass().add("label");
        Button buttonLesson1 = new Button("Drawing. Notation. Subunitary, equiunitary, superunitary fractions; percentages");
        buttonLesson1.getStyleClass().add("button");
        Label labelLesson2 = new Label("Let's learn more about the ' Equivalent fractions '");
        labelLesson2.getStyleClass().add("label");
        Button buttonLesson2 = new Button("Equivalent fractions");
        buttonLesson2.getStyleClass().add("button");
        Label labelLesson3 = new Label("Let's learn more about the ' Comparison, ordering and placement on the axis '");
        labelLesson3.getStyleClass().add("label");
        Button buttonLesson3 = new Button("Comparison, ordering and placement on the axis");
        buttonLesson3.getStyleClass().add("button");
        Label labelLesson4 = new Label("Let's learn more about ' Subtracting and inserting integers from / into the fraction '");
        labelLesson4.getStyleClass().add("label");
        Button buttonLesson4 = new Button("Subtracting and inserting integers from / into the fraction");
        buttonLesson4.getStyleClass().add("button");
        Label labelLesson5 = new Label("Let's learn more about ' Amplifying and simplifying fractions '");
        labelLesson5.getStyleClass().add("label");
        Button buttonLesson5 = new Button("Amplifying and simplifying fractions");
        buttonLesson5.getStyleClass().add("button");
        Label labelLesson6 = new Label("Let's learn more about ' Adding and subtracting ordinary fractions that have the same denominator '");
        labelLesson6.getStyleClass().add("label");
        Button buttonLesson6 = new Button("Adding and subtracting ordinary fractions that have the same denominator");
        buttonLesson6.getStyleClass().add("button");
        Label labelLesson7 = new Label("Let's learn more about the ' The least common multiple of two natural numbers. Bringing two or more fractions to a common denominator '");
        labelLesson7.getStyleClass().add("label");
        Button buttonLesson7 = new Button("The least common multiple of two natural numbers. Bringing two or more fractions to a common denominator");
        buttonLesson7.getStyleClass().add("button");
        Label labelLesson8 = new Label("Let's learn more about ' Adding and subtracting ordinary fractions that do not have the same denominator '");
        labelLesson8.getStyleClass().add("label");
        Button buttonLesson8 = new Button("Adding and subtracting ordinary fractions that do not have the same denominator");
        buttonLesson8.getStyleClass().add("button");
        Label labelLesson9 = new Label("Let's learn more about ' Multiplying ordinary fractions '");
        labelLesson9.getStyleClass().add("label");
        Button buttonLesson9 = new Button("Multiplying ordinary fractions");
        buttonLesson9.getStyleClass().add("button");
        Label labelLesson10 = new Label("Let's learn more about ' Obtaining a fraction from a random number '");
        labelLesson10.getStyleClass().add("label");
        Button buttonLesson10 = new Button("Obtaining a fraction from a random number");
        buttonLesson10.getStyleClass().add("button");
        Label labelLesson11 = new Label("Let's learn more about ' Raising fractions to a power '");
        labelLesson11.getStyleClass().add("label");
        Button buttonLesson11 = new Button("Raising fractions to a power");
        buttonLesson11.getStyleClass().add("button");
        Label labelLesson12 = new Label("Let's learn more about ' Dividing ordinary fractions '");
        labelLesson12.getStyleClass().add("label");
        Button buttonLesson12 = new Button("Dividing ordinary fractions");
        buttonLesson12.getStyleClass().add("button");
        Label labelLesson13 = new Label("Let's learn more about the ' Order of operations '");
        labelLesson13.getStyleClass().add("label");
        Button buttonLesson13 = new Button("Order of operations");
        buttonLesson13.getStyleClass().add("button");
        Label labelLesson14 = new Label("Let's learn more about ' Percentages '");
        labelLesson14.getStyleClass().add("label");
        Button buttonLesson14 = new Button("Percentages");
        buttonLesson14.getStyleClass().add("button");

        Button back = new Button("Back");
        back.getStyleClass().add("button");

        buttonLesson1.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson2.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson3.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson4.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson5.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson6.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson7.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson8.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson9.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson10.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson11.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson12.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson13.setOnAction(event->{
            System.out.println("To be continued");
        });

        buttonLesson14.setOnAction(event->{
            System.out.println("To be continued");
        });

        back.setOnAction(event->{
            MathApp.show5thGradeAlgebra();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6, 
                                  labelLesson7, buttonLesson7, labelLesson8, buttonLesson8, labelLesson9, buttonLesson9, 
                                  labelLesson10, buttonLesson10, labelLesson11, buttonLesson11, labelLesson12, 
                                  buttonLesson12, labelLesson13, buttonLesson13, labelLesson14, buttonLesson14, back);

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