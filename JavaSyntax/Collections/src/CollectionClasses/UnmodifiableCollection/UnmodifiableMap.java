package CollectionClasses.UnmodifiableCollection;

import java.util.Map;

public class UnmodifiableMap {
  public static void main(String[] args) {
    demonstrateUnmodifiableMap();
    System.out.println("\n-------------------\n");
    demonstrateExceptionHandling();
  }

  private static void demonstrateUnmodifiableMap() {
    Map<String, Integer> unmodifiableMap =
        Map.of(
            "One", 1,
            "Two", 2,
            "Three", 3);

    System.out.println("Unmodifiable Map: " + unmodifiableMap);
    System.out.println("Size: " + unmodifiableMap.size());
    System.out.println("Contains key 'One': " + unmodifiableMap.containsKey("One"));
    System.out.println("Value for 'Two': " + unmodifiableMap.get("Two"));
  }

  private static void demonstrateExceptionHandling() {
    Map<String, Integer> unmodifiableMap =
        Map.of(
            "One", 1,
            "Two", 2);

    try {
      unmodifiableMap.put("Four", 4);
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot add elements to unmodifiable map: " + e.getMessage());
    }

    try {
      unmodifiableMap.remove("One");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove elements from unmodifiable map: " + e.getMessage());
    }

    try {
      unmodifiableMap.clear();
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot clear unmodifiable map: " + e.getMessage());
    }
  }
}
