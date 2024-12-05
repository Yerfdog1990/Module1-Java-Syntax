package ComparatorInterface;

import java.util.Map;
import java.util.TreeMap;

// Main class to demonstrate the use of Comparator with TreeMap
public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator for Person objects
        TreeMap<Person, String> personStringTreeMap = new TreeMap<>(new PersonComparator());

        // Adding Person objects to the TreeMap
        personStringTreeMap.put(new Person("Godfrey", 34), "Godfrey's age");
        personStringTreeMap.put(new Person("Cyril", 5), "Cyril's age");
        personStringTreeMap.put(new Person("Cyrek", 1), "Cyrek's age");
        personStringTreeMap.put(new Person("Tom", 45), "Tom's age");

        // Printing the sorted TreeMap
        System.out.println("Sorted TreeMap of people: ");
        for(Map.Entry<Person, String > entry : personStringTreeMap.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        // Demonstrating setters
        Person person = new Person("George", 57);
        person.setName("Paul");
        person.setAge(54);
        System.out.println("Updated: " +person);
    }
}
