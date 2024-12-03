package com.mathapp;


import com.mongodb.client.MongoCollection;

import org.bson.Document;

public class SignUp {

    public static boolean authentificate(String name, String surname, String username, String email, String password, String checkPassword) {
        if (name.isEmpty() || surname.isEmpty() || email.isEmpty() || password.isEmpty() || checkPassword.isEmpty()) {
            System.out.println("All fields are required.");
            return false;
        }

        if (!(password.equals(checkPassword))) {
            System.out.println("Passwords must match.");
            return false;
        }

        try {
            MongoCollection<Document> documents = DataBase.getCollection("Users");
            Document doc = documents.find(new Document("$or", 
                           java.util.Arrays.asList(
                           new Document("username", username), 
                           new Document("email", email))
            )).first();

            if(doc != null){
            System.out.println("Username already taken.");
            return false;
         }

        Document newUser = new Document("name", name).append("surname", surname).append("username", username).append("email", email).append("password", password).append("checkPassword", checkPassword);
        documents.insertOne(newUser);
        System.out.println(newUser.toJson());
        System.out.println("System user: " + username + ", successfully registered");
        return true;
        } catch (Exception e) {
            System.out.println("Error...loser!");
        }
    return false;
    }
}
