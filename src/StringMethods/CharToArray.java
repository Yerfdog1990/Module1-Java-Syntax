package StringMethods;
/*
Returns an array of the characters (a copy) that make up the string
 */
import java.util.Arrays;
public class CharToArray {
    public static void main(String[] args) {
        String str1 = "Godfrey";
        char[] charArrays = str1.toCharArray();
        System.out.println("String 1 converted to arrays: " +Arrays.toString(charArrays));
    }
}
