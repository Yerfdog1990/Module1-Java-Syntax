package CollectionClasses;
/*
Hashset
It implements the Set interface and never contains duplicate values.
It implements the hash table for storing the values. It also allows null values.
It never maintains the insertion order but provides the constant time performance for add, remove, size, and contains methods.
It is best for search operations and it is not synchronized.

Key Features of HashSet:
1.Implements the Set Interface: Ensures no duplicate values are stored.
2.Uses a Hash Table: Provides efficient storage and retrieval using hashing.
3.Allows Null Values: Can store a single null value.
4.No Insertion Order Maintenance: Does not guarantee the order of elements.
5.Constant Time Performance: Offers O(1) time complexity for basic operations like add, remove, size, and contains.
6.Ideal for Search Operations: Best suited for scenarios requiring frequent searches.
7.Not Synchronized: Not thread-safe by default. External synchronization is required for concurrent access.
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //Create hashset to sroe unique element
        HashSet<String> countries = new HashSet<>();

        //Adding elements to the hashset
        countries.add("Kenya");
        countries.add("Uganda");
        countries.add("Tanzania");
        countries.add("Rwanda");
        countries.add("Burundi");

        //Attempt to add duplicate element
        boolean isDuplicate = countries.add("Kenya");
        if(!isDuplicate){
            System.out.println("Cannot add \"Kenya\" because is a duplicate.");
        }
        //Adding null value
        countries.add(null);
        //Displaying the HashSet elements
        System.out.println("Hashnet elements: " +countries);
        //Check if an element is present
        if(countries.contains("Uganda")){
            System.out.println("\"Uganda\" is in the Hashset.");
        }
        System.out.println("\"SUdan\" is in the Hashset: " +countries.contains("Sudan"));
        //Remove an element
        countries.remove("Rwanda");
        System.out.println("Elements in Hashset after removing \"Rwanda\": " +countries);
        //Size of the HashSet
        System.out.println("Size of the Hashset: " +countries.size());
        //Iterating through the HashSet
        System.out.println("Iterate over Hashset elements");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Clear the Hashset
        countries.clear();
        System.out.println("After clearing: " +countries);

    }
}
