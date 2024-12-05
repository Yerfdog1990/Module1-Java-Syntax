package Module1Project;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Validator {
    private final String alphabet;

    public Validator(String alphabet) {
        this.alphabet = alphabet;
    }

    // Method to validate if the key is valid
    public boolean isValidKey(int key, char[] charArray) {
        return key >= -alphabet.length() && key <= alphabet.length();
    }

    // Method to check if a file exists at the given file path
    public boolean isFileExists(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile();
    }

    // Input validation logic to ensure the text contains only valid characters
    public boolean validateInput(String text) {
        String validPunctuation = "`. , ? ! : ; ' \" - — ( ) [ ] { } ... / \\ < > | _ * & @ # $ % ^ ~ ``";
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.indexOf(c) == -1 && !Character.isWhitespace(c) && validPunctuation.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    // Frequency analysis logic (used in StatisticalAnalyzer)
    public Map<Character, Double> getCharacterFrequency(String text) {
        Map<Character, Double> frequencyMap = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0.0) + 1.0);
        }
        return frequencyMap;
    }
}
