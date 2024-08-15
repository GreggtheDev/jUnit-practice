package org.example;

/**
 * A class that provides methods to sort an array using the QuickSort algorithm.
 */
public class QuickSort {

    /**
     * Partitions the array around the pivot element.
     *
     * @param arr  the array to be partitioned
     * @param low  the starting index of the partition
     * @param high the ending index of the partition
     * @return the partition index
     */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * Sorts the array using the QuickSort algorithm.
     *
     * @param arr  the array to be sorted
     * @param low  the starting index
     * @param high the ending index
     */
    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Utility function to print the array.
     *
     * @param arr  the array to be printed
     * @param size the size of the array
     */
    public void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * Main method for testing the QuickSort class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        int arr[] = { 4, 1, 3, 9, 7 };
        int n = arr.length;
        qs.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        qs.printArray(arr, n);
    }
}
