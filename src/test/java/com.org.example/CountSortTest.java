package com.org.example;

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the CountSort class.
 */
public class CountSortTest {

    /**
     * Tests the countSort method with a regular unsorted string.
     */
    @Test
    public void testCountSort() {
        String input = "dcba";
        String expected = "abcd";

        String result = CountSort.countSort(input);
        assertEquals(expected, result);
    }

    /**
     * Tests the countSort method with an empty string.
     */
    @Test
    public void testCountSortWithEmptyString() {
        String input = "";
        String expected = "";

        String result = CountSort.countSort(input);
        assertEquals(expected, result);
    }

    /**
     * Tests the countSort method with a string of repeated characters.
     */
    @Test
    public void testCountSortWithRepeatedCharacters() {
        String input = "aaaa";
        String expected = "aaaa";

        String result = CountSort.countSort(input);
        assertEquals(expected, result);
    }

    /**
     * Tests the countSort method with a string that is already sorted.
     */
    @Test
    public void testCountSortWithSortedString() {
        String input = "abc";
        String expected = "abc";

        String result = CountSort.countSort(input);
        assertEquals(expected, result);
    }

    /**
     * Tests the countSort method with a string that contains all the same character.
     */
    @Test
    public void testCountSortWithSameCharacterString() {
        String input = "bbb";
        String expected = "bbb";

        String result = CountSort.countSort(input);
        assertEquals(expected, result);
    }
}
