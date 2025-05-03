package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates various utility methods from the Collections class
 * for creating and modifying collections in Java.
 */

public class CreateAndModify {
  public static void main(String[] args) {
    demonstrateAddAll();
    demonstrateFill();
    demonstrateNCopies();
    demonstrateReplaceAll();
    demonstrateCopy();
  }

  /**
   * Demonstrates Collections.addAll() method which adds multiple elements
   * to a collection in a single operation.
   */
  private static void demonstrateAddAll() {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "One", "Two", "Three"); // Add multiple elements at once
    System.out.println("After addAll: " + list);
  }

  /**
   * Demonstrates Collections.fill() method which replaces all elements
   * in a list with the specified element.
   */
  private static void demonstrateFill() {
    List<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    Collections.fill(list, "Filled"); // Replace all elements with "Filled"
    System.out.println("After fill: " + list);
  }

  /**
   * Demonstrates Collections.nCopies() method which creates an immutable list
   * consisting of n copies of the specified object.
   */
  private static void demonstrateNCopies() {
    List<String> copies = Collections.nCopies(3, "Copy"); // Create a list with 3 copies of "Copy"
    System.out.println("NCopies result: " + copies);
  }

  /**
   * Demonstrates Collections.replaceAll() method which replaces all occurrences
   * of one specified value with another.
   */
  private static void demonstrateReplaceAll() {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "Old", "New", "Old");
    Collections.replaceAll(list, "Old", "Replaced"); // Replace all "Old" with "Replaced"
    System.out.println("After replaceAll: " + list);
  }

  /**
   * Demonstrates Collections.copy() method, which copies all elements from one list
   * into another. The destination list must be at least as long as the source list.
   */
  private static void demonstrateCopy() {
    // Create and populate a source list
    List<String> source = new ArrayList<>();
    Collections.addAll(source, "Source1", "Source2", "Source3");
  
    // Create a destination list with the same size as the source
    List<String> dest = new ArrayList<>();
    // Destination must have at least the same size as the source
    dest.add("");
    dest.add("");
    dest.add("");
  
    Collections.copy(dest, source); // Copy all elements from source to destination
    System.out.println("After copy: " + dest);
  }
}
