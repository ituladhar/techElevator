package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {
    NonStart test = new NonStart();

    @Test
    public void testHelloThere(){
        assertEquals("Incorrect String returned from getPartialString.", "ellohere", test.getPartialString("Hello", "There"));
    }
    @Test
    public void testJavaCode() {
        assertEquals("Incorrect String returned from getPartialString.", "avaode", test.getPartialString("java", "code"));
    }

    @Test
    public void testShortlJva() {
        assertEquals("Incorrect String returned from getPartialString.", "hotlava", test.getPartialString("shotl", "java"));
    }

    @Test
    public void testNull() {
        assertEquals("Incorrect String returned from getPartialString.", "", test.getPartialString(" ", " "));
    }


}