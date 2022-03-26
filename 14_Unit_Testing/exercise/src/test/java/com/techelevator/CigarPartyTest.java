package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {
    CigarParty test = new CigarParty();

    @Test
    public void test_for_30_false(){
        assertEquals("Incorrect Boolean returned from haveParty", false, test.haveParty(30,false));
    }
    @Test
    public void test_for_50_false(){
        assertEquals("Incorrect Boolean returned from haveParty", true, test.haveParty(50, false));
    }
    @Test
    public void test_for_70_true(){
        assertEquals("Incorrect Boolean returned from haveParty", true, test.haveParty(70, true));
    }
    @Test
    public void test_for_0_false() {
        assertEquals("Incorrect Boolean returned from haveParty", false, test.haveParty(0, false));

    }

    @Test
    public void test_for_0_true() {
        assertEquals("Incorrect Boolean returned from haveParty", false, test.haveParty(0, true));

    }
}