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
    //Method to add a new node at the middle of the list
    public void addElement(T data){
        Node<T> newNode = new Node<>(data); //Create a new node with the given data
        if(head == null){ //If the list is empty
            head = newNode; //Set the new node as the head
        }else{
            Node temp = head; //Start from the head
            while(temp.next != null){ //Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; //Set the last node's next reference to the new node
        }
    }
    //Method to add a new node at the end of the list
    public  void addLast(T data){
        Node<T> newNode = new Node<>(data); //Create a new node with the given data
        if(head == null){  //If the list is empty
            head = newNode; //Set the new node as the head
        }else{
            Node temp = head; //Start from the head
            while(temp.next != null){ //Traverse to the end of the list
                temp = temp.next;
            }
            temp.next = newNode; //Set the last node's next reference to the new node
        }
    }
    //Method to get first element
    public void getFirstElement(T data){

    }
    //Method to get last element
    public void getLastElement(T data){

    }
    //Method to set element
    public void setElement(T data){

    }
    //Method to display the elements of the list
    public  void display(){
        Node temp = head; //Start from the head
        while(temp != null){ //Traverse until the end of the list
            System.out.println(temp.data + " "); //Print the data of the temp node
            temp = temp.next; //Move to the next node
        }
        System.out.println(); //Print a newline for better readability
    }
    //Method to remove elements
    public void remove(T data){
        if(head == null){ //If the list is empty, there's nothing to remove
            System.out.println("List is empty."); // Print a message
            return;
        }
        if(head.data == data){
            head = head.next;  //Update the head to the next node
            return; //Exit the method
        }
        Node temp = head;  //Start from the head
        Node previous = null; //To keep track of the previous node
        //Traverse the list to find the node to be removed
        while(temp != null && temp.data != data){
            previous = temp; //Update the previous node
            temp = temp.next; //Move to the next node
        }
        //If the node to be removed is found
        if(temp != null){
            previous.next = temp.next; //Remove the node by updating the previous node's next reference
        } else {
            System.out.println("Element not found in the list."); //Print a message if the element is not found
        }
    }
}
