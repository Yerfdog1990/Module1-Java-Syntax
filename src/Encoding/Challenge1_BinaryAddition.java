package Encoding;

import java.util.*;
/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/

public class Challenge1_BinaryAddition {
    public static void main(String[] args) {
        //Declare variables to store two binary numbers, an index, and a remainder
        long binary1;
        long binary2;
        int remainder = 0;
        int i = 0;

        //Create an array to store the sum of binary digits
        int[] sum = new int[20];

        //Create a Scanner object to read input from the user
        Scanner userInput = new Scanner(System.in);

        //Prompt the user to input the first binary number
        System.out.print("Enter the first binary number: ");
        String binary1Str = userInput.next();
        while (!isValidBinary(binary1Str)) {
            System.out.print("Invalid binary number. Enter the first binary number: ");
            binary1Str = userInput.next();
        }
        binary1 = Long.parseLong(binary1Str);

        //Prompt the user to input the second binary number
        System.out.print("Enter the second binary number: ");
        String binary2Str = userInput.next();
        while (!isValidBinary(binary2Str)) {
            System.out.print("Invalid binary number. Enter the second binary number: ");
            binary2Str = userInput.next();
        }
        binary2 = Long.parseLong(binary2Str);

        // Close the scanner to prevent resource leaks
        userInput.close();

        //Perform binary addition while there are digits in the binary numbers
        while(binary1 != 0 || binary2 != 0){
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1/10;
            binary2 = binary2/10;
        }
        //If there is a remaining carry, add it to the sum
        if(remainder != 0){
            sum[i++] = remainder;
        }
        //Decrement the index to prepare for printing
        --i;
        //Display the sum of the two binary numbers
        System.out.print("Sum of binary numbers is: ");
        while(i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
    // Function to check if a given string is a valid binary number
    public static boolean isValidBinary(String binary) {
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
