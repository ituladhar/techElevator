package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {
    MaxEnd3 test =new MaxEnd3();
    private void assertEqualsArray(String string, int[] arrayGreaterValue, int[] makeArray){

    }
    @Test
    public void test_Ary123(){
        int[] arrayGreaterValue = {3,3,3};
        int[] givenArray = {1,2,3};
        assertEqualsArray("Incorrect Array returned.", arrayGreaterValue, test.makeArray(givenArray));
    }
    @Test
    public void test_Ary1159(){
        int[] arrayGreaterValue = {11,11,11};
        int[] givenArray = {11,5,9};
        assertEqualsArray("Incorrect Array returned.", arrayGreaterValue, test.makeArray(givenArray));
    }
    @Test
    public void test_Ary2113(){
        int[] arrayGreaterValue = {11,11,11};
        int[] givenArray = {2,11,3};
        assertEqualsArray("Incorrect Array returned.", arrayGreaterValue, test.makeArray(givenArray));
    }


}