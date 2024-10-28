package Module1Project;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BruteForce {
    private final CipherCryptography cipherCryptography;

    // Constructor to initialize with a CipherCryptology instance
    public BruteForce(CipherCryptography cipherCryptography) {
        this.cipherCryptography = cipherCryptography;
    }

    // Brute force decryption method
    public void bruteForce(String inputFile, String outputFile) throws IOException {
        // Read the encrypted text from the input file
        String encryptedText = new String(Files.readAllBytes(Paths.get(inputFile)));

        // Try all possible shifts
        StringBuilder bruteForceResults = new StringBuilder();
        for (int shiftKey = 1; shiftKey < cipherCryptography.getAlphabet().length(); shiftKey++) {
            String decryptedText = cipherCryptography.decryptionLogic(encryptedText, shiftKey);
            bruteForceResults.append("Shift Key ").append(shiftKey).append(": ").append(decryptedText).append("\n");
        }

        // Write the brute force results to the output file
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(bruteForceResults.toString());
        }
    }
}
