package com.mathapp;

import java.util.logging.Logger;

import org.bson.Document;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SignUpTest{
    private static final Logger logger = Logger.getLogger(SignUpTest.class.getName());
    private MongoDatabase mockDatabase;
    private MongoCollection<Document> mockCollection;

    public void mockSetUp() {
        mockDatabase = mock(MongoDatabase.class);
        mockCollection = mock(MongoCollection.class);

        when(mockDatabase.getCollection("Users")).thenReturn(mockCollection);
    }

    @Test
    public void testAuthenticate_succes(){
        mockSetUp();
        logger.info("Start test.");
        boolean result = SignUp.authentificate("test", "test", "test", "test", "test", "test");
        logger.info("Authentification result: " + result);
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
        mockSetUp();
        logger.info("Start test.");
        boolean result = SignUp.authentificate("name", "surname", "username", "email", "password", "checkPassword");
        logger.info("Authentification result: " + result);
        assertFalse(result, "ERROR");
    }
}