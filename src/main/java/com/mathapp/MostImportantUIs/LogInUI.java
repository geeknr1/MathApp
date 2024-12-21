package com.mathapp.MostImportantUIs;

import com.mathapp.LogIn;
import com.mathapp.MathApp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata interfata paginii de login
 */

public class LogInUI{

/**
 * Metoda ce returneaza scena pentru login
 * In metoda ne folosim de functii precum 'getStyleClass()' si 'getStylesheets()' pentru a lega acest fisier de fisierul de css pentru a infrumuseta interfata paginii
 * @return  returneaza scena ce afiseaza interfata de login
 */
    public Scene getLoginUI(){

        Label usernameLabel = new Label("Username: ");
        usernameLabel.getStyleClass().add("label");
        Label passwordLabel = new Label("Password: ");
        passwordLabel.getStyleClass().add("label");

        TextField usernameField = new TextField();
        usernameField.getStyleClass().add("text-field");
        TextField passwordField = new TextField();
        usernameField.getStyleClass().add("text-field");

        Label resultLabel = new Label();

        Button loginButton = new Button("Login");
        loginButton.getStyleClass().add("button");
        Button checkButton = new Button("Sign up");
        checkButton.getStyleClass().add("button");

        checkButton.setOnAction(event->{
            MathApp.showSignUp();
        });

        loginButton.setOnAction(event->{
            String enteredUsername = usernameField.getText();
            String enteredPassword = passwordField.getText();

            boolean isAuthenticated = LogIn.Authentificate(enteredUsername, enteredPassword);
            if(isAuthenticated){
                resultLabel.setText("Login Successful.");
                MathApp.showDashBoard();
                System.out.println("Welcome to fun math: " + enteredUsername);
            }
            else
                resultLabel.setText("Login Unsuccessful.");
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, checkButton, resultLabel);
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/login.css").toExternalForm());


        return scene;
   }

}
