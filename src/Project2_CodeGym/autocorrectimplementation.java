package Project2_CodeGym;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class autocorrectimplementation implements autocorrect{
    private Map<String, Integer> wordCountDictionary;

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
        Set<String> editDistance1 = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            //add a letter
            for(char c = 'a'; c <= 'z'; c++){
                editDistance1.add(word.substring(0, i) + c + word.substring(i));
            }
            //remove a letter
            if(i < word.length()){
                editDistance1.add(word.substring(0,1) + word.substring(i + 1));
            }
            //substitute a letter
            if(i < word.length()){
                for (char c = 'a'; c <= 'z'; c++) {
                    editDistance1.add(word.substring(0,1) + c + word.substring(i + 1));
                }
            }
        }
        //switch two adjacent letter
        for (int i = 0; i < word.length()-1; i++) {
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
        double totalWords = wordCountDictionary.values().stream().mapToInt(Integer::intValue).sum();
        return wordCountDictionary.getOrDefault(word.toLowerCase(), 0) / totalWords;
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
