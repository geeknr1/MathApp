package com.mathapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LogIn extends Application{
    private User user;
    private final String correctUsername = user.getUserName();
    private final String correctPassword = user.getPassword();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Account Login");

        Label usernameLabel = new Label("Username: ");
        Label passwordLabel = new Label("Password: ");

        TextField usernameField = new TextField();
        TextField passwordField = new TextField();

        Label resultLabel = new Label();

        Button loginButton = new Button("Login");

        loginButton.setOnAction(event->{
            String enteredUsername = usernameField.getText();
            String enteredPassword = passwordField.getText();

            if(enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword))
                resultLabel.setText("Login Successful.");
            else
                resultLabel.setText("Login Unsuccessful.");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, resultLabel);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Account");
        primaryStage.show();
   }

}





















// package com.mathapp;

// import java.awt.event.ActionEvent;
// import java.beans.EventHandler;
// import java.net.URL;
// import java.util.ResourceBundle;

// import javafx.fxml.FXML;
// import javafx.fxml.Initializable;

// public class LogIn implements Initializable{
//     @FXML
//     private Button buttonLogout;

//     @FXML
//     private Label label_welcome;

//     @FXML
//     private Label label_for_app;

//     @Override
//     public void initialize(URL location, ResourceBundle resources){
//         buttonLogout.setOnAction(new EventHandler<ActionEvent>(){
//             @Override
//             public void handle(ActionEvent event){

//             }
//         });
//     }

//     public void setUserInfo(String username, String forApp){
//         label_welcome.setUserName("Welcome " + username + " !");
//     }
// }