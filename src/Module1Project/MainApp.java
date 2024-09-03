package Module1Project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Example usage of the Cipher class
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Cipher cipher = new Cipher(alphabet);

        BruteForce bruteForce = new BruteForce(cipher);

        try (Scanner userInput = new Scanner(System.in)){
            System.out.print("Enter text to encrypt: ");
            String plaintext = userInput.nextLine();
            System.out.print("Enter key: ");
            int key = userInput.nextInt();
            String encryptedText = cipher.encrypt(plaintext, key);
            System.out.println("Encrypted Text: " + encryptedText);

            String decryptedText = bruteForce.decryptByBruteForce(encryptedText);
            System.out.println("Decrypted Text (Brute Force): " + decryptedText);

        }
    }
}


