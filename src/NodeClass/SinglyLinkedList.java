package NodeClass;
/*
Node Class for a Linked List
A linked list is a linear data structure where each element is a separate object, known as a node.
Each node contains data and a reference to the next node in the sequence.
 */

//SinglyLinkedList class represents the linked list
public class SinglyLinkedList<T> {
    private  Node<T> head; //Reference to the first node in the list

    //Constructor to initialize an empty list
    public SinglyLinkedList() {
        this.head = head;
    }

    //Method to add a new node at the beginning of the list
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data); //Create a new node with the given data
        newNode.next = head; //Set the new node's next reference to the current head
        head = newNode; //Update the head to point to the new node
    }
    //Method to add a new node at the end of the list
    public  void addLast(T data){
        Node<T> newNode = new Node<>(data); //Create a new node with the given data
        if(head == null){  //If the list is empty
            head = newNode; //Set the new node as the head
        }else{
            Node current = head; //Start from the head
            while(current.next != null){ //Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; //Set the last node's next reference to the new node
        }
    }
    //Method to display the elements of the list
    public  void display(){
        Node current = head; //Start from the head
        while(current != null){ //Traverse until the end of the list
            System.out.println(current.data + " "); //Print the data of the current node
            current = current.next; //Move to the next node
        }
        System.out.println(); //Print a newline for better readability
    }
}
