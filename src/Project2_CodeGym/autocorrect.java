package Project2_CodeGym;

import java.util.Set;

public interface autocorrect {
    // Method to check if a word is in the dictionary
    boolean isWordInDictionary(String word);
    // Method to generate possible edits of error distance 1
    Set<String> generateEditsDistance1(String word);
    // Method to generate edits of error distance 2
    Set<String> generateEditsDistance2(String word);
    // Method to get candidate corrections
    Set<String> getCandidates(String word);
    // Method to calculate the probability of a word
    double calculateWordProbability(String word);
    // Method to find the best correction
    String correct(String word);
}
