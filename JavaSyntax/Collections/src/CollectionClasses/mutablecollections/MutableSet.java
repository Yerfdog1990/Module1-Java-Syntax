package CollectionClasses.mutablecollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MutableSet {
  public static void main(String[] args) {
    demonstrateHashSet();
    demonstrateLinkedHashSet();
    demonstrateTreeSet();
  }

  private static void demonstrateHashSet() {
    Set<String> hashSet = new HashSet<>();

    // Adding elements
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Orange");
    System.out.println("HashSet after adding: " + hashSet);

    // Adding duplicate (will be ignored)
    hashSet.add("Apple");
    System.out.println("HashSet after adding duplicate: " + hashSet);

    // Removing elements
    hashSet.remove("Banana");
    System.out.println("HashSet after removing: " + hashSet);
  }

  private static void demonstrateLinkedHashSet() {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    // Adding elements
    linkedHashSet.add("Red");
    linkedHashSet.add("Green");
    linkedHashSet.add("Blue");
    System.out.println("LinkedHashSet after adding: " + linkedHashSet);

    // Adding duplicate (will be ignored)
    linkedHashSet.add("Red");
    System.out.println("LinkedHashSet after adding duplicate: " + linkedHashSet);

    // Removing elements
    linkedHashSet.remove("Green");
    System.out.println("LinkedHashSet after removing: " + linkedHashSet);
  }

  private static void demonstrateTreeSet() {
    TreeSet<String> treeSet = new TreeSet<>();

    // Adding elements
    treeSet.add("Zebra");
    treeSet.add("Lion");
    treeSet.add("Tiger");
    System.out.println("TreeSet after adding: " + treeSet);

    // Adding duplicate (will be ignored)
    treeSet.add("Lion");
    System.out.println("TreeSet after adding duplicate: " + treeSet);

    // Removing elements
    treeSet.remove("Tiger");
    System.out.println("TreeSet after removing: " + treeSet);
  }
}
