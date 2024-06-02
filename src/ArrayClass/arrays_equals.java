/*
The equals() method is used to compare two arrays for equality.
It takes two arrays as parameters and returns true if the arrays are equal, otherwise, it returns false.
 */
package ArrayClass;
import java.util.Arrays;

public class arrays_equals {
    public static void main(String[] args) {
        int[] list1 = {2, 3, 4, 5, 6, 7};
        int[] list2 = {7, 6, 5, 4, 3, 2};
        boolean compareArrays = Arrays.equals(list1, list2);
        System.out.println(compareArrays);
    }
}
