package ArraysToCollections;

import java.util.HashSet;

public class ArrayToHashSet {
    //Method to convert the string[] array to HashSet
    public static HashSet<String> convertToHashSet(String[] strings){
        //Initialize HashSet
        HashSet<String> hashSet = new HashSet<>();
        //Iterate over the string elements
        for (int i = 0; i < strings.length; i++) {
            //Add elements to the HashSet
            hashSet.add(strings[i]);
        }
        return hashSet;
    }
    //Main method
    public static void main(String[] args) {
        //Initialize the string[] array
        String[] array = {"Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi", "DRC Congo", "South Sudan"};
        //Iterate over the string[] array elements
        System.out.println("East African Community Nations");
        for (int i = 1; i < array.length; i++) {
            //Print the string[] array elements
            System.out.println("Country " +i+ " : " +array[i]);
        }
        //Print HashSet
        System.out.println("HashSet: " +convertToHashSet(array));
    }
}
