package CollectionClasses;

import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Arrays.asList;

public class WordCounter {
    public static void main(String[] args) {
        // Define the input string to be processed
        String input = "On the other hand, we denounce with righteous indignation and dislike men who are so " +
                "beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, " +
                "that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs " +
                "to those who fail in their duty through weakness of will, which is the same as saying through " +
                "shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. " +
                "In a free hour, when our power of choice is untrammelled and when nothing prevents our being " +
                "able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in " +
                "certain circumstances and owing to the claims of duty or the obligations of business it will " +
                "frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man " +
                "therefore always holds in these matters to this principle of selection: he rejects pleasures to " +
                "secure other greater pleasures, or else he endures pains to avoid worse pains.";

        // Initialize an ArrayList with a list of words by splitting a sentence into words
        ArrayList<String> list = new ArrayList<>(asList(input.split(" ")));
        System.out.println("Number of words: " +list.size());
        // Create a HashMap to store the frequency of each word
        HashMap<String, Integer> wordCounter = new HashMap<>();
        // Iterate over each word in the list
        for (int i = 0; i < list.size(); i++) {
            // Get the word at the current index
            String word = list.get(i);
            // Check if the word is already in the HashMap
            if(wordCounter.containsKey(word)){
                // If the character is already in the HashMap, get its current count
                int value = wordCounter.get(word);
                wordCounter.put(word, value + 1);
            }else{
                // If the word is not in the HashMap, add it with a count of 1
                wordCounter.put(word, 1);
            }
        }
        // Print the frequency of each character
        System.out.println("Word frequency: " +wordCounter);
    }
}
