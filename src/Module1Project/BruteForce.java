package Module1Project;

import java.io.*;
import java.nio.file.*;

public class BruteForce {
    //A reference to the Cipher class is passed to the BruteForce class
    private final Cipher cipher;

    //Constructor
    public BruteForce(Cipher cipher) {
        this.cipher = cipher;
    }
    // Method to perform brute force decryption from input file to output file
    public void bruteForce(String inputFile, String outputFile) throws IOException {
        // Read the encrypted text from the input file
        String encryptedText = new String(Files.readAllBytes(Paths.get(inputFile)));

        // Try all possible shifts
        StringBuilder bruteForceResults = new StringBuilder();
        for (int shiftKey = 1; shiftKey < cipher.getAlphabet().length(); shiftKey++) {
            // Decrypt the text with the current shift key
            String decryptedText = cipher.decryptionLogic(encryptedText, shiftKey);

            // Append the result to the StringBuilder
            bruteForceResults.append("Shift Key ").append(shiftKey).append(": ").append(decryptedText).append("\n");
        }
        // Write the brute force results to the output file
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(bruteForceResults.toString());
        }
    }
}
