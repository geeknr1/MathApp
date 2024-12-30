package com.mathapp;

import com.mathapp.ChaptersAlgebraGrades.Algebra10thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra11thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra12thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra5thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra6thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra7thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra8thChaptersUI;
import com.mathapp.ChaptersAlgebraGrades.Algebra9thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry10thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry5thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry6thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry7thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry8thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry9thChaptersUI;
import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis11thChaptersUI;
import com.mathapp.ChaptersMathAnalysisGrades.MathematicalAnalysis12thChaptersUI;
import com.mathapp.MathSubjects.SubjectAlgebraUI;
import com.mathapp.MathSubjects.SubjectGeometryUI;
import com.mathapp.MathSubjects.SubjectMathAnalysisUI;
import com.mathapp.MostImportantUIs.LogInUI;
import com.mathapp.MostImportantUIs.MathSubjectsUI;
import com.mathapp.MostImportantUIs.SignUpUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Aceasta clasa este baza aplicatiei noastre, in care utilizatorii o sa invete matematica din scoala generala si matematica de liceu.
 */
public class MathApp extends Application {
    private static Stage primaryStage;

    /**
     * Aceasta metoda ne conecteaza la baza de date Mongo, ne arata pagina de login de fiecare data cand ne conectam la aplicatie pentru prima data si ne arata "scena primara"
     */
    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        DataBase database = new DataBase();
        database.connect();
        showLogIn();
        primaryStage.show();
    }

    /**
     * Aceasta metoda ne seteaza scena cu login, cu alte cuvinte ne arata prima pagina din aplicatie
     */

    public static void showLogIn(){
        LogInUI loginUI = new LogInUI();
        Scene loginScene = loginUI.getLoginUI();
        primaryStage.setScene(loginScene);
    }

    /**
     * Aceasta metoda seteaza scena dashboardului, unde gasim subiectele matematicii, cu alte cuvinte, algebra, geometria si analiza matematica
     */

    public static void showDashBoard(){
        //VBox dashboard = new VBox(10);
        MathSubjectsUI subjectsUI = new MathSubjectsUI();
        // Label dashboardLabel = new Label("Welcome to fun math.");
        // dashboard.getChildren().addAll(dashboardLabel, subjectsUI.getMathSubjectsUI(primaryStage));
        Scene dashboardScene = subjectsUI.getMathSubjectsUI(primaryStage);
        primaryStage.setScene(dashboardScene);    
    }

        /**
     * Aceasta metoda seteaza scena in care noi utilizatori se autentifica la aplicatie si sunt adaugati in baza de date Mongo
     */

    public static void showSignUp(){
        SignUpUI signupUI = new SignUpUI();
        Scene signupScene = signupUI.getSignUpUI();
        primaryStage.setScene(signupScene);
    }

    /**
     * Aceasta metoda seteaza subiectele matematicii, cu alte cuvinte butoanele catre capitolele claselor V - XII pentru algebra, geometrie si analiza matematica
     */

    public static void showMathSubjects(){
        MathSubjectsUI subjectsUI = new MathSubjectsUI();
        Scene subjectsScene = subjectsUI.getMathSubjectsUI(primaryStage);
        primaryStage.setScene(subjectsScene);
    }

    /**
     * Aceasta metoda seteaza scena cu butoanele care conduc la capitolele subiectului "Algebra"
     */

    public static void showAlgebraSubject(){
        SubjectAlgebraUI subjectsAlgebraUI = new SubjectAlgebraUI();
        Scene subjectsAlgebraScene = subjectsAlgebraUI.getAlgebraChaptersUI(primaryStage);
        primaryStage.setScene(subjectsAlgebraScene);
    }

    /**
     * Aceasta metoda seteaza scena cu butoanele care conduc la capitolele subiectului "Geometrie"
     */

    public static void showGeometrySubject(){
        SubjectGeometryUI subjectsGeometryUI = new SubjectGeometryUI();
        Scene subjectsGeometryScene = subjectsGeometryUI.getGeometrySubjectUI(primaryStage);
        primaryStage.setScene(subjectsGeometryScene);
    }

    /**
     * Aceasta metoda seteaza scena cu butoanele care conduc la capitolele subiectului "Analiza Matematica"
     */

    public static void showMathematicalAnalysisSubject(){
        SubjectMathAnalysisUI subjectsMathAnalysisUI = new SubjectMathAnalysisUI();
        Scene subjectsMathAnalysisScene = subjectsMathAnalysisUI.getMathAnalysisSubjectUI(primaryStage);
        primaryStage.setScene(subjectsMathAnalysisScene); 
    }

    /**
     * Aceasta metoda seteaza scena cu label-ul "To be continued." si butonul "Back" catre butonul subiectului "Algebra"
     */

    public static void show5thGradeAlgebra(){
        Algebra5thChaptersUI algebra5thLessonsUI = new Algebra5thChaptersUI();
        Scene algebra5thLessonsScene = algebra5thLessonsUI.getAlgebra5thChaptersUI(primaryStage);
        primaryStage.setScene(algebra5thLessonsScene);
    }

    public static void show6thGradeAlgebra(){
        Algebra6thChaptersUI algebra6thLessonsUI = new Algebra6thChaptersUI();
        Scene algebra6thLessonsScene = algebra6thLessonsUI.getAlgebra6thChaptersUI(primaryStage);
        primaryStage.setScene(algebra6thLessonsScene);
    }

    public static void show7thGradeAlgebra(){
        Algebra7thChaptersUI algebra7thLessonsUI = new Algebra7thChaptersUI();
        Scene algebra7thLessonsScene = new Scene(algebra7thLessonsUI.getAlgebra7thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra7thLessonsScene);
    }

    public static void show8thGradeAlgebra(){
        Algebra8thChaptersUI algebra8thLessonsUI = new Algebra8thChaptersUI();
        Scene algebra8thLessonsScene = new Scene(algebra8thLessonsUI.getAlgebra8thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra8thLessonsScene);
    }

    public static void show9thGradeAlgebra(){
        Algebra9thChaptersUI algebra9thLessonsUI = new Algebra9thChaptersUI();
        Scene algebra9thLessonsScene = new Scene(algebra9thLessonsUI.getAlgebra9thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra9thLessonsScene);
    }

    public static void show10thGradeAlgebra(){
        Algebra10thChaptersUI algebra10thLessonsUI = new Algebra10thChaptersUI();
        Scene algebra10thLessonsScene = new Scene(algebra10thLessonsUI.getAlgebra10thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra10thLessonsScene);
    }

    public static void show11thGradeAlgebra(){
        Algebra11thChaptersUI algebra11thLessonsUI = new Algebra11thChaptersUI();
        Scene algebra11thLessonsScene = new Scene(algebra11thLessonsUI.getAlgebra11thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra11thLessonsScene);
    }

    public static void show12thGradeAlgebra(){
        Algebra12thChaptersUI algebra12thLessonsUI = new Algebra12thChaptersUI();
        Scene algebra12thLessonsScene = new Scene(algebra12thLessonsUI.getAlgebra12thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(algebra12thLessonsScene);
    }

    public static void show5thGradeGeometry(){
        Geometry5thChaptersUI geometry5thLessonsUI = new Geometry5thChaptersUI();
        Scene geometry5thLessonsScene = geometry5thLessonsUI.getGeometry5thChaptersUI(primaryStage);
        primaryStage.setScene(geometry5thLessonsScene);
    }

    public static void show6thGradeGeometry(){
        Geometry6thChaptersUI geometry6thLessonsUI = new Geometry6thChaptersUI();
        Scene geometry6thLessonsScene = new Scene(geometry6thLessonsUI.getGeometry6thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(geometry6thLessonsScene);
    }

    public static void show7thGradeGeometry(){
        Geometry7thChaptersUI geometry7thLessonsUI = new Geometry7thChaptersUI();
        Scene geometry7thLessonsScene = new Scene(geometry7thLessonsUI.getGeometry7thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(geometry7thLessonsScene);
    }

    public static void show8thGradeGeometry(){
        Geometry8thChaptersUI geometry8thLessonsUI = new Geometry8thChaptersUI();
        Scene geometry8thLessonsScene = new Scene(geometry8thLessonsUI.getGeometry8thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(geometry8thLessonsScene);
    }

    public static void show9thGradeGeometry(){
        Geometry9thChaptersUI geometry9thLessonsUI = new Geometry9thChaptersUI();
        Scene geometry9thLessonsScene = new Scene(geometry9thLessonsUI.getGeometry9thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(geometry9thLessonsScene);
    }

    public static void show10thGradeGeometry(){
        Geometry10thChaptersUI geometry10thLessonsUI = new Geometry10thChaptersUI();
        Scene geometry10thLessonsScene = new Scene(geometry10thLessonsUI.getGeometry10thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(geometry10thLessonsScene);
    }

    public static void show11thGradeMathAnalysis(){
        MathematicalAnalysis11thChaptersUI mathAnalysis11thLessonsUI = new MathematicalAnalysis11thChaptersUI();
        Scene mathAnalysiss11thLessonsScene = mathAnalysis11thLessonsUI.getMathematicalAnalysis11thChaptersUI(primaryStage);
        primaryStage.setScene(mathAnalysiss11thLessonsScene);
    }

    public static void show12thGradeMathAnalysis(){
        MathematicalAnalysis12thChaptersUI mathAnalysis12thLessonsUI = new MathematicalAnalysis12thChaptersUI();
        Scene mathAnalysiss12thLessonsScene = new Scene(mathAnalysis12thLessonsUI.getMathematicalAnalysis12thChaptersUI(primaryStage), 800, 600);
        primaryStage.setScene(mathAnalysiss12thLessonsScene);
    }

    public static void showToBeContinued(){
        VBox futureUI = new VBox(10);
        Label update = new Label("To be continued.");
        Button back = new Button("Back");
        back.setOnAction(event->{
            MathApp.showAlgebraSubject();
        });
        futureUI.getChildren().addAll(update, back);

        Scene toBeContinued = new Scene(futureUI, 800, 600);
        primaryStage.setScene(toBeContinued);
    }

    public static void main(String[] args) {
        launch(args);
    }
}