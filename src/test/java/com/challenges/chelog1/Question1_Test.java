package com.challenges.chelog1;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import static org.testng.Assert.*;// DO NOT FORGET
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Question1_Test {
    
    @Test
    public void testSamples() {
        assertEquals("a string", "a string");
        assertEquals("another string", "another string", "These two strings are not equal.");
        
        assertEquals(20, 20);
        assertEquals(20, 20, "These two integers are not equal.");
    }
    
}