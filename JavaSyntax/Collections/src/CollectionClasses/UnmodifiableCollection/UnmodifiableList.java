package CollectionClasses.UnmodifiableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates the usage and behavior of unmodifiable lists in Java.
 * It compares unmodifiable lists with immutable lists and shows their characteristics,
 * including creation, modification attempts, and shallow wrapper behavior.
 */

public class UnmodifiableList {
  /**
   * Main method to demonstrate various aspects of unmodifiable and immutable lists.
   * Executes multiple demonstration methods to show different characteristics
   * of these list types.
   *
   * @param args command line arguments (not used)
   */
  public static void main(String[] args) {
    // Call the methods to demonstrate the modifiable, unmodifiable, and immutable list.
    createUnmodifiableList();
    System.out.println("\n-------------------\n");
    compareImmutableListAndUnmodifiableList();
    System.out.println("\n-------------------\n");
    modifyImmutableListAndUnmodifiableList();
    System.out.println("\n-------------------\n");
    demonstrateShallowWrapper();
  }

  /**
   * Demonstrates how to create an unmodifiable list from a mutable list.
   * Shows basic operations like size checking and element containment.
   */
  private static void createUnmodifiableList() {
    ArrayList<String> mutableList = new ArrayList<>();
    mutableList.add("First");
    mutableList.add("Second");
    mutableList.add("Third");
    System.out.println("Mutable List: " + mutableList);

    List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<>(mutableList));
    System.out.println("Unmodifiable List: " + unmodifiableList);
    System.out.println("Size: " + unmodifiableList.size());
    System.out.println("Contains 'First': " + unmodifiableList.contains("First"));
  }

  /**
   * Compares an immutable list created using List.of() with an unmodifiable list
   * created using Collections.unmodifiableList() to demonstrate their equality.
   */
  private static void compareImmutableListAndUnmodifiableList() {
    List<String> immutableList = List.of("One", "Two", "Three");
    List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<>(List.of("One", "Two", "Three")));

    System.out.println("Immutable List: " + immutableList);
    System.out.println("Unmodifiable List: " + unmodifiableList);
    System.out.println("Are they equal? " + immutableList.equals(unmodifiableList));
  }

  /**
   * Demonstrates that both unmodifiable and immutable lists cannot be modified
   * directly. Attempts various modifications to show they throw
   * UnsupportedOperationException.
   */
  private static void modifyImmutableListAndUnmodifiableList() {
    List<String> mutableList = new ArrayList<>();
    mutableList.add("First");
    mutableList.add("Second");
    mutableList.add("Third");
    List<String> immutableList = List.of("One", "Two", "Three");
    List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

    try {
      unmodifiableList.add("Four"); // This will throw an exception
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify unmodifiable list: " + e.getMessage());
    }

    try {
      immutableList.add("Four"); // This will throw an exception
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify immutable list: " + e.getMessage());
    }

    try {
      unmodifiableList.remove(0); // This will throw an exception
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove from unmodifiable list: " + e.getMessage());
    }

    try {
      immutableList.set(0, "New One"); // This will throw an exception
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify immutable list: " + e.getMessage());
    }
  }

  /**
   * Demonstrates that an unmodifiable list is a shallow wrapper around the original list.
   * Shows that modifications to the original list are reflected in the unmodifiable view,
   * while direct modifications to the unmodifiable list are not allowed.
   */
  private static void demonstrateShallowWrapper() {
    ArrayList<String> originalList = new ArrayList<>();
    originalList.add("One");
    originalList.add("Two");
    originalList.add("Three");
    
    List<String> unmodifiableList = Collections.unmodifiableList(originalList);
    
    System.out.println("Original List: " + originalList);
    System.out.println("Unmodifiable View: " + unmodifiableList);
    
    // Modify via original collection
    originalList.add("Four"); // Works fine
    originalList.set(0, "Modified One"); // Works fine
    
    System.out.println("\nAfter modifying original list:");
    System.out.println("Original List: " + originalList);
    System.out.println("Unmodifiable View: " + unmodifiableList);

    // Modify via the wrapped reference
    try{
      unmodifiableList.add("Five"); // Throws an exception
      unmodifiableList.set(0, "Modified Two"); // Throws an exception
    }catch (UnsupportedOperationException e){
      System.out.println("Cannot modify the collection via the wrapped reference: " + e.getMessage());
    }
  }
}
