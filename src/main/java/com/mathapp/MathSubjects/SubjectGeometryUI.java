package com.mathapp.MathSubjects;

import com.mathapp.ChaptersGeometryGrades.Geometry10thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry5thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry6thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry7thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry8thChaptersUI;
import com.mathapp.ChaptersGeometryGrades.Geometry9thChaptersUI;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clasa aceasta contine o lista cu butoanele claselor V - XII care duc catre capitolele fiecarei clase enumerate si care apartine de subiectul geometriei.
*/

public class SubjectGeometryUI{

    private static Stage primaryStage;

/**
 * Cea mai importanta functie built-in din aceasta metoda este reprezentata de 'setOnAction' al carei rol este sa creeze legatura dintre aceasta pagina din ui si pagina urmatoare care contine butoanele catre capitolele claselor V - XII care apartin geometriei
*/
    public VBox getGeometrySubjectUI(Stage stage){

        primaryStage = stage;

        Label fifthGradeLabel = new Label("Geometry chapters for the 5th grade");
        Button fifthGradeButton = new Button("5th grade");
        Label sixthGradeLabel = new Label("Geometry chapters for the 6th grade");
        Button sixthGradeButton = new Button("6th grade");
        Label seventhGradeLabel = new Label("Geometry chapters for the 7th grade");
        Button seventhGradeButton = new Button("7th grade");
        Label eigthGradeLabel = new Label("Geometry chapters for the 8th grade");
        Button eithGradeButton = new Button("8th grade");
        Label ninthGradeLabel = new Label("Geometry chapters for the 9th grade");
        Button ninthGradeButton = new Button("9th grade");
        Label tenthGradeLabel = new Label("Geometry chapters for 10th grade");
        Button tenthGradeButton = new Button("10th grade");

        Label resultLabel = new Label();

        Button back = new Button("Back");

        fifthGradeButton.setOnAction(event->{
            VBox fifthGrade = new VBox(10);
            Geometry5thChaptersUI fifthGradeUI = new Geometry5thChaptersUI();
            Label fiveGradeLabel = new Label("Welcome to the 5th grade in Geometry!");
            fifthGrade.getChildren().addAll(fiveGradeLabel, fifthGradeUI.getGeometry5thChaptersUI());
            Scene fifthGradeScene = new Scene(fifthGrade, 600, 800);
            primaryStage.setScene(fifthGradeScene);
        });

        sixthGradeButton.setOnAction(event->{
            VBox sixthGrade = new VBox(10);
            Geometry6thChaptersUI sixthGradeUI = new Geometry6thChaptersUI();
            Label sixGradeLabel = new Label("Welcome to 6th grade in Geometry!");
            sixthGrade.getChildren().addAll(sixGradeLabel, sixthGradeUI.getGeometry6thChaptersUI());
            Scene sixthGradeScene = new Scene(sixthGrade, 600, 800);
            primaryStage.setScene(sixthGradeScene);
        });

        seventhGradeButton.setOnAction(event->{
            VBox seventhGrade = new VBox(10);
            Geometry7thChaptersUI seventhGradeUI = new Geometry7thChaptersUI();
            Label sevenGradeLabel = new Label("Welcome to 7th grade in Geometry!");
            seventhGrade.getChildren().addAll(sevenGradeLabel, seventhGradeUI.getGeometry7thChaptersUI());
            Scene seventhGradeScene = new Scene(seventhGrade, 600, 800);
            primaryStage.setScene(seventhGradeScene);
        });

        eithGradeButton.setOnAction(event->{
            VBox eithGrade = new VBox(10);
            Geometry8thChaptersUI eithGradeUI = new Geometry8thChaptersUI();
            Label eightGradeLabel = new Label("Welcome to 8th grade in Geometry!");
            eithGrade.getChildren().addAll(eightGradeLabel, eithGradeUI.getGeometry8thChaptersUI());
            Scene eithGradeScene = new Scene(eithGrade, 600, 800);
            primaryStage.setScene(eithGradeScene);
        });

        ninthGradeButton.setOnAction(event->{
            VBox ninthGrade = new VBox(10);
            Geometry9thChaptersUI ninthGradeUI = new Geometry9thChaptersUI();
            Label nineGradeLabel = new Label("Welcome to 9th grade in Geometry!");
            ninthGrade.getChildren().addAll(nineGradeLabel, ninthGradeUI.getGeometry9thChaptersUI());
            Scene ninthGradeScene = new Scene(ninthGrade, 600, 800);
            primaryStage.setScene(ninthGradeScene);
        });

        tenthGradeButton.setOnAction(event->{
            VBox tenthGrade = new VBox(10);
            Geometry10thChaptersUI tenthGradeUI = new Geometry10thChaptersUI();
            Label tenGradeLabel = new Label("Welcome to 10th grade in Geometry!");
            tenthGrade.getChildren().addAll(tenGradeLabel, tenthGradeUI.getGeometry10thChaptersUI());
            Scene tenthGradeScene = new Scene(tenthGrade, 600, 800);
            primaryStage.setScene(tenthGradeScene);
        });

        back.setOnAction(event->{
            MathApp.showMathSubjects();
        });


        VBox root = new VBox(10);
        root.getChildren().addAll(fifthGradeLabel, fifthGradeButton, sixthGradeLabel, sixthGradeButton, seventhGradeLabel, seventhGradeButton, eigthGradeLabel, eithGradeButton, ninthGradeLabel, ninthGradeButton, tenthGradeLabel, tenthGradeButton, back, resultLabel);

        return root;
   }

}