package CollectionClasses;
/*
A stack is a data structure to which you can add elements and from which you can retrieve elements.
In doing so, you can only take elements from the end: you first take the last one added, then the second to last one added, etc.

Methods
1.T push(T obj): Adds the obj element to the top of the stack
2.T pop(): Takes the element from the top of the stack (the stack depth decreases)
3.T peek(): Returns the item at the top of the stack (the stack does not change)
4.boolean empty(): Checks whether the collection is empty
5.int search(Object obj): Searches for an object in the collection and returns its index
 */


import java.util.Stack;

public class StackDemo<I> {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> integerStack = new Stack<>();
        // Push elements onto the stack
        integerStack.push(1); // Stack: [1]
        integerStack.push(2); // Stack: [1, 2]
        integerStack.push(3); // Stack: [1, 2, 3]

        // Pop the top element from the stack
        int x = integerStack.pop(); // x = 3, Stack: [1, 2]

        // Push another element onto the stack
        integerStack.push(4); // Stack: [1, 2, 4]

        // Peek at the top element without removing it
        int y = integerStack.peek(); // y = 4, Stack: [1, 2, 4]

        // Pop the top element
        integerStack.pop(); // Stack: [1, 2]

        // Pop another element
        integerStack.pop(); // Stack: [1]

        // Print the results
        System.out.println("x = " + x); // Output: x = 3
        System.out.println("y = " + y); // Output: y = 4
        System.out.println("Remaining stack: " + integerStack); // Output: Remaining stack: [1]
    }
}
