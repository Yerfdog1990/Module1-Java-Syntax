package StringMethods;

import java.util.Scanner;

/*
Check if a string is a palindrome.
 */
public class Challenge2_CheckPalindrome {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.print("First original string: ");
        String str1 = userInput1.nextLine();
        System.out.print("Second original string: ");
        String str2 = userInput1.nextLine();

        System.out.println(str1.toUpperCase() + " is a palindrome: " +isPalindrome(str1));
        System.out.println(str2.toUpperCase() + " is a palindrome: " +isPalindrome(str2));
    }
    public static boolean isPalindrome(String originalString){
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(originalString);
        reversedString = reversedString.reverse();
        return originalString.equals(reversedString.toString());
    }
}
