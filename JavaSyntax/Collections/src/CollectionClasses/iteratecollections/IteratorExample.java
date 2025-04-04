package CollectionClasses.iteratecollections;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> nameList = new java.util.ArrayList<>();
        nameList.add("John");
        nameList.add("Jane");
        nameList.add("Jill");
        nameList.add("Joe");
        nameList.add("Jane");
        nameList.add("Jill");

        Iterator<String> iterator = nameList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
Iterating a Collection using the Iterator Interface in Java
The Iterator interface provides a way to iterate over a collection safely without exposing its internal structure.

✅ How it works?
iterator.hasNext() checks if there’s another element in the list.
iterator.next() retrieves the next element.
This method ensures safe traversal even if the collection is modified.
 */