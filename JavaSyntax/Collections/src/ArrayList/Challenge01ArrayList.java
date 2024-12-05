package ArrayList;
/*
Challenge 01:
Write a Java program to convert an array to an ArrayList.
 */

//Import the ArrayList and Arrays classes from the Java utility library.
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge01ArrayList {
    public static void main(String[] args) {
        //Create an array of strings.
        String[] myName = {"Godfrey", "Okoth", "Ouma"};
        //Create an ArrayList of strings and initialize it with the contents of the array.
        ArrayList <String> convertToArrayList = new ArrayList(Arrays.asList(myName));
        //Print the ArrayList to the console.
        System.out.println("Array list: " +convertToArrayList);
    }
}
