package com.techelevator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class WordCountTest {
    WordCount test = new WordCount();

    @Test
    public void test_BaBaBlackSheep() {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("ba", 2);
        expected.put("black", 1);
        expected.put("sheep", 1);
        String[] testData = {"ba", "ba", "black", "sheep"};
        assertEquals("Incorrect Array returned from getCount.", expected, test.getCount(testData));
    }

    @Test
    public void test_ABC() {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        String[] testData = {"a", "b", "a", "c", "b"};
        assertEquals("Incorrect Array returned from getCount.", expected, test.getCount(testData));
    }

    @Test
    public void test_Null() {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        String[] testData = {};
        assertEquals("Incorrect Array returned from getCount.", expected, test.getCount(testData));
    }

    @Test
    public void test_CBA() {
        Map<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("c", 1);
        expected.put("b", 1);
        expected.put("a", 1);
        String[] testData = {"c", "b", "a"};
        assertEquals("Incorrect Array returned from getCount.", expected, test.getCount(testData));
    }




}