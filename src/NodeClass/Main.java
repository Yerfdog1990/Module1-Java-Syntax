package NodeClass;

//Main method to demonstrate the usage of the SinglyLinkedList class
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList<>();//Create a new empty list
        list.addFirst(10);//Add 10 at the beginning
        list.addFirst(20);//Add 20 at the beginning
        list.addLast(30);//Add 30 at the end
        list.addLast(40);//Add 40 at the end

        //Display the list elements
        list.display();
    }

}
