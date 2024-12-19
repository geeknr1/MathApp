package com.mathapp;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LogInTest{
    private static final Logger logger = Logger.getLogger(LogInTest.class.getName());

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