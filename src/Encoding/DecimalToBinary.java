package Encoding;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimalNumber = userInput.nextInt();
        System.out.println(decimalNumber + " when coverted to binary number is " +toBinary(decimalNumber));
    }
    public static String toBinary(int decimalNumber){
        String binaryNumber = "";
        if(decimalNumber <= 0){
            return null;
        }
        for (; decimalNumber != 0; ) {
            binaryNumber = binaryNumber + decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }
}
