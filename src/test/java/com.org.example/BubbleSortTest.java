package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the BubbleSort class.
 */
public class BubbleSortTest {

    /**
     * Tests the bubbleSort method with an unsorted array.
     */
    @Test
    public void testBubbleSort() {
        int[] arr = {4, 1, 3, 9, 7};
        int[] expected = {1, 3, 4, 7, 9};

        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the bubbleSort method with an empty array.
     */
    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};

        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the bubbleSort method with a single-element array.
     */
    @Test
    public void testBubbleSortWithSingleElement() {
        int[] arr = {1};
        int[] expected = {1};

        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the bubbleSort method with an already sorted array.
     */
    @Test
    public void testBubbleSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the bubbleSort method with a reverse-sorted array.
     */
    @Test
    public void testBubbleSortWithReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        BubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
}

