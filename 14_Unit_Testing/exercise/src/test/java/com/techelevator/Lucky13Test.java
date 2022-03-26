package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {
    Lucky13 test = new Lucky13();

    @Test
    public void test_For024() {
        int[] value = {0, 2, 4};
        assertEquals("Incorrect Boolean returned from getLuck.", true, test.getLucky(value));
    }

    @Test
    public void test_For123() {
        int[] value = {1, 2, 3};
        assertEquals("Incorrect Boolean returned from getLuck.", false, test.getLucky(value));
    }

    @Test
    public void test_For124() {
        int[] value = {1, 2, 4};
        assertEquals("Incorrect Boolean returned from getLuck.", false, test.getLucky(value));
    }

    @Test
    public void test_For111() {
        int[] value = {1, 1, 1};
        assertEquals("Incorrect Boolean returned from getLuck.", false, test.getLucky(value));
    }

    @Test
    public void test_For222() {
        int[] value = {2, 2, 2};
        assertEquals("Incorrect Boolean returned from getLuck.", true, test.getLucky(value));
    }

    @Test
    public void test_For333() {
        int[] value = {3, 3, 3};
        assertEquals("Incorrect Boolean returned from getLuck.", false, test.getLucky(value));
    }

    @Test
    public void test_For000() {
        int[] value = {0, 0, 0};
        assertEquals("Incorrect Boolean returned from getLuck.", true, test.getLucky(value));
    }

}