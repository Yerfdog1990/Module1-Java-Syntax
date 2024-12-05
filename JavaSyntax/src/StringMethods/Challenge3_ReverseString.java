package StringMethods;

import java.util.Scanner;

/*
Reverse the words in a given string.
 */
public class Challenge3_ReverseString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = userInput.nextLine();
        System.out.println(reverseWords(sentence));

    }
    public static String reverseWords(String originalString){
        String[] str = originalString.trim().split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length- 1; i > 0; i--) {
            reversedString.append(str[i]).append(" ");
        }
        reversedString.append(str[0]);
        return reversedString.toString();
    }
}
