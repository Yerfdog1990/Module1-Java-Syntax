package List;

import java.util.*;

/*
In Java, the List interface is a part of the Java Collections Framework and provides an
ordered collection (also known as a sequence). It can contain duplicate elements and allows
positional access and insertion of elements. Here are the key features of the List interface:

Key Features of List
1.Ordered Collection: The elements in a List are stored in the sequence they are added. The order is preserved.
2.Allows Duplicates: List can contain duplicate elements. This is unlike sets which do not allow duplicates.
3.Indexed Access: Elements can be accessed, inserted, updated, and removed by their index positions.
This makes List very powerful for ordered collections.
4.Positional Access: The List interface provides methods to manipulate elements based on their positions
(e.g., get(int index), set(int index, E element), add(int index, E element), remove(int index)).
5.Iteration: List supports various ways to iterate over its elements, such as
using an iterator, for-each loop, or a traditional for loop.
6.Range-view Operations: The List interface provides methods for obtaining sublists (e.g., subList(int fromIndex, int toIndex)).
7.Collection Interface Methods: Since List extends the Collection interface,
it inherits methods like add(E e), remove(Object o), contains(Object o), size(), isEmpty(), and clear().
 */
public class ListDemo {
    public static void main(String[] args) {
        //1.Creating a list
        List<String> fruits = new ArrayList<>();
        //2.Adding elements
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Orange");//Duplicates are allowed

        //3.Accessing elements by index
        System.out.println("First fruit: " +fruits.get(0));
        System.out.println("Last fruit: " +fruits.get(4));

        //4.Modifying elements by index
        fruits.set(2, "Blackberry");
        System.out.println("Updated list after modification: " +fruits);

        //5.Removing elements by index
        fruits.remove(3);
        System.out.println("Updated listed after deletion: " +fruits);

        //6.Insert elements at a specific index
        fruits.add(2, "Guava");
        System.out.println("Updated list after addition: " +fruits);

        //7.Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for(String element : fruits){
            System.out.println(element);
        }
        //8.Iterating using for loop with index
        System.out.println("Iterating using for loop with index:");
        for(int i = 1; i < fruits.size(); i++){
            System.out.println("Fruit " +i+ ":" +fruits.get(i));
        }
        //9.Getting a sublist
        List<String> sublist = fruits.subList(0,3);
        System.out.println("Sublist of the fruits: " +sublist);

        //10.Checking if the list contains an element
        System.out.println("The list contains \"Orange\"? " +fruits.contains("Orange"));
        System.out.println("The list contains \"Date\"? " +fruits.contains("Date"));

        //11.Clearing list
        fruits.clear();
        System.out.println("Size of the list after clearing its elements: " +fruits.size());
    }
}
