package Encoding;

import java.util.Scanner;

public class HexToDecimal {
    private static final String HEX = "0123456789ABCDEF";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter hexadecimal number: ");
        String hexadecimalNumber = userInput.nextLine();
        System.out.println(hexadecimalNumber+ " when converted to hexadecimal number is " +toDecimal(hexadecimalNumber));
    }
    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
