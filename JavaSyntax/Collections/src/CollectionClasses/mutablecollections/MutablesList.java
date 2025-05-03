package CollectionClasses.mutablecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MutablesList {
  public static void main(String[] args) {
    demonstrateArrayList();
    demonstrateLinkedList();
  }

  private static void demonstrateArrayList() {
    List<String> arrayList = new ArrayList<>();

    // Adding elements
    arrayList.add("First");
    arrayList.add("Second");
    arrayList.add(1, "Between");
    System.out.println("After adding: " + arrayList);

    // Updating elements
    arrayList.set(1, "Updated");
    System.out.println("After updating: " + arrayList);

    // Removing elements
    arrayList.remove("First");
    arrayList.remove(1);
    System.out.println("After removing: " + arrayList);
  }

  private static void demonstrateLinkedList() {
    LinkedList<String> linkedList = new LinkedList<>();

    // Adding elements
    linkedList.add("One");
    linkedList.addFirst("Start");
    linkedList.addLast("End");
    System.out.println("After adding: " + linkedList);

    // Updating elements
    linkedList.set(1, "Modified");
    System.out.println("After updating: " + linkedList);

    // Removing elements
    linkedList.removeFirst();
    linkedList.removeLast();
    System.out.println("After removing: " + linkedList);
  }
}
