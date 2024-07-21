package Project1_CodeGym;
/*
Project Description: Next Word Suggestion
Functional Specification
Objective: Recreate a simplified version of Google’s GBoard prediction system that predicts the next three most likely words after typing a word.

Features
Next Word Prediction: After typing a word, the system will predict the next three most likely words based on the previously input text.
Learning from Input: The system will track the frequency of words following each word to improve prediction accuracy over time.
Example
For instance, if the input text is "to", the system should suggest "your", "recreate", and "predict" as the next words based on their frequency in the provided example text.

Technical Details
1.Data Structure:
Map: A Map<String, Map<String, Integer>> is used where the outer map key is a word, and the value is another map. This inner map has keys as words that follow the outer key word, and values are the frequency of these following words.
2.Algorithm:
Adding Words:
    -For a given word and the word that follows it (nextWord), update the map.
    -If the word is not in the map, add it with a new inner map containing nextWord with a count of 1.
    -If the word is already in the map, update its inner map:
        *If nextWord is not in the inner map, add it with a count of 1.
        *If nextWord is in the inner map, increment its count by 1.
Prediction:
    -For a given word, retrieve its inner map.
    -Sort the inner map by frequency and extract the top three words.
3.Edge Cases
    -Special Characters: Remove commas, full stops, quotes, and other special characters.
    -Language Characters: Handle special characters from different languages.
    -Numbers: Manage numerical inputs appropriately.
    -General: Handle empty inputs and inputs with very few words.
 */

import java.util.*;

public class NextWordSuggestion {
    // Method to process the input text and populate the word map
    public static Map<String, Map<String, Integer>> generateWordMap(String input){
        // Initialize the main map
        Map<String, Map<String, Integer>> wordMap = new HashMap<>();
        // Remove all punctuation, special characters, and numbers from the input, leaving only letters and spaces.
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        //Splits the normalized input string into an array of words.
        String[] word = input.split("\\s+");
        // Iterate through the words to build the map
        for (int i = 0; i < word.length - 1; i++) {
            String currentWord = word[i];
            String nextWord = word[i + 1];
            // If the current word is not already a key in wordMap, add it with a new empty HashMap as its value
            wordMap.putIfAbsent(currentWord, new HashMap<>());
            // Retrieve the map of next words and their counts for the current word
            Map<String, Integer> nextWords = wordMap.get(currentWord);
            // Increment the count for nextWord in the map of next words.
            // If nextWord is not already in the map, getOrDefault will return 0 and the count will be set to 1.
            nextWords.put(nextWord, nextWords.getOrDefault(nextWord, 0) + 1);
        }
        return wordMap;
    }
    // Method to get the top n most frequent next words
    public static List<String> getNextWords(Map<String, Map<String, Integer>> wordMap, String word, int numOfWords){
        // Initialize a list to store the suggestions
        List<String> suggestions = new ArrayList<>();
        // If the word is not in the wordMap, return the empty suggestions list
        if(!wordMap.containsKey(word)){
            return suggestions;
        }
        // Get the map of next words and their counts for the given word
        Map<String, Integer> nextWords = wordMap.get(word);
        // Create a priority queue (max-heap) to get the top n most frequent words
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                // Comparator to sort the entries by their counts in descending order
                (a,b) -> b.getValue().compareTo(a.getValue())
        );
        // Add all the entries from nextWords to the priority queue
        priorityQueue.addAll(nextWords.entrySet());
        // Get the top n words from the priority queue
        for (int i = 0; i < numOfWords && !priorityQueue.isEmpty(); i++) {
            // Add the word with the highest count to the suggestions list
            suggestions.add(priorityQueue.poll().getKey());
        }
        // Return the list of top n suggestions
        return suggestions;
    }

    public static void main(String[] args) {
        // Scanner object accept user input
        Scanner userInput = new Scanner(System.in);
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
