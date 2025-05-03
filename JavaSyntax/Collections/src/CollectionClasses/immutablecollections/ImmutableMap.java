package CollectionClasses.immutablecollections;

import java.util.Map;

public class ImmutableMap {
  public static void main(String[] args) {
    demonstrateImmutableMap();
    System.out.println("\n-------------------\n");
    demonstrateExceptionHandling();
  }

  private static void demonstrateImmutableMap() {
    Map<String, String> immutableMap = Map.of("key1", "value1", "key2", "value2");
    System.out.println("Immutable Map: " + immutableMap);
    System.out.println("Size: " + immutableMap.size());
    System.out.println("Contains key 'key1': " + immutableMap.containsKey("key1"));
    System.out.println("Value for 'key2': " + immutableMap.get("key2"));
  }

  private static void demonstrateExceptionHandling() {
    Map<String, String> immutableMap = Map.of("key1", "value1", "key2", "value2");

    try {
      immutableMap.put("key3", "value3");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot add elements to immutable map: " + e.getMessage());
    }

    try {
      immutableMap.remove("key1");
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot remove elements from immutable map: " + e.getMessage());
    }

    try {
      immutableMap.clear();
    } catch (UnsupportedOperationException e) {
      System.out.println("Cannot clear immutable map: " + e.getMessage());
    }
  }
}
