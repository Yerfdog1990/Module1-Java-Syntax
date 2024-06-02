package ArrayClass;

import java.util.Arrays;

/*
The sort() method is used to sort an array in ascending order.
The method takes an array as a parameter and sorts the elements of the array in ascending order.
 */
public class array_sort {
    public static void main(String[] args) {
        int []data = {2, 3, 0, 1, 9, 4, 40, 12, 39};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
