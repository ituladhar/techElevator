package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
      Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
      and 39 return true, but 40 returns false.
      (Hint: Think "mod".)
      less20(18) → true
      less20(19) → true
      less20(20) → false
  */
public class Less20Test {
    Less20 test = new Less20();

    @Test
    public void test_For40() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", false, test.isLessThanMultipleOf20(40));
    }

    @Test
    public void test_For38() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", true, test.isLessThanMultipleOf20(38));
    }

    @Test
    public void test_For39() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", true, test.isLessThanMultipleOf20(39));
    }

    @Test
    public void test_For18() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", true, test.isLessThanMultipleOf20(18));
    }

    @Test
    public void test_For19() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", true, test.isLessThanMultipleOf20(19));
    }

    @Test
    public void test_For20() {
        assertEquals("Incorrect Boolean returned from isLessThanMultipleOf20.", false, test.isLessThanMultipleOf20(20));
    }
}