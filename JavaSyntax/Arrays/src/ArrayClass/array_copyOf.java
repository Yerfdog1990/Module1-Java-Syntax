package ArrayClass;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
The copyOf() method is used to copy an array to a new array of a specified length.
It takes two parameters — the array to be copied and the length of the new array.
 */
public class array_copyOf {
    public static void main(String[] args) {
        int[] data = {34, 12, 67, 90, 34, 78, 23};
        int[] newCopy = Arrays.copyOf(data, 4);
        System.out.println("Original array: " +Arrays.toString(data));
        System.out.println("New array: " +Arrays.toString(newCopy));

    }
}
