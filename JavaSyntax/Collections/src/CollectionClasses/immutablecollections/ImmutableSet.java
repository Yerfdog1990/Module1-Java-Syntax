package CollectionClasses.immutablecollections;

import java.util.Set;

public class ImmutableSet {
  public static void main(String[] args) {
    demonstrateImmutableSet();
    System.out.println("\n-------------------\n");
    demonstrateExceptionHandling();
  }

  private static void demonstrateImmutableSet() {
    Set<String> immutableSet = Set.of("X", "Y", "Z");
    System.out.println("Immutable Set: " + immutableSet);
    System.out.println("Size: " + immutableSet.size());
    System.out.println("Contains 'X': " + immutableSet.contains("X"));
  }

  private static void demonstrateExceptionHandling() {
    Set<String> immutableSet = Set.of("X", "Y", "Z");

    try {
      immutableSet.add("W");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot add elements to immutable set: " + e.getMessage());
    }

    try {
      immutableSet.remove("X");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove elements from immutable set: " + e.getMessage());
    }

    try {
      immutableSet.clear();
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot clear immutable set: " + e.getMessage());
    }
  }
}
