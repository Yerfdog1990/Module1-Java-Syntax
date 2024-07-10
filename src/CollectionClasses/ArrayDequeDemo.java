package CollectionClasses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*
Key Features of ArrayDeque
1.Implements Deque Interface: Allows operations from both ends (head and tail) of the deque.
2.No Null Values: Does not allow null elements.
3.Performance: Faster than Stack and LinkedList when used as a stack or queue.
4.Dynamic Size: Automatically grows and shrinks as needed, with no fixed size limit.
5.Unsynchronized: Not thread-safe; requires external synchronization if used in a multi-threaded environment.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        //Create ArrayDequeue
        Deque<String> deque = new ArrayDeque<>();

        //addFirst() is used to add elements to the front.
        deque.add("One");
        deque.add("Two");
        deque.addFirst("First");
        deque.addFirst("Second");
        //addLast() is used to add elements to the end.
        deque.addLast("Third");
        deque.addLast("Fouth");

        //Print deque
        System.out.println("Deque: " +deque);

        //removeFirst() removes and returns the element from the front.
        System.out.println("Remove from front (head): " +deque.removeFirst());
        //removeLast() removes and returns the element from the end.
        System.out.println("Remove from end (tail): " +deque.removeLast());

        //Printing dequeue after removal
        System.out.println("Deque after removal: " +deque);

        //peekFirst() retrieves the element at the front without removing it./Accessing elements from the front (head) of the deque without removing
        System.out.println("Element from the front (head) of the deque: " +deque.peekFirst());
        //peekLast() retrieves the element at the end without removing it.
        System.out.println("Element from the end (tail) of the deque: " +deque.peekLast());

        //Demonstrating stack operations (LIFO)
        //push() adds an element to the front (similar to addFirst()).
        deque.push("NewFirst");
        System.out.println("Deque after push: " +deque);

        //pop() removes and returns the element from the front (similar to removeFirst()).
        String popElement = deque.pop();
        System.out.println("Popped element: " +popElement);
        System.out.println("Deque after pop: " +deque);

        //Iterate over the elements using for each loop
        System.out.println("Iterating over the elements:");
        for (String str: deque) {
            System.out.println(str);
        }
        //Iterate over the elements using while loop
        System.out.println("Iterating over the elements:");
        Iterator<String > iterator = deque.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
