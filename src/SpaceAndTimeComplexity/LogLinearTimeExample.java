package SpaceAndTimeComplexity;
/*
O(n log n) - Log-Linear Time
Operations that take O(n log n) time are usually those that involve dividing the problem in some manner,
solving sub-problems, and combining their results. Efficient sorting algorithms like Merge Sort and Quick Sort
are classic examples, where the time complexity arises from repeatedly dividing the data set (log n) and performing
 linear work on each level of division.

Java Example using Collections.sort (which uses a TimSort algorithm, a hybrid of Merge Sort and Insertion Sort):
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LogLinearTimeExample {
    public static void main(String[] args) {
        // Create an ArrayList with random integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(100);
            arrayList.add(value);
        }
        //Print the unsorted list
        System.out.println("Original arrayList: " +arrayList);
        // Sort the ArrayList using Collections.sort() which has O(n log n) complexity
        Collections.sort(arrayList);
        // Print the sorted ArrayList
        System.out.println("Sorted arraylist: " +arrayList);
    }
}
