package com.mathapp;
// import javafx.application.Application;
// //import ro.pub.cs.aipi.User.controller.Authentication;
// import javafx.geometry.Insets;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;



public class User{
    private int id;
    private String userName;
    private String email;
    private String password;

    public User()  {}
    public User(int i, String name, String email, String pass){
        this.id = i;
        this.userName = name;
        this.email = email;
        this.password = pass;
    }

    // @Override
    // public void start(Stage main) throws Exception{
    //     new Authentication().start();
    // }

    // public static void main(String[] args) {
    //     launch(args);
    // }

    public int getID(){
        return this.id;
    }

    public void setID(int other){
        this.id = other;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String other){
        this.userName = other;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String other){
        this.email = other;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String other){
        this.password = other;
    }

    public void register(){
        System.out.println("User registered.");
    }

    public void login(){
        System.out.println("User logged in.");
    }

    public double currentProgress(double current){
        return current;
    }

    public void displayProgress(double current){
        double xp;
        xp = current;
        System.out.println("Current XP of User: " + this.userName + ", is " + xp);
    }
}