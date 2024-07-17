package ListInterface_LinkedList;

// Main class to demonstrate the usage of MyLinkedList
public class Main {
    public static void main(String[] args) {
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();// Create a new empty list

        // Adding elements
        linkedList.addFirst(10); // Add 10 at the beginning
        linkedList.addFirst(20); // Add 20 at the beginning
        linkedList.addLast(30);  // Add 30 at the end
        linkedList.addLast(40);  // Add 40 at the end

        // Displaying the list elements
        System.out.print("List elements: ");
        linkedList.iterator().forEachRemaining(e -> System.out.print(e + " ")); // Iterate and print each element
        System.out.println();

        // Removing elements
        linkedList.remove(2); // Remove 20 from the list
        linkedList.remove((Integer) 40); // Remove 40 from the list
        linkedList.removeFirst(); // Remove the first element
        linkedList.removeLast(); // Remove the last element

        // Displaying the list elements after removals
        System.out.print("List elements after removals: ");
        linkedList.iterator().forEachRemaining(e -> System.out.print(e + " ")); // Iterate and print each element
        System.out.println();
    }
}
