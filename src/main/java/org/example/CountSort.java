package org.example;

public class CountSort {
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
