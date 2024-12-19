package com.mathapp;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SignUpTest{
    private static final Logger logger = Logger.getLogger(SignUpTest.class.getName());
    @Test
    public void testAuthenticate_succes(){
        logger.info("Start test.");
        boolean result = SignUp.authentificate("test", "test", "test", "test", "test", "test");
        logger.info("Authentification result: " + result);
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
        logger.info("Start test.");
        boolean result = SignUp.authentificate("name", "surname", "username", "email", "password", "checkPassword");
        logger.info("Authentification result: " + result);
        assertFalse(result, "ERROR");
    }
}