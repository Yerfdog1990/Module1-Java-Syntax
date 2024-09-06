package Module1Project;

import java.io.*;
//Class to implement the CaesarCipher interface
public class Cipher implements CaesarCipher {
    //Declare alphabet and fileManager attributes
    private final String alphabet;
    private final FileManager fileManager;

    // Constructor to initialize the alphabet and FileManager
    public Cipher(String alphabet, FileManager fileManager) {
        this.alphabet = alphabet.toLowerCase();
        this.fileManager = fileManager;
    }
    //Getter method to return the alphabet being used by the Cipher class.
    public String getAlphabet() {
        return alphabet;
    }
    //Encrypt method
    @Override
    public void encrypt(File inputFile, File outputFile, int key) throws IOException {
        //Passes true to the helper method processFile, indicating encryption
        processFile(inputFile, outputFile, key, true);
    }
    //Decrypt method
    @Override
    public void decrypt(File inputFile, File outputFile, int key) throws IOException {
        //Pass false to the helper method processFile, indicating decryption instead of encryption
        processFile(inputFile, outputFile, key, false);
    }
    // Helper method to process the file and perform encryption or decryption
    private void processFile(File inputFile, File outputFile, int key, boolean isEncrypt) throws IOException {
        // Read the file content using FileManager
        String inputContent = fileManager.readFile(inputFile.getPath());
        // Use ternary operator to perform either encryption or decryption logic on the content
        String processedContent = isEncrypt ? encryptionLogic(inputContent, key) : decryptionLogic(inputContent, key);
        // Write the processed content to the output file using FileManager
        fileManager.writeFile(processedContent, outputFile.getPath());
    }
    // Method to implement encryption logic for a string
    private String encryptionLogic(String text, int shiftKey) {
        //Validate input
        if (!validateInput(text)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        //Initialize StringBuilder
        StringBuilder encryptStr = new StringBuilder();
        //Iterate over the string
        for (int i = 0; i < text.length(); i++) {
            //Convert the current character to lowercase (to ensure case-insensitivity) and fetches it from the string.
            char currentChar = text.toLowerCase().charAt(i);
            //Shift the current character forward by the value of shiftKey then append to encryptStr.
            encryptStr.append(shiftCharacter(currentChar, shiftKey));
        }
        //Return the encrypted string
        return encryptStr.toString();
    }
    // Method to implement decryption logic for a string
    String decryptionLogic(String text, int shiftKey) {
        //Validate the input
        if (!validateInput(text)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        //Initialize a StringBuilder
        StringBuilder decryptStr = new StringBuilder();
        //Iterate Over the String
        for (int i = 0; i < text.length(); i++) {
            //Convert the current character to lowercase (to ensure case-insensitivity) and fetches it from the string.
            char currentChar = text.toLowerCase().charAt(i);
            //Shift the current character backward by the value of shiftKey then append to decryptStr.
            decryptStr.append(shiftCharacter(currentChar, -shiftKey));
        }
        //Return the decrypted string
        return decryptStr.toString();
    }
    // Helper method to shift characters based on the shift key
    private char shiftCharacter(char c, int shift) {
        // Define the current position of the character in the alphabet string
        int currentPos = alphabet.indexOf(c);
        // If the character is found in the alphabet (i.e., it's a letter)
        if (currentPos != -1) {
            // Calculate the new position by shifting the current position by the key
            // The modulus operator ensures that it wraps around if it exceeds the alphabet length
            int newPos = (currentPos + shift) % alphabet.length();
            // In case the new position is negative (only happens if key is negative), adjust the position
            if (newPos < 0) {
                newPos += alphabet.length();
            }
            // Return the character from the new position in the alphabet
            return alphabet.charAt(newPos);
        } else {
            // If the character is not in the alphabet (like numbers or symbols), return the original character
            return c;
        }
    }
    // Input validation logic to ensure the text contains only valid characters
    private boolean validateInput(String text) {
        // Define a list of valid punctuation characters
        String validPunctuation = "`. , ? ! : ; ' \" - — ( ) [ ] { } ... / \\ < > | _ * & @ # $ % ^ ~ ``";
        // Iterate over each character in the input string (converted to lowercase)
        for (char c : text.toLowerCase().toCharArray()) {
            // Check if the character is NOT valid by these conditions:
            // 1. Not found in the alphabet string
            // 2. Not a whitespace character
            // 3. Not a letter or digit
            // 4. Not found in the valid punctuation string
            if (alphabet.indexOf(c) == -1 && !Character.isWhitespace(c) && !Character.isLetterOrDigit(c) && validPunctuation.indexOf(c) == -1) {
                return false;// If any invalid character is found, return false
            }
        }
        return true;// If all characters are valid, return true
    }
}
