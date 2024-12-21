package com.mathapp;

import java.util.logging.Logger;

import org.bson.Document;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
    public class SignUpTest{
        private static final Logger logger = Logger.getLogger(SignUpTest.class.getName());
        private MongoCollection<Document> mockCollection;

     @BeforeEach
        public void mockSetUp() {
            mockCollection = mock(MongoCollection.class);
            DataBase.setMockCollection("Users", mockCollection);
        }

    @Test
    public void testAuthenticate_succes(){
        logger.info("Start test.");
        FindIterable<Document> mockFindIterable = mock(FindIterable.class);
        when(mockCollection.find(new Document("$or", java.util.Arrays.asList(new Document("username", "test"), new Document("email", "test"))))).thenReturn(mockFindIterable);
        when(mockFindIterable.first()).thenReturn(null);
        boolean result = SignUp.authentificate("test", "test", "test", "test", "test", "test");
        logger.info("Authentification result: " + result);
        assertTrue(result, "ERROR");
    }

    @Test
    public void testAuthenticate_failure(){
        logger.info("Start test.");
        Document mockUser = new Document("name", "name2").append("surname", "idk").append("username", "idk3").append("email", "idk5").append("password", "idk7").append("checkPassword", "idk9");
        FindIterable<Document> mockFindIterable = mock(FindIterable.class);
        when(mockCollection.find(new Document("username", "username2"))).thenReturn(mockFindIterable);
        when(mockFindIterable.first()).thenReturn(mockUser);
        boolean result = SignUp.authentificate("name2", "idk2", "idk4", "idk6", "idk8", "idk10");
        logger.info("Authentification result: " + result);
        assertTrue(!result, "ERROR");
    }
}