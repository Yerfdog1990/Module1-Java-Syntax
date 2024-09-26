package Module_1Project;

public class BruteForce {
    // A reference to the Cipher class is passed to the BruteForce class
    private final CaesarCipher cipher;

    // Constructor
    public BruteForce(CaesarCipher cipher) {
        this.cipher = cipher;
    }

    // Method to perform brute force decryption on encrypted text
    public String bruteForce(String encryptedText) {
        // Try all possible shifts and collect the results
        StringBuilder bruteForceResults = new StringBuilder();
        for (int shiftKey = 1; shiftKey < cipher.getAlphabet().length(); shiftKey++) {
            // Decrypt the text with the current shift key
            String decryptedText = cipher.decrypt(encryptedText, shiftKey);

            // Append the result to the StringBuilder
            bruteForceResults.append("Shift Key ").append(shiftKey).append(": ").append(decryptedText).append("\n");
        }
        // Return the brute force results as a string
        return bruteForceResults.toString();
    }
}

