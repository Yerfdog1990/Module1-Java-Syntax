package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
An ArrayList in Java is a part of the Java Collections Framework and provides a dynamic array for storing elements.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //1.Creating the array list
        ArrayList<String> fruits = new ArrayList<>();
        //2.Adding elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pears");
        fruits.add("Banana");
        //3.Accessing elements
        System.out.println("The first fruit is " +fruits.getFirst()+ ", while the third fruit is " +fruits.get(2) +".");
        //4.Modify element
        fruits.set(1, "Pineapple");
        System.out.println("The new list of fruits: " +fruits);
        //5.Removing elements
        fruits.remove("Banana");
        System.out.println("The new list of fruits: " +fruits);
        //Checking size
        System.out.println("The size of the list: " +fruits.size());
        //7.Iterating over elements using for-each loop
        System.out.println("Iterating using for-each loop:");
        for(String i: fruits){
            System.out.println(i);
        }
        //8.Iterating over elements using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //9.Checking if the list contains an element
        System.out.println("Contains \'Pears\'? " +fruits.contains("Pears"));
        System.out.println("Contains \'Jack Fruit\'? "  +fruits.contains("Jack Fruit"));
        //10.Clearing the list
        fruits.clear();
        System.out.println("The array list size after clearing: " +fruits.size());
        
    }
}
