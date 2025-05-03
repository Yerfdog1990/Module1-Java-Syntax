package CollectionClasses.mutablecollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MutableMap {
  public static void main(String[] args) {
    demonstrateHashMap();
    demonstrateLinkedHashMap();
    demonstrateTreeMap();
  }

  private static void demonstrateHashMap() {
    Map<String, String> hashMap = new HashMap<>();

    // Adding elements
    hashMap.put("fruit1", "Apple");
    hashMap.put("fruit2", "Banana");
    hashMap.put("fruit3", "Orange");
    System.out.println("HashMap after adding: " + hashMap);

    // Updating elements
    hashMap.put("fruit2", "Mango");
    System.out.println("HashMap after updating: " + hashMap);

    // Removing elements
    hashMap.remove("fruit3");
    System.out.println("HashMap after removing: " + hashMap);
  }

  private static void demonstrateLinkedHashMap() {
    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

    // Adding elements
    linkedHashMap.put("color1", "Red");
    linkedHashMap.put("color2", "Green");
    linkedHashMap.put("color3", "Blue");
    System.out.println("LinkedHashMap after adding: " + linkedHashMap);

    // Updating elements
    linkedHashMap.put("color2", "Yellow");
    System.out.println("LinkedHashMap after updating: " + linkedHashMap);

    // Removing elements
    linkedHashMap.remove("color3");
    System.out.println("LinkedHashMap after removing: " + linkedHashMap);
  }

  private static void demonstrateTreeMap() {
    TreeMap<String, String> treeMap = new TreeMap<>();

    // Adding elements
    treeMap.put("animal1", "Lion");
    treeMap.put("animal3", "Tiger");
    treeMap.put("animal2", "Zebra");
    System.out.println("TreeMap after adding: " + treeMap);

    // Updating elements
    treeMap.put("animal2", "Elephant");
    System.out.println("TreeMap after updating: " + treeMap);

    // Removing elements
    treeMap.remove("animal3");
    System.out.println("TreeMap after removing: " + treeMap);
  }
}
