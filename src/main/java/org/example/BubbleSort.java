package org.example;

/**
 * A utility class that provides a static method to sort an array using the Bubble Sort algorithm.
 */
public class BubbleSort {

    /**
     * Sorts the specified array using the Bubble Sort algorithm.
     *
     * @param arr the array to be sorted
     */
    public static void bubbleSort(int arr[]) {
        int N = arr.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Prints the elements of the specified array to the standard output.
     *
     * @param arr the array whose elements are to be printed
     */
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Main method to test the bubble sort implementation.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String args[]) {
        int arr[] = {4, 1, 3, 9, 7};

        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
