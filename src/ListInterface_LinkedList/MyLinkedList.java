package ListInterface_LinkedList;

import java.util.*;

// MyLinkedList class implements the MyList interface
public class MyLinkedList<E> implements MyList{
    private Node<E> head; // Reference to the first node in the list
    private int size; // Number of elements in the list

    // Constructor to initialize an empty list
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean add(Object o) {
        addLast(o); // Add the element at the end of the list
        return true; // Indicate that the element was added successfully
    }

    @Override
    // Method to add an element at a specific index
    public void add(int index, Object element) {
        if(index < 0 || index > size){ // Check if the index is within valid range
            throw new IndexOutOfBoundsException("Index: " +index+ ", Size: " +size);// Throw exception if index is invalid
        }
        Node<E> newNode = (Node<E>) new Node<>(element); // Create a new node with the given element
        if(index == 0){// Adding at the head
            newNode.next = head; // Point the new node to the current head
            head = newNode; // Update the head to be the new node
        }else{// Adding at any other position
            Node<E> current = head; // Start from the head
            for (int i = 0; i < index-1; i++) { // Traverse the list to find the node just before the target index
                current = current.next; // Move to the next node
            }
            newNode.next = current.next; // Point the new node to the next node in the list
            current.next = newNode; // Link the previous node to the new node
        }
        size++; // Increment the size of the list to reflect the addition
    }

    @Override
    // Method to add all elements from a given collection
    public boolean addAll(Collection c) {
        for(Object e : c){ // Loop through each element in the collection
            addLast(e); // Add each element from the collection at the end of the list
        }
        return true; // Indicate that the elements were added successfully
    }

    @Override
    // Method to add all elements from a given collection starting at a specified index
    public boolean addAll(int index, Collection c) {
        for(Object e: c){// Loop through each element in the collection
            add(index++, e);// Add each element from the collection at the current index and then increment the index
        }
        return true;// Indicate that the elements were added successfully
    }

    @Override
    // Method to add an element at the beginning of the list
    public void addFirst(Object o) {
        Node<E> newNode = (Node<E>) new Node<>(o); // Create a new node with the given element
        newNode.next = head;// Set the new node's next reference to the current head
        head = newNode;// Update the head to point to the new node
        size++; // Increment the size of the list

    }
    // Method to add an element at the end of the list
    @Override
    public void addLast(Object o) {
        Node<E> newNode = (Node<E>) new Node<>(o); // Create a new node with the given element
        if(head == null){// Check if the list is empty
            head = newNode;// If empty, set the new node as the head
        }else{
            Node<E> current = head; // Start from the head
            while(current.next != null){// Traverse to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Set the last node's next reference to the new node
        }
        size++; // Increment the size of the list

    }

    @Override
    // Method to get the element at a specific index
    public Object get(int index) {
        if(index < 0 || index >= size){// Check if the index is within valid range
           throw new IndexOutOfBoundsException("Index: " +index+ ", size: " +size);// Throw exception if index is invalid
        }
        Node<E> current = head; // Start from the head
        for (int i = 0; i < index; i++) {// Traverse the list to the target index
            current = current.next; // Move to the next node
        }
        return current.data; // Return the data of the node at the specified index
    }

    @Override
    // Method to get the first element of the list
    public Object getFirst() {
        if(head == null){// Check if the list is empty
            throw new NoSuchElementException(); // Throw exception if the list is empty
        }
        return head.data; // Return the data of the head node
    }

    @Override
    // Method to get the last element of the list
    public Object getLast() {
        if(head == null){// Check if the list is empty
            throw new NoSuchElementException(); // Throw exception if the list is empty
        }
        Node<E> current = head;// Start from the head
        while(current != null){// Traverse to the end of the list
            current = current.next; // Move to the next node
        }
        return current.data;// Return the data of the last node
    }

    @Override
    //Method to remove the first element of the list
    public Object remove() {
        return removeFirst();// Remove the first element of the list
    }

    @Override
    //Method to remove an element from the list at a specific index
    public Object remove(int index) {
        if(index < 0 || index >= size){ //Check for valid index
            throw new IndexOutOfBoundsException("Index: " +index+ ", size: " +size); //Throw exception if the index is invalid
        }
        Node<E> current = head; // Start from the head
        if(index == 0){// Removing the head
            head = head.next;
        }else{
            Node<E> previous = null; // To keep track of the previous node
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next; // Remove the node by updating the previous node's next reference
        }
        size--; // Decrement the size of the list
        return current.data; // Return the data of the removed node
    }

    @Override
    //Method to remove an element by its name
    public boolean remove(Object o) {
        if(head == null){// If the list is empty
            return false;
        }
        if(head.data.equals(o)){// If the head node contains the data to be removed
            head = head.next; // Update the head to the next node
            size--; // Decrement the size of the list
            return  true;
        }
        Node<E> current = head; // Start from the head
        Node<E> previous = null; // To keep track of the previous node
        while(current != null && !current.data.equals(o)){
            previous = current;
            current = current.next;
        }
        if(current != null){
            previous.next = current.next;// Remove the node by updating the previous node's next reference
            size--; // Decrement the size of the list
            return  true;
        }
        return false; // Return false if the element is not found
    }

    @Override
    //Method to remove the first element
    public Object removeFirst() {
        if(head == null){// If the list is empty
            throw new NoSuchElementException();
        }
        E data = (E) head.data; // Get the data of the head node
        head = head.next; // Update the head to the next node
        size--; // Decrement the size of the list
        return data; // Return the data of the removed node
    }

    @Override
    //Method to remove the last
    public Object removeLast() {
        if(head == null){// Check if the list is empty
            throw new NoSuchElementException();
        }
        Node<E> current = head; // Start from the head
        Node<E> previous = null; // To keep track of the previous node
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        if(previous != null){
            previous.next = null;// Remove the last node by setting the previous node's next reference to null
        }else{
            head = null; // If the list has only one node, set head to null
        }
        size--; // Decrement the size of the list
        return current.data;// Return the data of the removed node
    }

    @Override
    //Method to delete all elements in the list
    public void clear() {
        head = null; // Set head to null, effectively clearing the list
        size = 0; // Reset the size to 0

    }

    @Override
    // Method to set a new element at a specific index and return the old element
    public Object set(int index, Object element) {
        if(index < 0 || index >= size){// Check for valid index
            throw new IndexOutOfBoundsException("Index: " +index+ ", size: " +size); //Throw an exception for invalid index
        }
        Node<E> current = head;// Start from the head
        for (int i = 0; i < index; i++) {// Traverse the list to the target index
            current = current.next; //Move to the next node
        }
        E oldData = (E) current.data; // Get the old data of the node
        current.data = element; // Set the new data to the node
        return oldData; // Return the old data
    }

    @Override
    // Method to check if the list contains a specific element
    public boolean contains(Object o) {
        Node<E> current = head; // Start from the head
        while(current != null){// Traverse through the list
            if(current.data.equals(o)){// Check if the current node's data matches the specified element
                return true; // Return true if the element is found
            }
            current = current.next;  // Move to the next node
        }
        return false; // Return false if the element is not found in the list
    }

    @Override
    //Method to find size of the list
    public int size() {
        return size; // Return the size of the list
    }

    @Override
    //Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0; // Return true if the list is empty
    }

