package SpaceAndTimeComplexity;
/*
O(n) - Linear Time
An operation with O(n) time complexity takes time proportional to the size of the input data.
If the input size doubles, the runtime roughly doubles.

Example in Java Collections:
1.Iterating over an ArrayList or LinkedList: Traversing the entire list with a loop or iterator is O(n) because each element is accessed exactly once.
2.Removing an element from a LinkedList by value: list.remove(value) is O(n) because it may need to iterate through the list to find the element.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class LinearTimeExample {
    public static void main(String[] args) {
        //Iterating over an ArrayList or LinkedList:
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Godfrey");
        arrayList.add("Okoth");
        arrayList.add("Ouma");


        System.out.println("Iterating over list:");
        for(String name : arrayList){
            System.out.println(name);
        }
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Kenya");
        linkedList.add("Uganda");
        linkedList.add("Tanzania");

        System.out.println("Iterating over linkedlist:");
        for(String country : linkedList){
            System.out.println(country);
        }
    }
}
