package CollectionClasses;
/*
FIFO (First In, First Out)
FIFO is typically implemented using a queue.
In a queue, the first element added is the first one to be removed.
The Java Collections Framework provides several implementations of the Queue interface, such as LinkedList, ArrayDeque, and PriorityQueue.

Key Features of Queue:
1.Elements are added at the end (tail) and removed from the beginning (head).
2.Supports operations such as offer (to add an element), poll (to remove the head element), and peek (to look at the head element without removing it).
 */

import java.util.Stack;

public class LIFOExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //Adding elements to the stack
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");

        //Display the stack
        System.out.println("Stack: " +stack);
        //Removing the top element
        System.out.println("Popped element: " +stack.pop());
        //Displaying the stack after pop
        System.out.println("Stack after pop: " +stack);
        //Peeking at the top element
        System.out.println("Top element: " +stack.peek());
        //Displaying the stack after peek
        System.out.println("Stack after pop: " +stack);
    }
}
