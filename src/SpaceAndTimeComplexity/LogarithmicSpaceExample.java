package SpaceAndTimeComplexity;

import java.util.Arrays;

/*
O(log n) - Logarithmic Space:
   - Example: Space used by recursive algorithms with logarithmic depth.
   - Explanation: The space used grows logarithmically with the input size.
   - Java Example: Recursive algorithms on balanced trees.
 */
public class LogarithmicSpaceExample {
    // Recursive method to demonstrate logarithmic space complexity
    public static int binarySearch(int[] array, int target, int low, int high){
        if(low > high){// Base case: if low index exceeds high index, target is not found
            return -1; // Return -1 to indicate target not found
        }
        int mid = (low + high)/2;// Calculate the middle index
        if(array[mid] == target){// Base case: target found at mid index
            return mid; // Return the index where target is found
        }else if(array[mid] < target){// If target is greater than mid element
            return binarySearch(array, target, mid + 1, high);// Recursive call on right half
        }else{// If target is less than mid element
            return binarySearch(array, target, low, mid - 1); // Recursive call on left half
        }
    }

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {2, 10, 15, 30, 40};
        // Define the target value to search for
        int target = 30;
        // Perform binary search
        int result = binarySearch(array, target, 0, array.length-1);
        // Print the result of the binary search
        System.out.println("Index of target element: " + result); // Uses O(log n) space due to recursion
        System.out.println("Index of target element: " +Arrays.binarySearch(array, target));
    }
}
