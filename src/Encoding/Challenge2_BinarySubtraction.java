package Encoding;

import java.util.Scanner;

public class Challenge2_BinarySubtraction {
    public static void main(String[] args) {
        //Initiate variables to use
        long binary1, binary2;
        int i = 0;
        int borrow = 0;

        //Create an array to store the difference between arrays
        int[] difference = new int[20];

        //Create a scanner object
        Scanner userInput = new Scanner(System.in);

        //Prompt user to enter teh first binary number
        System.out.print("Enter the first binary number: ");
        String binaryStr1 = userInput.nextLine();
        //Check if the binary number is valid
        while(!isValidBinary(binaryStr1)){
            System.out.print("Invalid binary number. Enter the first binary number: ");
           binaryStr1 = userInput.nextLine();
        }
       binary1 = Long.parseLong(binaryStr1);

        //Prompt user to enter teh second binary number
        System.out.print("Enter the second binary number: ");
        String binaryStr2 = userInput.nextLine();
        //Check if the binary number is valid
        while(!isValidBinary(binaryStr2)){
            System.out.print("Invalid binary number. Enter the second binary number: ");
            binaryStr2 = userInput.nextLine();
        }
        binary2 = Long.parseLong(binaryStr2);

        // Close the scanner to prevent resource leaks
        userInput.close();

        //Perform binary subtraction
        while(binary1 != 0 || binary2 != 0){
            //Access current binary digits
            int digit1 = (int)(binary1 % 10);
            int digit2 = (int)(binary2 % 10);

            //Find the difference between binary
            int subtraction = digit1 - digit2 - borrow;

            //Borrow from higher digit bit if the difference is negative
            if(subtraction < 0){
                subtraction = subtraction + 2;
                borrow = 1;
            }else{
                borrow = 0;
            }
            //Store the result in difference array
            difference[i++] = subtraction;

            //Move to the next higher bit
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        //Remove leading zeros
        while(i > 1 && difference[i-1] == 0){
            i--;
        }
        //Decrement then display the result
        --i;
        System.out.print("The difference between binary: ");
        while(i >= 0){
            System.out.print(+difference[i--]);
        }
        System.out.println();
    }
    public static boolean isValidBinary(String binary){
        for(char c: binary.toCharArray()){
            if(c != '0' && c != '1'){
                return false;
            }
        }
        return true;
    }

}
