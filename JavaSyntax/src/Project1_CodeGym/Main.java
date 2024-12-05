package Project1_CodeGym;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    // Main method to demonstrate the usage
    public static void main(String[] args) {
      NextWordSuggestion suggestedWord = new NextWordSuggestion();
      // Example input text
      String inputText = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. " +
              "The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', " +
              "making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, " +
              "and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, " +
              "sometimes on purpose (injected humour and the like).";
      // Generate the word map from the input text
        Map<String, Map<String, Integer>> wordMap = suggestedWord.generateWordMap(inputText);
        // Get the top 3 suggestions for the word "test"
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word to get suggestions: ");
        String sentenceStarterWord = userInput.nextLine();
        List<String> nextWords = suggestedWord.getNextWords(wordMap, sentenceStarterWord, 5);
        // Check if the word is present in the text then print the suggested words coming after
        if(wordMap.containsKey(sentenceStarterWord)){
            System.out.printf("The possible word(s) coming after \"%s\" is(are): %s.%n", sentenceStarterWord, nextWords);
            System.out.println("Therefore, your sentence should read as follows:");
            // Construct a sentence with the next suggested words
            StringBuilder sentenceBuilder = new StringBuilder();
            sentenceBuilder.append(sentenceStarterWord);
            for(String str : nextWords){
                sentenceBuilder.setLength(0);// Reset the StringBuilder
                sentenceBuilder.append(sentenceStarterWord).append(" ").append(str).append("........");
                System.out.println(sentenceBuilder.toString());
            }
        }else{
            System.out.printf("Sorry, the word \"%s\" does not exist in the text.", sentenceStarterWord);
        }
    }
}
