package ArrayList;
/*
Challenge 02:
Write a Java program to convert an ArrayList to an array.
 */

//Import the ArrayList and Arrays classes from the Java utility library.
import java.util.ArrayList;

public class Challenge02ArrayList {
    public static void main(String[] args) {
        //Create a new ArrayList of strings.
        ArrayList<String> myName = new ArrayList<>();
        myName.add("Godfrey");
        myName.add("Okoth");
        myName.add("Ouma");
        //Create a new string array with the same size as the ArrayList.
        String[] convertedToArray = new String[myName.size()];
        //Convert the ArrayList to an array and store it in my_array.
        myName.toArray(convertedToArray);
        //Iterate through the elements of the string array and print each element.
        for(String element : convertedToArray){
            System.out.print(element);
        }


    }

}
