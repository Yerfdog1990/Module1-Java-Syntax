package Project1_CodeGym;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static Project1_CodeGym.NextWordSuggestion.generateWordMap;
import static Project1_CodeGym.NextWordSuggestion.getNextWords;

public class Main {
    public static void main(String[] args) {
        // Scanner object accept user input
        Scanner userInput = new Scanner(System.in);
        //Prompt user to enter input
        System.out.println("Enter the input text:");
        String input = userInput.nextLine();
        // Build the word map from the input text
        Map<String, Map<String, Integer>> wordMap = generateWordMap(input);
        // Example usage: get next words for the word "to"
        List<String> suggestions = getNextWords(wordMap, "to", 3);
        // Print the suggestions for the word "to"
        System.out.println("Suggestions for 'to': " +suggestions);
    }
}
