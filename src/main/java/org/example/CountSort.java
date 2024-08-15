package org.example;

/**
 * A utility class that provides a static method to sort a string of lowercase letters using the Counting Sort algorithm.
 */
public class CountSort {

    /**
     * Sorts the specified string of lowercase letters using the Counting Sort algorithm.
     *
     * @param arr the string to be sorted
     * @return the sorted string
     */
    public static String countSort(String arr) {
        int[] counts = new int[26];  // Array to hold counts for each letter 'a' to 'z'

        // Count occurrences of each character in the input string
        for (int i = 0; i < arr.length(); i++) {
            counts[arr.charAt(i) - 'a']++;
        }

        StringBuilder res = new StringBuilder();  // StringBuilder to accumulate substrings

        // Construct substrings for each character based on their counts
        for (int i = 0; i < 26; i++) {
            while (counts[i] > 0) {
                res.append((char) (i + 'a'));
                counts[i]--;
            }
        }

        // Return the sorted string
        return res.toString();
    }
}
