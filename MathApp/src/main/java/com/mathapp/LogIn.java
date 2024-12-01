package com.mathapp;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class LogIn{
    public static boolean Authentificate(String username, String password){
        MongoCollection<Document> documents = DataBase.getCollection("User");
        Document userDoc = documents.find(new Document("username",username)).first();
        if(userDoc != null){
            String mongoPassword = userDoc.getString("password");
            if(mongoPassword.equals(password)){
                MathApp.showDashBoard();
            }
            return mongoPassword.equals(password);
        }
        return false;
    }
}