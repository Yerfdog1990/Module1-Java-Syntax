package Module1Project;

class CipherCryptography implements Cryptography {
    private final String alphabet;

    public CipherCryptography(String alphabet) {
        this.alphabet = alphabet.toLowerCase();
    }

    public String getAlphabet() {
        return alphabet;
    }

    @Override
    public String encryptionLogic(String text, int shiftKey) {
        StringBuilder encryptStr = new StringBuilder();
        for (char currentChar : text.toLowerCase().toCharArray()) {
            encryptStr.append(shiftCharacter(currentChar, shiftKey));
        }
        return encryptStr.toString();
    }

    @Override
    public String decryptionLogic(String text, int shiftKey) {
        StringBuilder decryptStr = new StringBuilder();
        for (char currentChar : text.toLowerCase().toCharArray()) {
            decryptStr.append(shiftCharacter(currentChar, -shiftKey));
        }
        return decryptStr.toString();
    }

    // Helper method to shift characters
    public char shiftCharacter(char c, int shift) {
        int currentPos = alphabet.indexOf(c);
        if (currentPos != -1) {
            int newPos = (currentPos + shift) % alphabet.length();
            if (newPos < 0) {
                newPos += alphabet.length();
            }
            return alphabet.charAt(newPos);
        } else {
            return c; // Return non-alphabet characters as is
        }
    }
}
