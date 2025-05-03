package CollectionClasses.mutablecollections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MutableQueue {
  public static void main(String[] args) {
    demonstrateLinkedListQueue();
    System.out.println("\n-------------------\n");
    demonstratePriorityQueue();
  }

  private static void demonstrateLinkedListQueue() {
    Queue<Integer> queue = new LinkedList<>();

    // Adding elements
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);

    System.out.println("LinkedList Queue: " + queue);
    System.out.println("Head element: " + queue.peek());
    System.out.println("Removed element: " + queue.poll());
    System.out.println("Updated queue: " + queue);
  }

  private static void demonstratePriorityQueue() {
    Queue<Integer> priorityQueue = new PriorityQueue<>();

    // Adding elements
    priorityQueue.offer(3);
    priorityQueue.offer(1);
    priorityQueue.offer(2);

    System.out.println("Priority Queue: " + priorityQueue);
    System.out.println("Head element: " + priorityQueue.peek());
    System.out.println("Removed element: " + priorityQueue.poll());
    System.out.println("Updated queue: " + priorityQueue);
  }
}
