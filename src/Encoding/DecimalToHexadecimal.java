package Encoding;

import java.util.Scanner;

public class DecimalToHexadecimal {
    private static final String HEX = "0123456789ABCDEF";
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int decimalNumber = userInput.nextInt();
        System.out.println(decimalNumber+ " when converted to hexadecimal number is " +toHexDecimal(decimalNumber));
    }
    public  static String toHexDecimal(int decimalNumber){
        String hexDecimalNumber = "";
        if(decimalNumber <= 0){
            return hexDecimalNumber;
        }
        for (; decimalNumber != 0; ) {
            hexDecimalNumber = hexDecimalNumber + HEX.charAt(decimalNumber % 16);
            decimalNumber = decimalNumber / 16;
        }
        return hexDecimalNumber;
    }
}
