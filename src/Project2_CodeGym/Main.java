package Project2_CodeGym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //Main method
    public static void main(String[] args) {
        Map<String, Integer> wordCountDictionary = new HashMap<>();
        wordCountDictionary.put("the", 84382);
        wordCountDictionary.put("it", 6278);
        wordCountDictionary.put("a", 83412);
        wordCountDictionary.put("then", 2045);
        wordCountDictionary.put("thee", 300);
        wordCountDictionary.put("there", 45);
        wordCountDictionary.put("you", 94689);

        autocorrectimplementation autocorrection = new autocorrectimplementation(wordCountDictionary);
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter misspelled word: ");
        String misSpelledWord = userInput.nextLine();
        String correction = autocorrection.correct(misSpelledWord);
        if(wordCountDictionary.containsKey(misSpelledWord)){
            System.out.printf("Your spelling of \"%s\" was correct.", misSpelledWord);
        }else{
            System.out.printf("Did you mean \"%s\" in stead of \"%s\"?", correction, misSpelledWord);
        }
    }
}
