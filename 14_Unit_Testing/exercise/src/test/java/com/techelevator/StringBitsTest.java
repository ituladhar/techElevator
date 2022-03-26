package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {
    StringBits test = new StringBits();

    @Test
    public void test_Null(){
        assertEquals("Incorrect String returned from getBits.", "", test.getBits(null));
    }

    @Test
    public void test_Hello(){
        assertEquals("Incorrect String returned from getBits.", "Hlo", test.getBits("Hello"));
    }

    @Test
    public void test_Hi(){
        assertEquals("Incorrect String returned from getBits.", "H", test.getBits("Hi"));
    }

    @Test
    public void test_Heeololeo(){
        assertEquals("Incorrect String returned from getBits.", "Hello", test.getBits("Heeololeo"));
    }


}