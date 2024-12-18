package com.mathapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LogInTest{
    @Test
    public void testAuthenticate_succes(){
        boolean result = LogIn.Authentificate("test", "test");
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
        boolean result = LogIn.Authentificate("username", "password");
        assertFalse(result, "ERROR");
    }
}