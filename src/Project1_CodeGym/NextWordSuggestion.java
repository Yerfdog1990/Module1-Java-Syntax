package Project1_CodeGym;


import java.util.*;

public class NextWordSuggestion extends ProjectDescription{
    // Method to process the input text and populate the word map
    @Override
    public Map<String, Map<String, Integer>> generateWordMap(String input) {
        // Initialize the main map
        Map<String, Map<String, Integer>> wordMap = new HashMap<>();
        // Remove all punctuation, special characters, and numbers from the input, leaving only letters and spaces.
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        // Splits the normalized input string into an array of words.
        String[] words = input.split("\\s+");
        // Iterate through the words to build the map
        for (int i = 0; i < words.length - 1; i++) {
            String currentWOrd = words[i];
            String nextWord = words[i + 1];
        // If the current word is not already a key in wordMap, add it with a new empty HashMap as its value
            wordMap.putIfAbsent(currentWOrd, new HashMap<>());
        // Retrieve the map of next words and their counts for the current word
            Map<String, Integer> nextWords = wordMap.get(currentWOrd);
        // Increment the count for nextWord in the map of next words.
        // If nextWord is not already in the map, getOrDefault will return 0 and the count will be set to 1.
            nextWords.put(nextWord, nextWords.getOrDefault(nextWord, 0) + 1);
        }
        return wordMap;
    }
    // Method to get the top n most frequent next words
    @Override
    public List<String> getNextWords(Map<String, Map<String, Integer>> wordMap, String word, int numOfWords){
        // Initialize a list to store the suggestions
        List<String> suggestions = new ArrayList<>();
        // If the word is not in the wordMap, return the empty suggestions list
        if(!wordMap.containsKey(word)){
            return suggestions;
        }
        // Get the map of next words and their counts for the given word
        Map<String, Integer> nextWords = wordMap.get(word);
        // Create a list to store the next words
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(nextWords.entrySet());
        // Sort the list based on the counts in descending order
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });
        for (int i = 0; i < entryList.size() && i < numOfWords; i++) {
            suggestions.add(entryList.get(i).getKey());
        }
        return suggestions;
    }
}
