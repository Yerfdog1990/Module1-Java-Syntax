package StringMethods;
/*
Converts a string to a set of bytes and returns the array of bytes.
 */
import java.util.Arrays;
public class CharToByte {
    public static void main(String[] args) {
        String str = "Godfrey";
        byte[] byteArray = str.getBytes();
        System.out.println("The string \"Godfrey\" converted to bytes: " +Arrays.toString(byteArray));
    }
}
