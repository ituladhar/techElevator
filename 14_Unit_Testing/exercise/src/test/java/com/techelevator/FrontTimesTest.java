package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;
/*
 * Given a string and a non-negative int n, we'll say that the front of the
 * string is the first 3 chars, or whatever is there if the string is less than
 * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
 * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
 * "AbcAbcAbc"
 */
public class FrontTimesTest {
    FrontTimes test = new FrontTimes();

    @Test
    public void test_Null(){
        assertEquals("Incorrect String returned from generateString.","", test.generateString(null, 1));
    }
    @Test
    public void test_Less3Char(){
        assertEquals("Incorrect String returned from generateString.","", test.generateString("Abc", 0));
    }
    @Test
    public void test_ChoCho() {
        assertEquals("Incorrect String returned from generateString.", "ChoCho", test.generateString("Chocolate", 2));
    }

    @Test
    public void test_ChoChoCho() {
        assertEquals("Incorrect String returned from generateString.", "ChoChoCho", test.generateString("Chocolate", 3));
    }

    @Test
    public void test_AbcAbcAbc() {
        assertEquals("Incorrect String returned from generateString.", "AbcAbcAbc", test.generateString("Abc", 3));
    }


}