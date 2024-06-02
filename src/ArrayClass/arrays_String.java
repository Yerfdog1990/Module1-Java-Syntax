/*
The toString() method is used to convert an array into a string representation.
It takes an array as a parameter and returns a string representation of the array.
 */
package ArrayClass;
import java.util.Arrays;
public class arrays_String {
    public static void main(String[] args) {
        int[] list = {23, 5, 6, 12, 90, 78, 45};
        String result = Arrays.toString(list);
        System.out.println(result);
    }
}
