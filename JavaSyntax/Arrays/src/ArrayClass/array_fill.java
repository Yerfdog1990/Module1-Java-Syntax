package ArrayClass;
import java.util.Arrays;
/*
The fill() method is used to fill an array with a specified value.
It takes two parameters — the array to be filled and the value to be filled with.
 */
public class array_fill {
    public static void main(String[] args) {
        int[] data = new int[5];
        Arrays.fill(data, 5);
        System.out.println(Arrays.toString(data));
    }
}
