package CollectionClasses;
/*
TreeMap can be used in scenarios where sorted order of elements is required.
For instance, in a class assignment where you need to store and retrieve values
(like student grades or names) in ascending order,
TreeMap can simplify the task by maintaining the sorted order automatically.
Key Features of TreeMap
1.Sorted Order: TreeMap sorts the entries based on the natural ordering of its keys or by a comparator provided at map creation time.
2.NavigableMap Interface: TreeMap implements the NavigableMap interface, providing methods to navigate the map like lowerEntry, higherEntry, floorEntry, and ceilingEntry.
3.Logarithmic Time Complexity: TreeMap operations like put, get, remove, and containsKey have O(log n) time complexity due to the underlying Red-Black tree structure.
4.Null Values: TreeMap allows multiple null values but does not allow null keys.
5.SubMap Views: It provides views of portions of the map like subMap, headMap, and tailMap.
6.Thread Safety: TreeMap is not synchronized, so if multiple threads access a TreeMap concurrently, it must be synchronized externally.
 */

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap to store String keys and Integer values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        // Adding key-value pairs to the TreeMap
        treeMap.put("Cyril", 2019);
        treeMap.put("Cyrek", 2024);
        treeMap.put("Godfrey", 1990);
        treeMap.put("Rosemary", 1991);

        // Printing the TreeMap (will be sorted by keys)
        System.out.println("TreeMap: " +treeMap);

        // Accessing a value by its key
        int godfreyYOB = treeMap.get("Godfrey");
        System.out.println("Godfrey's year of birth: " +godfreyYOB);

        // Checking if a key exists
        boolean hasCyril = treeMap.containsKey("Cyril");
        System.out.println("Cyril is present: " +hasCyril);

        // Checking if a value exists
        boolean year = treeMap.containsValue(2024);
        System.out.println("Cyrek was born in 2024? " +year);

        // Checking size of TreeMap before deletion
        System.out.println("Size of TreeMap before deletion: " +treeMap.size());

        // Removing a key-value pair
        treeMap.remove("Rosemary");
        System.out.println("New TreeMap after removing \"Rosemary\": " +treeMap);

        // Checking size of TreeMap after deletion
        System.out.println("Size of TreeMap after deletion: " +treeMap.size());

        // Getting the first and last entries
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        System.out.println("First entry: " +firstEntry);
        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();
        System.out.println("Last entry: " +lastEntry);

        // Getting a subMap
        TreeMap<String, Integer> subMap = new TreeMap<>(treeMap.subMap("Cyrek", "Godfrey"));
        System.out.println("SubMap from Cyril to Cyrek: " +subMap);

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " +treeMap);
    }
}
