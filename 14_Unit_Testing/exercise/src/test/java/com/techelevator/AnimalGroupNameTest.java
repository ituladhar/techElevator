package com.techelevator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {
    // instantiate to test
    AnimalGroupName test = new AnimalGroupName();
    @Test
    public void test_for_Rhino() {
        assertEquals("Incorrect String returned from getHeard", "Crash", test.getHerd("Rhino"));
    }
    @Test
    public void test_for_Giraffe() {
        assertEquals("Incorrect String returned from getHeard", "Tower", test.getHerd("Giraffe"));
    }
    @Test
    public void test_for_Elephant() {
        assertEquals("Incorrect String returned from getHeard", "Herd", test.getHerd("Elephant"));
    }

    @Test
    public void test_for_Lion() {
        assertEquals("Incorrect String returned from getHeard", "Pride", test.getHerd("Lion"));
    }

    @Test
    public void test_for_Crow() {
        assertEquals("Incorrect String returned from getHeard", "Murder", test.getHerd("Crow"));
    }

    @Test
    public void test_for_Pigeon() {
        assertEquals("Incorrect String returned from getHeard", "Kit", test.getHerd("Pigeon"));
    }

    @Test
    public void test_for_Flamingo() {
        assertEquals("Incorrect String returned from getHeard", "Pat", test.getHerd("Flamingo"));
    }

    @Test
    public void test_for_Deer() {
        assertEquals("Incorrect String returned from getHeard", "Herd", test.getHerd("Deer"));
    }

    @Test
    public void test_for_Dog() {
        assertEquals("Incorrect String returned from getHeard", "Pack", test.getHerd("Dog"));
    }

    @Test
    public void test_for_Crocodile() {
        assertEquals("Incorrect String returned from getHeard", "Float", test.getHerd("Crocodile"));
    }

    @Test
    public void test_for_null() {
        assertEquals("Incorrect String returned from getHeard", "unknown", test.getHerd(null));
    }

    @Test
    public void test_for_unknown_animal() {
        assertEquals("Incorrect String returned from getHeard", "unknown", test.getHerd("walrus"));
    }
}