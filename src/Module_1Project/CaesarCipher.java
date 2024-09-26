package Module_1Project;

public class CaesarCipher extends Cryptography {
    private final String alphabet;
    Validator validator = new Validator();  // Keep Validator here

    public CaesarCipher(String alphabet) {
        this.alphabet = alphabet;
    }

    public String getAlphabet() {
        return alphabet;
    }

    @Override
    public String encrypt(String text, int shiftKey) {
        // Validate input
        if (!validator.validateInput(text, alphabet)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        StringBuilder encryptStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.toLowerCase().charAt(i);
            encryptStr.append(shiftCharacter(currentChar, shiftKey));
        }
        return encryptStr.toString();
    }

    @Override
    public String decrypt(String text, int shiftKey) {
        // Validate input
        if (!validator.validateInput(text, alphabet)) {
            throw new IllegalArgumentException("Input contains invalid characters.");
        }
        StringBuilder decryptStr = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.toLowerCase().charAt(i);
            decryptStr.append(shiftCharacter(currentChar, -shiftKey));
        }
        return decryptStr.toString();
    }

    // Helper method to shift characters
    private char shiftCharacter(char c, int shift) {
        int currentPos = alphabet.indexOf(c);
        if (currentPos != -1) {
            int newPos = (currentPos + shift) % alphabet.length();
            if (newPos < 0) newPos += alphabet.length();
            return alphabet.charAt(newPos);
        }
        return c;  // Return original character if not found in alphabet
    }
}
