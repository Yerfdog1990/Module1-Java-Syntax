package InputStreamClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Write a program that reads the path to file1 and the path to file2 from the console.
Then it writes all the bytes from file1 to file2, but in doing so it swaps them according to this rule:
swap the first with the second, the third with the fourth, and so on.
 */
public class SwapFile {
    public static void main(String[] args) {
        try(// Create a Scanner object to read user input from the console
            Scanner userInput = new Scanner(System.in);
            // Create a FileInputStream to read from the file specified by the user
            FileInputStream fileIn = new FileInputStream(userInput.nextLine());
            // Create a FileOutputStream to write to the file specified by the user
            FileOutputStream fileOut = new FileOutputStream(userInput.nextLine())){
            // Read all bytes from the input file into a byte array
            byte[] bytesIn = fileIn.readAllBytes();
            // Create a new byte array to store the swapped bytes
            byte[] bytesOut = new byte[bytesIn.length];
            // Iterate through the byte array, two bytes at a time
            for (int i = 0; i < bytesIn.length ; i+=2) {
                // If there is a pair of bytes to swap, swap them
                if(i < bytesIn.length - 1){
                    bytesOut[i] = bytesIn[i+1];// Swap the first byte with the second
                    bytesOut[i+1] = bytesIn[i];// Swap the second byte with the first
                }else{
                    // If there is a single byte left (odd number of bytes), copy it as is
                    bytesOut[i] = bytesIn[i];
                }
            }
            // Write the swapped bytes to the output file
            fileOut.write(bytesOut);
        } catch (IOException e) {
            // Handle any IOExceptions that might occur and print the error message
            System.out.println("Something went wrong : " + e);
        }finally {
            // This block executes after the try block, indicating the operation is complete
            System.out.println("Operation executed successfully.");
        }
    }
}
