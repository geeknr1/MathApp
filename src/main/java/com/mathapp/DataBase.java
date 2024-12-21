package com.mathapp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import java.util.*;
import org.bson.Document;


/**
 * Rolul acestei clase este de a conecta codul aplicatiei la o baza de date Mongo. Aplicatiile n-au cum sa existe fara baze de date.
 */
public class DataBase {
    private static MongoClient mongoClient;
    private static MongoDatabase dataBase;
    private static HashMap<String, MongoCollection<Document>> MockCollection = new HashMap<>();

    public static void connect(){
        String url = "mongodb+srv://alexsecburbea:ollmGWGuukDjhkSr@mathapplication.gib14.mongodb.net/?retryWrites=true&w=majority&appName=MathApplication";

        try {
            mongoClient = MongoClients.create(url);
            dataBase = mongoClient.getDatabase("MathApp");
            System.out.println("Connected to db...winner.");
        } catch (Exception e) {
            System.out.println("Not connected to db...loser.");
        }

    }

    public static void disconnect(){
        if(mongoClient != null){
            mongoClient.close();
            System.out.println("User successfully disconnected from db...mega loser.");
        }
    }

    public static com.mongodb.client.MongoCollection<org.bson.Document> getCollection(String collectionName){
        if(MockCollection.containsKey(collectionName)){
            System.out.println("YES.");
            return MockCollection.get(collectionName);
        }
        return dataBase.getCollection(collectionName);
    }

    public static void setMockCollection(String collectionName, MongoCollection<Document> mockCollect){
        MockCollection.put(collectionName, mockCollect);
    }
}