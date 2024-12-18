package com.mathapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SignUpTest{
    @Test
    public void testAuthenticate_succes(){
        boolean result = SignUp.authentificate("test", "test", "test", "test", "test", "test");
        assertTrue(result, "ERROR");
    }

    @Test 
    public void testAuthenticate_failure(){
        boolean result = SignUp.authentificate("name", "surname", "username", "email", "password", "checkPassword");
        assertFalse(result, "ERROR");
    }
}