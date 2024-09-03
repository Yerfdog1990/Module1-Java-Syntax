package Module1Project;

import java.io.*;

public class Cipher implements CaesarCipher {
    private final String alphabet;

    public Cipher(String alphabet) {
        this.alphabet = alphabet.toLowerCase();
    }
    @Override
    public void encrypt(File inputFile, File outputFile, int key) throws IOException {
        processFile(inputFile, outputFile, key, true);
    }
    @Override
    public void decrypt(File inputFile, File outputFile, int key) throws IOException {
        processFile(inputFile, outputFile, key, false);
    }
    // Helper method to process the file and perform encryption or decryption
    private void processFile(File inputFile, File outputFile, int key, boolean isEncrypt) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = isEncrypt ? encrypt(line, key) : decrypt(line, key);
                writer.write(processedLine);
                writer.newLine();
            }
        }
    }

    // Method to implement encryption logic for a string
    private String encrypt(String text, int shiftKey) {
        // Validate input
        if (!validateInput(text)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        // StringBuilder to store the encrypted text
        StringBuilder encryptStr = new StringBuilder();

        // Traverse each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            encryptStr.append(shiftCharacter(currentChar, shiftKey));
        }
        return encryptStr.toString();
    }
    // Method to implement decryption logic for a string
    private String decrypt(String text, int shiftKey) {
        // Validate input
        if (!validateInput(text)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        // StringBuilder to store the decrypted text
        StringBuilder decryptStr = new StringBuilder();

        // Traverse each character in the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            decryptStr.append(shiftCharacter(currentChar, -shiftKey));
        }
        return decryptStr.toString();
    }
    // Helper method to shift characters based on the shift key
    private char shiftCharacter(char c, int shift) {
        // Find the position of the character in the alphabet
        int pos = alphabet.indexOf(c);

        // If character is found in the alphabet
        if (pos != -1) {
            // Calculate the new position with the shift
            int newPos = (pos + shift) % alphabet.length();

            // Adjust for negative positions
            if (newPos < 0) {
                newPos = alphabet.length() + newPos;
            }
            // Return the shifted character
            return alphabet.charAt(newPos);
        } else {
            // If character is not in the alphabet, return it as is
            return c;
        }
    }
    // Input validation logic to ensure the text contains only valid characters
    private boolean validateInput(String text) {
        // Define a set of accepted punctuation marks
        String validPunctuation = "`. , ? ! : ; ' \" - — ( ) [ ] { } ... / \\ < > | _ * & @ # $ % ^ ~ ``";
        // Check if all characters in the input text are in the alphabet or are spaces/punctuation
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.indexOf(c) == -1 && !Character.isWhitespace(c) && !Character.isLetterOrDigit(c) && validPunctuation.indexOf(c) == -1) {
                return false;  // Invalid character found
            }
        }
        return true;  // All characters are valid
    }
}
