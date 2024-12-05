package WrapperClasses;
/*
Challenge 01
Write a code to analyze text by showing the number of:
1.SPaces
2.Letters
3.Digits
4.Lowercases
5.Uppercases
 */
import java.util.Scanner;

public class Challenge01_AnalyzingString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Prompt user to enter the text
        System.out.println("Enter text to analyze:");
        String text = userInput.nextLine();

        //Print the text analysis result
        System.out.println("The number of digits = " +countDigits(text));
        System.out.println("The number of letters = " +countLetters(text));
        System.out.println("The number of spaces = " +countSpaces(text));
        System.out.println("The number of uppercases = " +countUpperCases(text));
        System.out.println("The number of lowercases = " +countLowerCases(text));
    }
    //Method to count the number of digits in the string
    public static int countDigits(String string){
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i))){
                countDigits++;
            }
        }
       return countDigits;
    }
    //Method to count the number of letters in the string
    public static int countLetters(String string){
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                countLetters++;
            }
        }
        return countLetters;
    }
    //Method to count the number of spaces in the string
    public static int countSpaces(String string){
        int countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpaceChar(string.charAt(i))){
                countSpaces++;
            }
        }
        return countSpaces;
    }
    //Method to count the number of lowercase characters in the string
    public static int countLowerCases(String string){
        int countLowerCases = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLowerCase(string.charAt(i))){
                countLowerCases++;
            }
        }
        return countLowerCases;
    }
    //Method to count the number of uppercase characters in the string
    public static int countUpperCases(String string){
        int countUpperCases = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isUpperCase(string.charAt(i))){
                countUpperCases++;
            }
        }
        return countUpperCases;
    }
}