    @Override
    //Method to find index of an element
    public int indexOf(Object o) {
        Node<E> current = head; // Start from the head
        int index = 0; // Initialize the index counter
        while(current != null){// Traverse through the list
            if(current.data.equals(0)){// Check if the current node's data matches the specified element
                return index; // Return the index if the element is found
            }
            current = current.next; // Move to the next node
            index++; // Increment the index counter
        }
        return -1; // Return -1 if the element is not found in the list
    }

    @Override
    // Method to find the last index of a specific element in the list
    public int lastIndexOf(Object o) {
        Node<E> current = head; // Start from the head
        int index = 0; // Initialize the index counter
        int lastIndex = -1; // Initialize the last index to -1 (indicating the element is not found yet)
        while(current != null){// Traverse through the list
            if(current.data.equals(0)){// Check if the current node's data matches the specified element
                lastIndex = index; // Update the last index if the element is found
            }
            current = current.next; // Move to the next node
            index++; // Increment the index counter
        }
        return lastIndex; // Return the last index of the element (or -1 if not found)
    }

    @Override
    // Method to return an iterator over the elements in the list
    public Iterator iterator() {// Return a new anonymous Iterator implementation
        return new Iterator() {
            Node<E> current = head; // Start from the head of the list
            @Override
            // Method to check if there are more elements to iterate over
            public boolean hasNext() {
                return current != null; // Return true if the current node is not null
            }

            @Override
            // Method to return the next element in the iteration
            public Object next() {
                if(!hasNext()){// Check if there are more elements to iterate over
                    throw new NoSuchElementException(); // Throw exception if there are no more elements
                }
                Object data = current.data; // Get the data of the current node
                current = current.next; // Move to the next node in the list
                return data; // Return the data of the current node
            }
        };
    }

    @Override
    // Method to return a list iterator over the elements in the list
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("listIterator() not supported"); // Throw exception since this method is not supported
    }

    @Override
    // Method to return a list iterator starting at a specified position in the list
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("listIterator(int index) not supported");// Throw exception since this method is not supported
    }

    @Override
    // Method to return a view of the portion of this list between fromIndex, inclusive, and toIndex, exclusive
    public List subList(int fromIndex, int toIndex) {// Check if the indices are valid
        if(fromIndex < 0 || toIndex > size || fromIndex > toIndex){
            throw new IndexOutOfBoundsException("fromIndex: " +fromIndex+ ", toIndex: " +toIndex+ ", size: " +size);  // Throw exception if indices are invalid
        }
        List<Object> sublist = new ArrayList<>();  // Create a new list to hold the sublist elements
        Node<E> current = head; // Start from the head
        for (int i = 0; i < fromIndex; i++) {// Traverse the list to the starting index
            current = current.next; // Move to the next node

        }
        for (int i = fromIndex; i < toIndex; i++) {// Traverse the list from the starting index to the ending index
            sublist.add(current.data); // Add the elements to the sublist
            current = current.next; // Move to the next node
        }
        return sublist; // Return the sublist
    }

    @Override
    // Method to remove all elements in the specified collection from this list
    public boolean removeAll(Collection c) {
        boolean modified = false; // Flag to track if the list was modified
        for(Object e: c){// Loop through each element in the collection
            while(remove(e)){// Remove all occurrences of each element
                modified = true; // Set the modified flag to true if an element is removed
            }
        }
        return modified; // Return true if the list was modified
    }
}
