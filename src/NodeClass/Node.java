package NodeClass;
/*
A Node class in Java is a fundamental building block used in various data structures, such as linked lists, trees, and graphs.
It typically contains data and references (or pointers) to other nodes.
The Node class is recommended when you need to implement dynamic data structures that require frequent insertions, deletions, or traversal operations.
 */

//Node class representing each element in the linked list
public class Node<T>{
    T data; //Data part of the node
    Node<T> next; //Reference to the next node
    //Constructor to initialize a new node with given data
    public Node(T data) {
        this.data = data; //Set the data field of this node to the given data
        this.next = null; //Initialize the next reference to null, indicating that there is no next node yet
    }
}
