package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the QuickSort class.
 */
public class QuickSortTest {

    /**
     * Tests the quickSort method with an unsorted array.
     */
    @Test
    public void testQuickSort() {
        QuickSort qs = new QuickSort();
        int[] arr = {4, 1, 3, 9, 7};
        int[] expected = {1, 3, 4, 7, 9};

        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the quickSort method with an empty array.
     */
    @Test
    public void testQuickSortWithEmptyArray() {
        QuickSort qs = new QuickSort();
        int[] arr = {};
        int[] expected = {};

        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the quickSort method with a single-element array.
     */
    @Test
    public void testQuickSortWithSingleElement() {
        QuickSort qs = new QuickSort();
        int[] arr = {1};
        int[] expected = {1};

        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the quickSort method with an already sorted array.
     */
    @Test
    public void testQuickSortWithSortedArray() {
        QuickSort qs = new QuickSort();
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    /**
     * Tests the quickSort method with a reverse sorted array.
     */
    @Test
    public void testQuickSortWithReverseSortedArray() {
        QuickSort qs = new QuickSort();
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};

        qs.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
