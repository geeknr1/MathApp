package com.mathapp;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

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
                return true;
            }
            return mongoPassword.equals(password);
        }
        return false;
    }
}