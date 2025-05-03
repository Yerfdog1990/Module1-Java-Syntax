package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates various utility methods from the Collections class
 * for finding, comparing and searching elements in collections.
 */

public class FindingElements {
  public static void main(String[] args) {
    // Create and populate a list of integers
    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(2);
    numbers.add(8);
    numbers.add(2);
    numbers.add(1);
    
    // Display the initial collection
    System.out.println("Collection: " + numbers);
    // Find minimum and maximum elements in the collection
    System.out.println("Minimum element: " + Collections.min(numbers));
    System.out.println("Maximum element: " + Collections.max(numbers));
    // Count occurrences of element 2
    System.out.println("Frequency of 2: " + Collections.frequency(numbers, 2));
    
    // Sort the collection for binary search
    Collections.sort(numbers); // Must sort before binary search
    System.out.println("Sorted collection: " + numbers);
    // Perform binary search for element 5
    System.out.println("Binary search for 5: " + Collections.binarySearch(numbers, 5));
    
    // Create another collection for the disjoint test
    List<Integer> otherNumbers = new ArrayList<>();
    otherNumbers.add(10);
    otherNumbers.add(11);
    // Check if collections have no elements in common
    System.out.println("Collections are disjoint: " + Collections.disjoint(numbers, otherNumbers));
  }
}
