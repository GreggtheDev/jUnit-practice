package org.example;

public class BubbleSort {
    // Function to sort an array using bubble sort
    static void bubbleSort(int arr[], int N) {
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

    // Driver method to test above
    public static void main(String args[]) {
        int arr[] = {4, 1, 3, 9, 7};
        int N = arr.length;

        bubbleSort(arr, N);
        System.out.println("Sorted array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}