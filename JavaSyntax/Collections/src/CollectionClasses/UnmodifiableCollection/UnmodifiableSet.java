package CollectionClasses.UnmodifiableCollection;

import java.util.Set;

public class UnmodifiableSet {
  public static void main(String[] args) {
    demonstrateUnmodifiableSet();
    System.out.println("\n-------------------\n");
    demonstrateExceptionHandling();
  }

  private static void demonstrateUnmodifiableSet() {
    Set<String> unmodifiableSet = Set.of("Apple", "Banana", "Orange");
    System.out.println("Unmodifiable Set: " + unmodifiableSet);
    System.out.println("Size: " + unmodifiableSet.size());
    System.out.println("Contains 'Apple': " + unmodifiableSet.contains("Apple"));
  }

  private static void demonstrateExceptionHandling() {
    Set<String> unmodifiableSet = Set.of("Red", "Green", "Blue");

    try {
      unmodifiableSet.add("Yellow");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot add elements to unmodifiable set: " + e.getMessage());
    }

    try {
      unmodifiableSet.remove("Red");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove elements from unmodifiable set: " + e.getMessage());
    }

    try {
      unmodifiableSet.clear();
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot clear unmodifiable set: " + e.getMessage());
    }
  }
}
