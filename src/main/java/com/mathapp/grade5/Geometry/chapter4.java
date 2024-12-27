package com.mathapp.grade5.Geometry;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class chapter4{
    private static Stage primaryStage;

    public VBox getChapter1UI(Stage stage){

        primaryStage = stage;

        Label labelLesson1 = new Label("Let's learn more about the 'Units of measurement for length' and 'Conversions'");
        Button buttonLesson1 = new Button("Units of measurement for length. Conversions");
        Label labelLesson2 = new Label("Let's learn more about the ' Units of measurement for surfaces and'Conversions'");
        Button buttonLesson2 = new Button("Units of measurement for surfaces. Conversions");
        Label labelLesson3 = new Label("Let's learn more about the 'Units of measurement for volume and 'Conversions'");
        Button buttonLesson3 = new Button("Units of measurement for volume. Conversions");
        Label labelLesson4 = new Label("Let's learn more about the 'Units of measurement for capacity' and 'Conversions'");
        Button buttonLesson4 = new Button("Units of measurement for capacity. Conversions");
        Label labelLesson5 = new Label("Let's learn more about 'Units of measurement for mass' and 'Conversions'");
        Button buttonLesson5 = new Button("Units of measurement for mass. Conversions");
        Label labelLesson6 = new Label("Let's learn more about the 'Units of measurement for time' and 'Conversions'");
        Button buttonLesson6 = new Button("Units of measurement for time. Conversions");
        
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

        VBox root = new VBox(10);
        root.getChildren().addAll(labelLesson1, buttonLesson1, labelLesson2, buttonLesson2, labelLesson3, buttonLesson3, 
                                  labelLesson4, buttonLesson4, labelLesson5, buttonLesson5, labelLesson6, buttonLesson6);

        return root;
    }
}