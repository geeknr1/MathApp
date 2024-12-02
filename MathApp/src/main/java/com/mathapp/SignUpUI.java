package com.mathapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUpUI{
    // private static final String introducedName;
    // private static final String introducedSurname;
    // private static final String introducedUsername;
    // private static final String introducedEmail;
    // private static final String introducedPassword;
    // private static final String confirmPassword;
    // private static final boolean confirmedPassword;

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

        VBox root = new VBox(10);
        root.getChildren().addAll(nameLabel, nameField, surnameLabel, surnameField, usernameLabel, usernameField, emailLabel, emailField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, signupButton, resultLabel);

        // Scene scene = new Scene(root, 300, 200);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("Sign Up Account");
        // primaryStage.show();

        return root;
   }
}