package Encoding;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the octal number: ");
        int octalNumber = userInput.nextInt();
        System.out.print(octalNumber+ " coverted to decimal number is " +toOctal(octalNumber));
    }
    public static int toOctal(int decimalNumber){
        int octalNumber = 0;
        if(decimalNumber <= 0){
            return octalNumber;
        }
        for (int i = 0; decimalNumber != 0; i++) {
            octalNumber = (int)(octalNumber + (decimalNumber % 8)*Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }
}
