package StringMethods;
/*
Count the number of uppercase letters in a given string ignoring non-alphabetical characters.
 */
import java.util.Scanner;

public class Challenge4_CheckUpperCase {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Text to anlyze: ");
        String text = userInput.nextLine();
        System.out.println("Number of uppercase characters in " +text+ ": " +analyzeChar(text));
    }
    public static int analyzeChar(String str){
        char[] charArrays = str.toCharArray();
        int upperCaseCount = 0;
        for (int i = 0; i < charArrays.length; i++) {
            if(charArrays[i] >= 65 && charArrays[i] <= 90){
                upperCaseCount++;
            }
        }
        return upperCaseCount;
    }
}
