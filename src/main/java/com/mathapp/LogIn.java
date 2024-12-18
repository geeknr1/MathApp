package com.mathapp;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 * Rolul acestei clase este de a verifica daca un user oarecare se afla in baza de date Mongo sau nu.
 */

public class LogIn{
    public static boolean Authentificate(String username, String password){
        MongoCollection<Document> documents = DataBase.getCollection("Users");
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