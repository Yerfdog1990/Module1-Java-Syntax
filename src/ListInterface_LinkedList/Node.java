package ListInterface_LinkedList;

// Node class represents each element in the linked list
public class Node<E> {
    Object data;// Data part of the node
    Node<E> next;// Reference to the next node

    // Constructor to initialize a new node with given data
    public Node(E data) {
        this.data = data;// Set the data field of this node to the given data
        this.next = null;// Initialize the next reference to null
    }
}
