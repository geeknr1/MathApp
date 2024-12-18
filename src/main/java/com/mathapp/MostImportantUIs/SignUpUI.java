package com.mathapp.MostImportantUIs;

import com.mathapp.MathApp;
import com.mathapp.SignUp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Clasa aceasta arata interfata paginii de signup
 */
public class SignUpUI{

    //private static Stage primaryStage;

/**
 * Metoda ce returneaza scena pentru signup
 * In metoda ne folosim de functii precum 'getStyleClass()' si 'getStylesheets()' pentru a lega acest fisier de fisierul de css pentru a infrumuseta interfata paginii
 * @return  returneaza scena ce afiseaza interfata de signup
 */
    public Scene getSignUpUI(){

        Label nameLabel = new Label("Name: ");
        nameLabel.getStyleClass().add("label");
        Label surnameLabel = new Label("Surname: ");
        surnameLabel.getStyleClass().add("label");
        Label usernameLabel = new Label("Username: ");
        usernameLabel.getStyleClass().add("label");
        Label emailLabel = new Label("Email: ");
        emailLabel.getStyleClass().add("label");
        Label passwordLabel = new Label("Password: ");
        passwordLabel.getStyleClass().add("label");
        Label confirmPasswordLabel = new Label("Confirm Password: ");
        confirmPasswordLabel.getStyleClass().add("label");

        TextField nameField = new TextField();
        nameField.getStyleClass().add("text-field");
        TextField surnameField = new TextField();
        surnameField.getStyleClass().add("text-field");
        TextField usernameField = new TextField();
        usernameField.getStyleClass().add("text-field");
        TextField emailField = new TextField();
        emailField.getStyleClass().add("text-field");
        PasswordField passwordField = new PasswordField();
        passwordField.getStyleClass().add("password-field");
        PasswordField confirmPasswordField = new PasswordField();
        passwordField.getStyleClass().add("password-field");

        Label resultLabel = new Label();
        resultLabel.getStyleClass().add("label");

        Button signupButton = new Button("Sign Up");
        signupButton.getStyleClass().add("button");
        Button login = new Button("Log In");
        login.getStyleClass().add("button");

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
        // root.getStyleClass().add("root");

    
        root.getChildren().addAll(nameLabel, nameField, surnameLabel, surnameField, usernameLabel, usernameField, emailLabel, emailField, passwordLabel, passwordField, confirmPasswordLabel, confirmPasswordField, signupButton, login, resultLabel);

        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("/styles/signup.css").toExternalForm());


        return scene;
   }
}