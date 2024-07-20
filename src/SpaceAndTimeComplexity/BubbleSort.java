package SpaceAndTimeComplexity;
/*
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
compares adjacent elements, and swaps them if they are in the wrong order.
This process is repeated until the list is sorted. The algorithm gets its name because
smaller elements "bubble" to the top of the list.

Here is the key idea of Bubble Sort:
1.Compare adjacent elements and swap them if they are in the wrong order.
2.Repeat the process for each element in the list.
3.Each pass through the list will move the next largest element to its correct position.
4.Continue until no swaps are needed, which means the list is sorted.
 */

import java.util.Arrays;

public class BubbleSort {
    //Main method
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {23, 6, 78, 12, 90, 34, 25, 71, 56};
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));
        // Call the bubbleSort method to sort the array
        bubbleSort(array);
        // Print the sorted array
        System.out.println("Sorted array: " +Arrays.toString(array));
    }
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        // Outer loop for each pass through the array
        for (int i = 0; i < n; i++) {
            swapped = false;
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n-1; j++) {
                // If the current element is greater than the next element, swap them
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // Set the flag to true to indicate a swap occurred
                    swapped = true;
                }
            }
            // If no elements were swapped during the inner loop, the array is already sorted
            if(!swapped) break;
        }
    }
}
