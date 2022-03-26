package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;


public class DateFashionTest {

    DateFashion test = new DateFashion();

    @Test
    public void testDateFashion_0_10(){
        assertEquals("Incorrect Integer returned from getATable",0, test.getATable(0,10) );
    }

    @Test
    public void testDateFashion_5_10(){
        assertEquals("Incorrect Integer returned from getATable",2, test.getATable(5,10) );
    }

    @Test
    public void testDateFashion_5_2(){
        assertEquals("Incorrect Integer returned from getATable",0, test.getATable(5,2) );
    }

    @Test
    public void testDateFashion_5_5(){
        assertEquals("Incorrect Integer returned from getATable",1, test.getATable(5,5) );
    }

}