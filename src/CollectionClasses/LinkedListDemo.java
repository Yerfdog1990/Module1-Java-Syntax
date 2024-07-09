package CollectionClasses;
/*
LinkedList:
It is the most commonly used data structure that implements a doubly linked list to store the elements inside it.
It can store duplicate elements. It implements the Dequeue interface extended by the Queue interface and the List interface.
It is not synchronized.

LinkedList Key Features:
1.Dynamic Size: Unlike arrays, LinkedList can grow or shrink dynamically, making it more flexible for certain applications.
2.Doubly Linked: Each element (node) in a LinkedList contains a reference to the next and the previous element, allowing for efficient insertions and deletions from both ends.
3.Non-Contiguous Storage: Elements are not stored in contiguous memory locations, making it more efficient for applications that require frequent insertions and deletions.
4.Implements List and Deque Interfaces: Provides functionalities of both List (sequential access) and Deque (double-ended queue) interfaces.
5.Supports Null Elements: Unlike some collections, LinkedList allows null elements.
Iterator: Supports both forward and backward iteration.
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Create a linked list
        LinkedList<String> list = new LinkedList<>();
        //add(E element): Adds the specified element to the end of the list.
        list.add("Kenya");
        list.add("Uganda");
        list.add("Tanzania");
        list.add("Rwanda");
        list.add("Burundi");
        //Print after adding elements
        System.out.println("List of East African nations: " +list);

        //add(int index, E element): Inserts the specified element at the specified position in the list.
        list.add(2, "Ethiopia");
        list.add(4, "Somali Land");
        list.add(6, "Eritrea");
        list.add(1,"South Sudan");
        list.add(3, "Sudan");

        //addFirst(E element): Inserts the specified element at the beginning of the list.
        list.addFirst("Egypt");
        list.addLast("Djibouti");

        //Print after adding teh remaining elements
        System.out.println("List of Eastern Africa nation: " +list);

        //Access the elements
        //get(int index): Returns the element at the specified position in the list.
        System.out.println("The element at index 4: " +list.get(4));
        //getFirst(): Returns the first element in the list.
        System.out.println("The first element: " +list.getFirst());
        //getLast(): Returns the last element in the list.
        System.out.println("The last element: " +list.getLast());

        //Modify elements
        //set(int index, E element): Replaces the element at the specified position in the list with the specified element.
        list.set(7, "Somalia");
        System.out.println("Updated list of Eastern African nations: " +list);

        //Remove elements
        //remove(int index): Removes the element at the specified position in the list and returns the removed element.
        list.remove(1);
        //removeFirst(): Removes and returns the first element from the list.
        list.removeFirst();
        //removeLast(): Removes and returns the last element from the list.
        list.removeLast();
        //remove(Object): Removes the element from the list by the name
        list.remove("Sudan");
        System.out.println("New list of Easter African nations: " +list);

        //contains(Object o): Returns true if the list contains the specified element.
        System.out.println("The list contains \"Rwanda\": " +list.contains("Rwanda"));

        //size(): Returns the number of elements in the list.
        System.out.println("The number of elements in the list is: " +list.size());

        //iterator(): Returns an iterator over the elements in the list in proper sequence.
        System.out.println("Iterate over the elements:");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //isEmpty(): Returns true if the list contains no elements.
        System.out.println("The list is empty: " +list.isEmpty());

        //clear(): Removes all elements from the list.
        list.clear();
        System.out.println("The size of the list is: " +list.size());
    }
}
