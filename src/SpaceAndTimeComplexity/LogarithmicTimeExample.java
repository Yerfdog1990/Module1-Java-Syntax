package SpaceAndTimeComplexity;

import java.util.TreeMap;
import java.util.TreeSet;

/*
O(log n) - Logarithmic Time
An operation with O(log n) time complexity takes time proportional to the logarithm of the size of the input data.
Logarithmic time complexity is typically seen in operations that divide the problem into smaller parts, such as binary search.

Example in Java Collections:
1.Accessing an element in a TreeMap or TreeSet: map.get(key) or set.contains(value) is O(log n) because these collections are implemented as balanced binary search trees (e.g., Red-Black Tree), which allows for logarithmic time operations.
2.Inserting an element into a TreeMap or TreeSet: map.put(key, value) or set.add(value) is O(log n) for the same reason.
 */
public class LogarithmicTimeExample {
    public static void main(String[] args) {
        //Inserting an element into a TreeMap:
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("School of the Nations", 2018);
        treeMap.put("Gitega International Academy", 2019);
        treeMap.put("Kitengela International School", 2020);
        treeMap.put("Kinderworld International School", 2021);
        treeMap.put("St. Christopher's International School", 2023);
        treeMap.put("Mooltripakdee International School", 2024);

        //Accessing an element in a TreeMap:
        System.out.println("Which year was I in Kitengela International SChool? " +treeMap.get("Kitengela International School"));

        //Inserting an element into a TreeSet:
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Gitega International Academy");
        treeSet.add("Kitengela International School");
        treeSet.add("Kinderworld International School");
        treeSet.add("St. Christopher's International School");
        treeSet.add("Mooltripakdee International School");

        //Accessing an element in a TreeSet:
        System.out.println("I worked at Kitengela International SChool? " +treeSet.contains("Kitengela International School"));
    }
}
