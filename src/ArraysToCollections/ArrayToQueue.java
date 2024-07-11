package ArraysToCollections;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayToQueue {
    //Method to convert string[] array to queue
    public static Queue<String> convertToQueue(String[] strings){
        //Initialize the Queue
        Queue<String> stringQueue = new LinkedList<>();
        //Iterate over the string[] array
        for (int i = 0; i < strings.length; i++) {
            //Add the elements to the Queue
            stringQueue.add(strings[i]);
        }
        return stringQueue;
    }
    //Main method
    public static void main(String[] args) {
        //Initialize the string[] array
        String[] array = {"Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi", "DRC Congo", "South Sudan"};
        //Iterate over string[] array elements
        System.out.println("East African Community nations");
        for (int i = 1; i < array.length; i++) {
            //Print the string[] array
            System.out.println("Country " +i+ " : " +array[i]);
        }
        //Print the Queue
        System.out.println("Queue: " +convertToQueue(array));
    }
}
