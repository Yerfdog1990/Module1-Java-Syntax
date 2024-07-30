package Arrays;

import java.util.Arrays;

/*
Write a Java program to sort a numeric array and a string array.
 */
public class SortingElements {
    public static void main(String[] args) {
        String[] arrayString = {"Godfrey", "Cyril", "Rosemary", "Cyrek"};
        int[] arrayNumber = {2, 5, 6, 1, 9, 8, 7};
        Arrays.sort(arrayNumber);
        Arrays.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(arrayNumber));
    }
}
