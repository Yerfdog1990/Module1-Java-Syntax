package ArrayList;
/*
ArrayList object itself is duplicated, but the elements inside the ArrayList are not deeply copied.
Instead, the references to the elements are copied,
so both the original and the cloned list will reference the same objects.
 */

import java.util.ArrayList;

public class ArrayListCloneDemo {
    public static void main(String[] args) {
        //Creating an ArrayList and adding elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Godfrey");
        originalList.add("Okoth");
        originalList.add("Ouma");

        //Cloning the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();
        //Displaying and the original and cloned ArrayList
        System.out.println("Original list: " +originalList);
        System.out.println("Cloned list: " +clonedList);
        System.out.println(originalList.equals(clonedList));//True because the content in both list is the same
        System.out.println(originalList == clonedList);//False because they do not point to the same memory location

        //Checking if both lists have the same elements references
        System.out.println(originalList.get(1) == clonedList.get(1));


    }
}
