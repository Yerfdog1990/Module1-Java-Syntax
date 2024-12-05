package CollectionClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/*
Remember that Java's creators wrote a whole helper class called Arrays for our convenience when working with arrays?
They did the same thing for collections. Java has a java.util.Collections class that has a lot of methods that are useful for working with collections.
Here are just the most interesting ones:
1.addAll(colls, e1, e2, e3, ...): Adds the elements e1, e2, e3, ... to the colls collection.
2.fill(list, obj): Replaces all the elements in the passed list with obj.
3.nCopies(n, obj): Returns a list of n copies of the obj object.
4.replaceAll(list, oldVal, newVal): Replaces all instances of oldVal with newVal in the list list.
5.copy(dest, src): Copies all elements from the src list to the dest list.
6.reverse(list): Reverses the list.
7.sort(list): Sorts the list in ascending order.
8.rotate(list, n): Cyclically shifts the elements of the list list by n elements.
9.shuffle(list): Randomly shuffles the elements in the list.
10.min(colls): Finds the minimum element in the colls collection.
11.max(colls): Finds the maximum element in the colls collection.
12.frequency(colls, obj): Determines how many times the obj element occurs in the colls collection.
13.binarySearch(list, key): Searches for key in a sorted list and returns the corresponding index.
14.disjoint(colls1, colls2): Returns true if the collections have no elements in common.
 */
public class Collections_Helper_Class {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements to it
        ArrayList<Integer> list = new ArrayList<>(asList(10, 20, 30, 40, 50));
        System.out.println("Original list: " +list);
        // Add elements 60, 70, 80 to the list
        Collections.addAll(list, 60, 70, 80);
        System.out.println("List after adding other elements: " +list);
        // Reverse the list
        Collections.reverse(list);
        System.out.println("List after reverse: " +list);
        // Sort the list in ascending order
        Collections.sort(list);
        System.out.println("Sorted list after reverse: " +list);
        // Shuffle the list randomly
        Collections.shuffle(list);
        System.out.println("List after shuffle: " +list);
        // Find the minimum element in the list
        int minElement = Collections.min(list);
        System.out.println("Minimum element in the list: " +minElement);
        // Find the maximum element in the list
        int maxElement = Collections.max(list);
        System.out.println("Maximum element in the list: " +maxElement);
        // Perform a binary search for element 3 in the sorted list
        Collections.sort(list);
        int index = Collections.binarySearch(list, 30);
        System.out.println("The index of 3 after binary search: " +index);
        // Fill the list with the value 0
        Collections.fill(list,0);
        System.out.println("List after filling with 0: " +list);
        // Create a list of 5 copies of the value 9
        List<Integer> nCopiesList = Collections.nCopies(5,9);
        System.out.println("List of n copies: " +nCopiesList);
        // Replace all occurrences of 0 with 10 in the original list
        Collections.replaceAll(list, 0, 10);
        System.out.println("List after replaceAll: " +list);
        // Create a new list and copy the elements from the nCopiesList to it
        ArrayList<Integer> destList = new ArrayList<>(asList(10, 20, 30, 40, 50));
        Collections.copy(destList,nCopiesList);
        System.out.println("List after copy: " +destList);
        // Rotate the list by 2 positions
        Collections.rotate(destList, 2);
        System.out.println("List after rotate: " +destList);
        // Count the frequency of element 9 in the list
        int frequency = Collections.frequency(list, 10);
        System.out.println("The frequency of 10 in the list is: " +frequency);
        // Create another list and check if the two lists have no elements in common
        List<Integer> anotherList = asList(9, 110, 120, 130);
        boolean disjoint = Collections.disjoint(destList, anotherList);
        System.out.println("Are teh list disjoint? " +disjoint);
    }

}
