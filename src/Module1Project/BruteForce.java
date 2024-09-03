package Module1Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BruteForce {
    private final Cipher cipher;

    public BruteForce(Cipher cipher) {
        this.cipher = cipher;
    }
    // Method to perform brute force decryption from input file to output file
    public void bruteForce(String inputFile, String outputFile, String optionalSampleFile) throws IOException {
        // Read the encrypted text from the input file
        String encryptedText = new String(Files.readAllBytes(Paths.get(inputFile)));

        // Optional: Use representative text for statistical analysis
        String representativeText = null;
        if (optionalSampleFile != null) {
            representativeText = new String(Files.readAllBytes(Paths.get(optionalSampleFile)));
        }

        // Try all possible shifts
        StringBuilder bruteForceResults = new StringBuilder();
        for (int shiftKey = 1; shiftKey < cipher.getAlphabet().length(); shiftKey++) {
            // Decrypt the text with the current shift key
            String decryptedText = cipher.decrypt(encryptedText, shiftKey);

            // Append the result to the StringBuilder
            bruteForceResults.append("Shift Key ").append(shiftKey).append(": ")
                    .append(decryptedText).append("\n");
        }
        // Write the brute force results to the output file
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(bruteForceResults.toString());
        }
    }
}
