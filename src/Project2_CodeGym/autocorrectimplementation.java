package Project2_CodeGym;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class autocorrectimplementation implements autocorrect{
    private Map<String, Integer> wordCountDictionary;

    //Constructor
    public autocorrectimplementation(Map<String, Integer> wordCountDictionary) {
        this.wordCountDictionary = wordCountDictionary;
    }
    // Method to check if a word is in the dictionary
    @Override
    public boolean isWordInDictionary(String word) {
        return wordCountDictionary.containsKey(word.toLowerCase());
    }
    // Method to generate possible edits of error distance 1
    @Override
    public Set<String> generateEditsDistance1(String word) {
        //Set to store all possible words that are one edit away from the input word by performing the following operations: adding a letter, removing a letter, and substituting a letter.
        Set<String> editDistance1 = new HashSet<>();
        //Loop to iterate over each position in the input word.
        for (int i = 0; i < word.length()-1; i++) {
            //Loop to iterate over every letter in the alphabet, from 'a' to 'z'.
            for(char c = 'a'; c <= 'z'; c++){
                //add a letter - constructs a new word by adding the character c at position i in the original word.
                //E.g: For the word "cat", at position 1, adding 'a' would result in "caat", adding 'b' would give "cabat", and so on.
                editDistance1.add(word.substring(0, i) + c + word.substring(i));
            }
            //remove a letter-condition checks if the current index i is within the length of the word.
            if(i < word.length()){
                /*For word = "cat" and i = 1:
                        -word.substring(0, 1) gives "c".
                        -word.substring(2) gives "t".
                        -The resulting word is "ct", which is the word "cat" with the letter 'a' removed.*/
                editDistance1.add(word.substring(0,1) + word.substring(i + 1));
            }
            //substitute a letter-condition checks if the current index i is within the length of the word.
            if(i < word.length()){
                //Loop to iterate through each letter of the alphabet, from 'a' to 'z'.
                for (char c = 'a'; c <= 'z'; c++) {
                    /*For word = "cat" and i = 1:
                        -If c = 'b', the new word is "cbt".
                        -If c = 'd', the new word is "cdt".*/
                    editDistance1.add(word.substring(0,1) + c + word.substring(i + 1));
                }
            }
        }
        //switch two adjacent letter
        for (int i = 0; i < word.length()-1; i++) {
            /*For word = "cat" and i = 1:
                    -word.substring(0, 1) gives "c".
                    -word.charAt(2) gives "t".
                    -word.charAt(1) gives "a".
                    -word.substring(3) gives "" (empty string since there are no characters after i + 2).
                    -The resulting word is "cta", where the letters 'a' and 't' have been swapped.*/
            editDistance1.add(word.substring(0,i) + word.charAt(i+1) + word.charAt(i) + word.substring(i+2));
        }
        return editDistance1;
    }
    // Method to generate edits of error distance 2
    @Override
    public Set<String> generateEditsDistance2(String word) {
        Set<String> editDistance2 = new HashSet<>();
        for(String str : generateEditsDistance1(word)){
            editDistance2.addAll(generateEditsDistance1(str));
        }
        return editDistance2;
    }
    // Method to get candidate corrections
    @Override
    public Set<String> getCandidates(String word) {
        Set<String> candidates = new HashSet<>();
        if(isWordInDictionary(word)){
            candidates.add(word);
        }
        for(String str : generateEditsDistance1(word)){
            if(isWordInDictionary(str)){
                candidates.add(str);
            }
        }
        for(String str : generateEditsDistance2(word)){
            if(isWordInDictionary(str)){
                candidates.add(str);
            }
        }
        return candidates;
    }
    // Method to calculate the probability of a word
    @Override
    public double calculateWordProbability(String word) {
        double totalWords = 0.0;
        // Calculate the total number of words in the dictionary
        for (int count : wordCountDictionary.values()) {
            totalWords += count;
        }
        // Get the count of the specific word, or 0 if it doesn't exist
        int wordCount = wordCountDictionary.getOrDefault(word.toLowerCase(), 0);
        // Return the probability of the word
        return wordCount / totalWords;
    }
    // Method to find the best correction
    @Override
    public String correct(String word) {
        Set<String> candidates = getCandidates(word);
        String bestCandidate = word;
        double bestprobability = 0.0;
        for(String str : candidates){
            double probability = calculateWordProbability(str);
            if(probability > bestprobability){
                bestprobability = probability;
                bestCandidate = str;
            }
        }
        return bestCandidate;
    }
}
