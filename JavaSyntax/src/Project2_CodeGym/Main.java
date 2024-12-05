package Project2_CodeGym;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Main method
    public static void main(String[] args) {
        // Initialize the dictionary map
        Map<String, Integer> wordCountDictionary = new HashMap<>();

        // Try-with-resources block to read the dictionary file
        try (BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String word = parts[0];
                    try {
                        int count = Integer.parseInt(parts[1]);
                        wordCountDictionary.put(word, count);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid count format for word: " + word);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading dictionary file: " + e.getMessage());
            return;
        }

        // Initialize autocorrectimplementation with the loaded dictionary
        autocorrectimplementation autocorrection = new autocorrectimplementation(wordCountDictionary);

        // Read user input and perform correction
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter misspelled word: ");
        String misSpelledWord = userInput.nextLine();

        // Capture start time
        Instant start = Instant.now();

        // Perform correction
        String correction = autocorrection.correct(misSpelledWord);

        // Capture end time
        Instant end = Instant.now();

        // Calculate duration
        long duration = java.time.Duration.between(start, end).toMillis();

        if (wordCountDictionary.containsKey(misSpelledWord)) {
            System.out.printf("Your spelling of \"%s\" was correct.%n", misSpelledWord);
        } else {
            System.out.printf("Did you mean \"%s\" instead of \"%s\"?%n", correction, misSpelledWord);
        }

        // Print the time taken
        System.out.printf("Time taken for correction: %d milliseconds%n", duration);
    }
}
