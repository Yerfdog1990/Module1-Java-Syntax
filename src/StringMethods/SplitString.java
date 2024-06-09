package StringMethods;

import java.util.Arrays;

/*
Splits a string into multiple substrings.
 */
public class SplitString {
    public static void main(String[] args) {
        String str = "Godfrey";
        String[] name = str.split("");
        System.out.println("The string \"Godfrey\" when split: " +Arrays.toString(name));
    }
}
