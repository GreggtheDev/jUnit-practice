package org.example;

class QuickSort {

    // Function to partition the array on the basis of pivot element
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

    // The main function that implements QuickSort
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Utility function to print the array
    void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        int arr[] = { 4, 1, 3, 9, 7 };
        int n = arr.length;
        qs.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        qs.printArray(arr, n);
    }
}