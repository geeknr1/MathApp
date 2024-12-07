package com.mathapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUpUI{

    public VBox getSignUpUI(){

        Label nameLabel = new Label("Name: ");
        Label surnameLabel = new Label("Surname: ");
        Label usernameLabel = new Label("Username: ");
        Label emailLabel = new Label("Email: ");
        Label passwordLabel = new Label("Password: ");
        Label confirmPasswordLabel = new Label("Confirm Password: ");

        TextField nameField = new TextField();
        TextField surnameField = new TextField();
        TextField usernameField = new TextField();
        TextField emailField = new TextField();
        PasswordField passwordField = new PasswordField();
        PasswordField confirmPasswordField = new PasswordField();

        Label resultLabel = new Label();

        Button signupButton = new Button("Sign Up");
        Button login = new Button("Log In");

        signupButton.setOnAction(event->{
            String enteredName = nameField.getText();
            String enteredSurname = surnameField.getText();
            String enteredUsername = usernameField.getText();
            String enteredEmail = emailField.getText();
            String enteredPassword = passwordField.getText();
            String enteredConfirmPassword = confirmPasswordField.getText();

        boolean success=SignUp.authentificate(enteredName, enteredSurname, enteredUsername, enteredEmail, enteredPassword, enteredConfirmPassword);
        
        if(success){
            resultLabel.setText("Successful Sign Up.");
        }
        else
            resultLabel.setText("Unsuccessful Sign Up.");
        });

        login.setOnAction(event->{
            MathApp.showLogIn();
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(nameLabel, nameField, surnameLabel, surnameField, usernameLabel, usernameField, emailLabel, emailField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, signupButton, login, resultLabel);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Sign Up Account");
        // primaryStage.show();

        return root;
   }
}