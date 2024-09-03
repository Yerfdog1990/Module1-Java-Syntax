package Module1Project;

public class BruteForce {
    private final Cipher cipher;

    public BruteForce(Cipher cipher) {
        this.cipher = cipher;
    }
    public String decryptByBruteForce(String encryptedText) {
        String bestGuess = "";
        int maxMatchCount = 0;

        // Iterate over all possible shifts (from 1 to the length of the alphabet)
        for (int i = 1; i < cipher.getAlphabet().length(); i++) {
            String decryptedText = cipher.decrypt(encryptedText, i);
            int matchCount = countMatchingWords(decryptedText);

            // Keep track of the best guess with the highest match count
            if (matchCount > maxMatchCount) {
                maxMatchCount = matchCount;
                bestGuess = decryptedText;
            }
        }
        return bestGuess;
    }
    private int countMatchingWords(String text) {
        // Split the text into words
        String[] words = text.split("\\W+");
        int count = 0;

        // List of common words to match against (for simplicity)
        String[] commonWords = {"the", "and", "of", "to", "in", "a", "that", "is", "with", "for"};

        // Count how many words in the text are common words
        for (String word : words) {
            for (String commonWord : commonWords) {
                if (word.equalsIgnoreCase(commonWord)) {
                    count++;
                }
            }
        }
        return count;
    }
}
