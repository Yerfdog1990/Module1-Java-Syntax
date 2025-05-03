package CollectionClasses.mutablecollections;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class MutableDequeue {
  public static void main(String[] args) {
    demonstrateArrayDeque();
    System.out.println("\n-------------------\n");
    demonstrateLinkedListDeque();
  }

  private static void demonstrateArrayDeque() {
    Deque<String> deque = new ArrayDeque<>();

    // Adding elements
    deque.addFirst("First");
    deque.addLast("Last");
    deque.offer("Offered");

    System.out.println("ArrayDeque: " + deque);
    System.out.println("First element: " + deque.peekFirst());
    System.out.println("Last element: " + deque.peekLast());
    System.out.println("Removed first: " + deque.pollFirst());
    System.out.println("Updated deque: " + deque);
  }

  private static void demonstrateLinkedListDeque() {
    Deque<String> deque = new LinkedList<>();

    // Adding elements
    deque.addFirst("First");
    deque.addLast("Last");
    deque.offer("Offered");

    System.out.println("LinkedList Deque: " + deque);
    System.out.println("First element: " + deque.peekFirst());
    System.out.println("Last element: " + deque.peekLast());
    System.out.println("Removed last: " + deque.pollLast());
    System.out.println("Updated deque: " + deque);
  }
}
