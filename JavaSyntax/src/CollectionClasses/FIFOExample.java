package CollectionClasses;

import java.util.LinkedList;
import java.util.Queue;

/*
FIFO (First In, First Out)
FIFO is typically implemented using a queue. In a queue, the first element added is the first one to be removed.
The Java Collections Framework provides several implementations of the Queue interface, such as LinkedList, ArrayDeque, and PriorityQueue.

Key Features of Queue:
1.Elements are added at the end (tail) and removed from the beginning (head).
2.Supports operations such as offer (to add an element), poll (to remove the head element),
and peek (to look at the head element without removing it).
 */
public class FIFOExample {
    public static void main(String[] args) {
        //Create a queue
        Queue<String> stringQueue = new LinkedList<>();

        //Add elements
        stringQueue.offer("A");
        stringQueue.offer("B");
        stringQueue.offer("C");
        stringQueue.offer("D");

        //Displaying the queue
        System.out.println("Queue: " +stringQueue);
        //Remove the head element
        System.out.println("Polled element: " +stringQueue.poll());
        //Print queue after poll
        System.out.println("Queue after poll: " +stringQueue);
        //Peeking the head element
        System.out.println("Head element after peek: " +stringQueue.peek());
        //Display queue after peeking head element
        System.out.println("Queue after peek: " +stringQueue);
    }
}
