package CollectionClasses.immutablecollections;

import java.util.List;

public class ImmutableList {
  public static void main(String[] args) {
    demonstrateImmutableList();
    System.out.println("\n-------------------\n");
    demonstrateExceptionHandling();
  }

  private static void demonstrateImmutableList() {
    List<String> immutableList = List.of("First", "Second", "Third");
    System.out.println("Immutable List: " + immutableList);
    System.out.println("Size: " + immutableList.size());
    System.out.println("Contains 'First': " + immutableList.contains("First"));
  }

  private static void demonstrateExceptionHandling() {
    List<String> immutableList = List.of("One", "Two", "Three");

    try {
      immutableList.add("Four");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot modify immutable list: " + e.getMessage());
    }

    try {
      immutableList.remove(0);
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove elements from immutable list: " + e.getMessage());
    }

    try {
      immutableList.set(0, "New One");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot replace elements in immutable list: " + e.getMessage());
    }
  }
}
