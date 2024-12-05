/*
The asList() method is used to convert an array to a List.
It takes an array as a parameter and returns a List containing the elements of the array.
 */
package ArrayClass;

import java.lang.reflect.Array;
import java.util.List;
import  java.util.Arrays;

public class arrays_List {
    public static void main(String[] args) {
        String[] nameOfStudents = {"Godfrey", "Okoth", "Ouma"};
        List<String> list = Arrays.asList(nameOfStudents);
        System.out.println(list);
    }
}
