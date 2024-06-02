/*
The copyOfRange() method is used to copy a range of elements from an array to a new array of a specified length.
It takes three parameters — the array to be copied, the starting index and the ending index of the range.
 */
package ArrayClass;

import java.util.Arrays;

public class array_copyRange {
    public static void main(String[] args) {
        int[] list = { 34, 45, 23, 90, 78, 23, 12};
        int[] newCopy = Arrays.copyOfRange(list, 2, 5);
        System.out.println(Arrays.toString(newCopy));
    }
}
