package com.mathapp.MostImportantUIs;

import com.mathapp.LogIn;
import com.mathapp.MathApp;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FirstGradeUI{

    public VBox getLoginUI(){

        Label usernameLabel = new Label("Username: ");
        Label passwordLabel = new Label("Password: ");

        TextField usernameField = new TextField();
        TextField passwordField = new TextField();

        Label resultLabel = new Label();

        Button loginButton = new Button("Login");
        Button checkButton = new Button("Sign up");

        checkButton.setOnAction(event->{
            MathApp.showSignUp();
        });

        loginButton.setOnAction(event->{
            String enteredUsername = usernameField.getText();
            String enteredPassword = passwordField.getText();

            boolean isAuthenticated = LogIn.Authentificate(enteredUsername, enteredPassword);
            if(isAuthenticated){
                resultLabel.setText("Login Successful.");
                System.out.println("Welcome to fun math: " + enteredUsername);
            }
            else
                resultLabel.setText("Login Unsuccessful.");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, checkButton, resultLabel);

        return root;
   }

}