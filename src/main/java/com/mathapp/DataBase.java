package com.mathapp;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 * Rolul acestei clase este de a conecta codul aplicatiei la o baza de date Mongo. Aplicatiile n-au cum sa existe fara baze de date.
 */
public class DataBase {
    private static MongoClient mongoClient;
    private static MongoDatabase dataBase;

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
        return dataBase.getCollection(collectionName);
    }

    
    // public static void main( String[] args ) {

    //     // Replace the placeholder with your MongoDB deployment's connection string
    //     String uri = "<connection string uri>";

    //     try (MongoClient mongoClient = MongoClients.create(uri)) {
    //         MongoDatabase database = mongoClient.getDatabase("sample_mflix");
    //         MongoCollection<Document> collection = database.getCollection("movies");

    //         Document doc = collection.find(eq("title", "Back to the Future")).first();
    //         if (doc != null) {
    //             System.out.println(doc.toJson());
    //         } else {
    //             System.out.println("No matching documents found.");
    //         }
    //     }
    // }
}