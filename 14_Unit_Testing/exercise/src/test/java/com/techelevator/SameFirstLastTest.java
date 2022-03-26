package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {
    SameFirstLast test = new SameFirstLast();

    @Test
    public void test123(){
        int[] value = {1,2,3};
        assertEquals("Incorrect Boolean returned from isTheSame().", false, test.isItTheSame(value));
    }

    @Test
    public void test1231(){
        int[] value = {1,2,3,1};
        assertEquals("Incorrect Boolean returned from isTheSame().", true, test.isItTheSame(value));
    }

    @Test
    public void test121(){
        int[] value = {1,2,1};
        assertEquals("Incorrect Boolean returned from isTheSame().", true, test.isItTheSame(value));
    }

}