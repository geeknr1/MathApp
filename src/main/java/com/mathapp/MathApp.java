package com.mathapp;

import com.mathapp.MathSubjects.SubjectAlgebraUI;
import com.mathapp.MathSubjects.SubjectGeometryUI;
import com.mathapp.MathSubjects.SubjectMathAnalysisUI;
import com.mathapp.MostImportantUIs.LogInUI;
import com.mathapp.MostImportantUIs.MathSubjectsUI;
import com.mathapp.MostImportantUIs.SignUpUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MathApp extends Application {
    private static Stage primaryStage;
    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        DataBase database = new DataBase();
        database.connect();
        showLogIn();
        primaryStage.show();
        // Label label = new Label("Welcome to Math Learning Application");
        // StackPane root = new StackPane();
        // root.getChildren().add(label);
        // Scene scene = new Scene(root, 800, 600);
        // primaryStage.setTitle("Math Learning Application");
        // primaryStage.setScene(scene);
        // primaryStage.show();
    }

    public static void showLogIn(){
        LogInUI loginUI = new LogInUI();
        Scene loginScene = new Scene(loginUI.getLoginUI(), 800, 600);
        // loginScene.getStylesheets().add(SignUpUI.class.getResource("style.css").toExternalForm());
        primaryStage.setScene(loginScene);
    }

    public static void showDashBoard(){
        VBox dashboard = new VBox(10);
        MathSubjectsUI subjectsUI = new MathSubjectsUI();
        Label dashboardLabel = new Label("Welcome to fun math.");
        dashboard.getChildren().addAll(dashboardLabel, subjectsUI.getMathSubjectsUI(primaryStage));
        Scene dashboardScene = new Scene(dashboard, 800, 600);
        primaryStage.setScene(dashboardScene);    
    }

    public static void showSignUp(){
        SignUpUI signupUI = new SignUpUI();
        Scene signupScene = new Scene(signupUI.getSignUpUI(), 800, 600);
        primaryStage.setScene(signupScene);
    }

    public static void showMathSubjects(){
        MathSubjectsUI subjectsUI = new MathSubjectsUI();
        Scene subjectsScene = new Scene(subjectsUI.getMathSubjectsUI(primaryStage), 800, 600);
        primaryStage.setScene(subjectsScene);
    }

    public static void showAlgebraSubject(){
        SubjectAlgebraUI subjectsAlgebraUI = new SubjectAlgebraUI();
        Scene subjectsAlgebraScene = new Scene(subjectsAlgebraUI.getAlgebraChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(subjectsAlgebraScene);
    }

    public static void showGeometrySubject(){
        SubjectGeometryUI subjectsGeometryUI = new SubjectGeometryUI();
        Scene subjectsGeometryScene = new Scene(subjectsGeometryUI.getGeometrySubjectUI(primaryStage), 800, 600);
        primaryStage.setScene(subjectsGeometryScene);
    }

    public static void showMathematicalAnalysisSubject(){
        SubjectMathAnalysisUI subjectsMathAnalysisUI = new SubjectMathAnalysisUI();
        Scene subjectsMathAnalysisScene = new Scene(subjectsMathAnalysisUI.getMathAnalysisSubjectUI(primaryStage), 800, 600);
        primaryStage.setScene(subjectsMathAnalysisScene); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}