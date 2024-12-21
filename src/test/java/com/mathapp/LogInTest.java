package com.mathapp;

import java.util.logging.Logger;

import org.bson.Document;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import javafx.scene.chart.PieChart.Data;

public class LogInTest{
    private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
    private MongoCollection<Document> mockCollection;

    @BeforeEach
    public void mockSetUp(){
        mockCollection = mock(MongoCollection.class);
        DataBase.setMockCollection("Users", mockCollection);
    }

    @Test
    public void testAuthenticate_succes(){
        logger.info("Starting this test.");

        Document mockuser = new Document("username", "test").append("password", "apples");
        FindIterable<Document> mockFindIterable = mock(FindIterable.class);

        when(mockCollection.find(new Document("username","test"))).thenReturn(mockFindIterable);
        when(mockFindIterable.first()).thenReturn(mockuser);

        boolean result = LogIn.Authentificate("test", "apples");

        logger.info("The result of the authentification is: " + result);
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
       logger.info("Starting this test.");

        Document mockuser = new Document("username", "test").append("password", "idk");
        FindIterable<Document> mockFindIterable = mock(FindIterable.class);

        when(mockCollection.find(new Document("username","test"))).thenReturn(mockFindIterable);
        when(mockFindIterable.first()).thenReturn(mockuser);

        boolean result = LogIn.Authentificate("test", "idk2");
        
        logger.info("The result of the authentification is: " + result);
        assertFalse(result, "ERROR");
    }
}


// don't load UIs from tests