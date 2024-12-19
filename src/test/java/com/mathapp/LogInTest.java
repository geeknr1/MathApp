package com.mathapp;

import java.util.logging.Logger;

import org.bson.Document;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class LogInTest{
    private static final Logger logger = Logger.getLogger(LogInTest.class.getName());
    private MongoDatabase mockDatabase;
    private MongoCollection<Document> mockCollection;

    @BeforeEach
    public void setUp(){
        mockDatabase = mock(MongoDatabase.class);
        mockCollection = mock(MongoCollection.class);

        when(mockDatabase.getCollection("Users")).thenReturn(mockCollection);
    }

    @Test
    public void testAuthenticate_succes(){
        logger.info("Starting this test.");
        boolean result = LogIn.Authentificate("test", "test");
        logger.info("The result of the authentification is: " + result);
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
        logger.info("Starting this test.");
        boolean result = LogIn.Authentificate("username", "password");
        assertFalse(result, "ERROR");
    }
}