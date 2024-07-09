package CollectionClasses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
Queue Key Features
1.FIFO Structure: Queue follows a First-In-First-Out (FIFO) order where elements are added at the rear (tail) and removed from the front (head).
2.Interfaces: The Queue interface is part of the java.util package and is implemented by various classes such as LinkedList, PriorityQueue, etc.
3.Operations: Key operations include offer, poll, peek, add, remove, and element.
4.Blocking and Non-Blocking: There are both blocking (BlockingQueue) and non-blocking implementations, with blocking queues providing additional thread-safety features.
5.Bounded and Unbounded: Queues can be bounded (having a maximum capacity) or unbounded.
 */
public class QueueDemo {
    public static void main(String[] args) {
        //Create a Queue
        Queue<String> queue = new LinkedList<>();

        //add(E e): Inserts the specified element into the queue if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
        queue.add("Tanzania");
        queue.add("Uganda");
        queue.add("South Sudan");
        //offer(E e): Inserts the specified element into the queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
        queue.offer("Ethiopia");
        queue.offer("Somalia");
        System.out.println("Queue after adding elements: " +queue);

        //Access elements using peek() and element()
        //peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("Head of the queue using \"Peak()\": " +queue.peek());
        //element(): Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println("Head of the queue using \"element()\": " +queue.element());

        //Remove elements using poll() and remove()
        //poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("Removed elements using \"poll()\": " +queue.poll());
        //remove(): Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
        System.out.println("Removed elements using \"remove()\": " +queue.remove());
        //Check update after retrieving and remove some elements
        System.out.println("Updated queue after removing elements: " +queue);
        //iterator(): Returns an iterator over the elements in this queue in proper sequence.
        //a)Iterate over elements using for each loop
        System.out.println("Iterate over elements in the queue using \"For-each loop\": ");
        for(String s: queue){
            System.out.println(s);
        }
        //b)Iterate over elements using iterator method
        System.out.println("Iterating over elements using \"iterator()\":");
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //contains(Object o): Returns true if this queue contains the specified element.
        System.out.println("The queue contains \"Somalia\": " +queue.contains("Somalia"));
        System.out.println("The queue contains \"Uganda\": "+queue.contains("Uganda"));
        //size(): Returns the number of elements in this queue.
        System.out.println("The size of the queue is: " +queue.size());
        //clear(): Removes all of the elements from this queue.
        queue.clear();
        System.out.println("Queue size after clearing: " +queue.size());
        //isEmpty(): Returns true if this queue contains no elements.
        System.out.println("The queue empty: " +queue.isEmpty());



    }
}
