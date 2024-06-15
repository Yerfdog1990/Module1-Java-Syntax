package Encoding;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int octalNumber = userInput.nextInt();
        try{
            validateOctal(octalNumber);
            System.out.println(octalNumber + " coverted to octal number is " + toDecimal(octalNumber));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }
        for (int i = 0; octalNumber != 0; i++) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;
    }
    public static int validateOctal(int octalNumber) {
        // Validate if the input is a valid octal number
        String octalString = String.valueOf(octalNumber);
        for (char digit : octalString.toCharArray()) {
            if (digit < '0' || digit > '7') {
                throw new IllegalArgumentException("Sorry," + validateOctal(octalNumber) + " is not used in octal encoding.");
            }
        }
        return octalNumber;
    }
}



