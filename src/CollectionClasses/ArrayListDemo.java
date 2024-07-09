package CollectionClasses;
/*
ArrayList is a class that implements the List interface in Java.
The List interface is part of the Java Collections Framework and represents an ordered collection (also known as a sequence).
The ArrayList class provides a resizable array implementation of the List interface.

Key Features of ArrayList:
1.Dynamic Array: Unlike arrays in Java, ArrayList can dynamically resize itself when elements are added or removed.
2.Indexed Access: Elements can be accessed directly using the index.
3.Duplicates Allowed: ArrayList allows duplicate elements.
4.Null Elements: It permits all elements, including null.
5.Order Maintenance: Maintains the order of insertion.

Commonly Used Methods of ArrayList:
1.add(E e): Appends the specified element to the end of this list.
2.add(int index, E element): Inserts the specified element at the specified position in this list.
3.get(int index): Returns the element at the specified position in this list.
4.set(int index, E element): Replaces the element at the specified position in this list with the specified element.
5.remove(int index): Removes the element at the specified position in this list.
6.size(): Returns the number of elements in this list.
7.isEmpty(): Returns true if this list contains no elements.
8.clear(): Removes all of the elements from this list.
9.contains(Object o): Returns true if this list contains the specified element.
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> easternAfricaNations = new ArrayList<>();

        // Add elements to the ArrayList
        easternAfricaNations.add("Egypt");
        easternAfricaNations.add("Kenya");
        easternAfricaNations.add("South Sudan");
        easternAfricaNations.add("Uganda");
        easternAfricaNations.add("Sudan");
        easternAfricaNations.add("Ethiopia");
        easternAfricaNations.add("Tanzania");
        easternAfricaNations.add("Somalia");
        easternAfricaNations.add("Rwanda");
        easternAfricaNations.add("Eritrea");
        easternAfricaNations.add("Burundi");
        easternAfricaNations.add("Djibouti");

        // Print the ArrayList
        System.out.println("List of Eastern Africa nations: " + easternAfricaNations);

        // Access elements by index
        System.out.println("Nation at index 0: " + easternAfricaNations.get(0)); // Egypt
        System.out.println("Nation at index 1: " + easternAfricaNations.get(1)); // Kenya
        System.out.println("Nation at index 5: " + easternAfricaNations.get(5)); // Ethiopia
        System.out.println("Nation at index 11: " + easternAfricaNations.get(11)); // Djibouti

        // Remove an element
        easternAfricaNations.remove(2); // Remove South Sudan
        System.out.println("After removing South Sudan: " + easternAfricaNations);

        // Check if an element exists
        boolean containsUganda = easternAfricaNations.contains("Uganda");
        System.out.println("Contains Uganda: " + containsUganda);

        // Get the size of the ArrayList
        int size = easternAfricaNations.size();
        System.out.println("Size of the list: " + size);

        // Clear the ArrayList
        easternAfricaNations.clear();
        System.out.println("After clearing: " + easternAfricaNations);
    }
}
