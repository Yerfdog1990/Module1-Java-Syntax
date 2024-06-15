package Encoding;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binaryNumber = userInput.nextLine();
        System.out.println(binaryNumber+ " when converted to decimal number is " +toDecimal(binaryNumber));
    }
    public static int toDecimal(String binaryNumber){
        int decimalNumber = 0;
        if(binaryNumber == null){
            return decimalNumber;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1- i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNumber = (int)(decimalNumber + value*Math.pow(2,i));
        }
        return decimalNumber;
    }
}
