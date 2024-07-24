package Project1_CodeGym;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public abstract class ProjectDescription {
    // Abstract method to process the input text and populate the word map
    public abstract Map<String, Map<String, Integer>> generateWordMap(String input);
    // Abstract method to get the top n most frequent next words
    public abstract List<String> getNextWords(Map<String, Map<String, Integer>> wordMap, String word, int numOfWords);
}
