package Two_Dimensional_Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

//QR-code reader
//*******************************************************************
//Let's write a program to read pseudo-QR-codes. The program is given a two-dimensional
// array expectedArray that is 3x3.
//This array stores a pseudo-QR-code. There is already code that randomly fills this array.
// If you want, you can fill it yourself — that won't affect the tests.
//You need to write code to fill the actualArray with values read from the keyboard.
// We'll read one character at a time. Spaces represent empty cells is a space,
// while '#' represent filled cells.
//Next, using the appropriate method of the Arrays class, you need to compare this array
// with the expectedArray array and display the result of the comparison:
// true if the arrays are the same or false if they are different.

//Requirements:
//        •	The Solution class must have a public static String[][]
//        expectedArray field initialized with a new String[3][3].
//        •	The Solution class must have a public static String[][]
//        actualArray field initialized with a new String[3][3].
//        •	The actualArray array must be filled with values read from the keyboard.
//        •	To compare two-dimensional arrays in the program,
//        use the appropriate method of the Arrays class.
public class challenge9_QR_code_reader {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException{
        //write your code here

    }

}
