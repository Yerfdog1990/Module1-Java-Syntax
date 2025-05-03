package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates various utility methods from the Collections class
 * for ordering and manipulating elements in collections.
 */
public class OrderElements {
  public static void main(String[] args) {
    demonstrateReverse();
    demonstrateSort();
    demonstrateRotate();
    demonstrateShuffle();
  }

  /**
   * Demonstrates Collections.reverse() method which reverses the order
   * of elements in a list.
   */
  private static void demonstrateReverse() {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "One", "Two", "Three");
    System.out.println("Before reverse: " + list);
    Collections.reverse(list);
    System.out.println("After reverse: " + list);
  }

  /**
   * Demonstrates Collections.sort() method which sorts the elements
   * of a list into ascending order.
   */
  private static void demonstrateSort() {
    List<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers, 3, 1, 4, 1, 5, 9, 2, 6);
    System.out.println("Before sort: " + numbers);
    Collections.sort(numbers);
    System.out.println("After sort: " + numbers);
  }

  /**
   * Demonstrates Collections.rotate() method which rotates the elements
   * in a list by the specified distance.
   */
  private static void demonstrateRotate() {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "One", "Two", "Three", "Four");
    System.out.println("Before rotate: " + list);
    Collections.rotate(list, 2);
    System.out.println("After rotating 2 positions: " + list);
  }

  /**
   * Demonstrates Collections.shuffle() method which randomly permutes
   * the elements in a list.
   */
  private static void demonstrateShuffle() {
    List<Integer> numbers = new ArrayList<>();
    Collections.addAll(numbers, 1, 2, 3, 4, 5);
    System.out.println("Before shuffle: " + numbers);
    Collections.shuffle(numbers);
    System.out.println("After shuffle: " + numbers);
  }
}
