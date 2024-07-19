package ComparableInterface;
/*
Key Features of the Comparable Interface
The Comparable interface in Java is used to define a natural ordering for objects of a class.
The key features and methods of the Comparable interface are as follows:
1.Single Method: The Comparable interface contains a single method, compareTo.
2.Natural Ordering: It defines the natural ordering of objects. This is used by various sorting algorithms and data structures in Java, such as TreeMap, TreeSet, and Collections.sort.
3.Generic Interface: Comparable is a generic interface that can be parameterized with the type of objects that it compares.

Method of the Comparable Interface
1.int compareTo(T o): This method compares the current object with the specified object for order. Returns:
    -A negative integer if the current object is less than the specified object.
    -Zero if the current object is equal to the specified object.
    -A positive integer if the current object is greater than the specified object.
 */
import java.util.Map;
import java.util.TreeMap;

// Main method to demonstrate the use of the Comparable interface
public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap to store Person objects
        TreeMap<Person, String> peopleMap = new TreeMap<>();

        //Adding person object to the TreeMap
        peopleMap.put(new Person("Alice", 30), "Alice's age");
        peopleMap.put(new Person("Cyril", 4), "Cyril's age");
        peopleMap.put(new Person("Cyrek", 1), "Cyrek's age");
        peopleMap.put(new Person("Godfrey", 34), "Godfrey's age");

        // Printing the sorted TreeMap
        for(Map.Entry<Person, String> entry : peopleMap.entrySet()){
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
        // Demonstrating setters
        Person person = new Person("Eve", 28);
        System.out.println("Original: " +person);
        person.setName("Eve");
        person.setAge(30);
        System.out.println("Updated: " +person);
    }
}
