package Module_1Project;

public class Validator {
    // Input validation logic to ensure the text contains only valid characters
    public boolean validateInput(String text, String alphabet) {
        String validPunctuation = "`. , ? ! : ; ' \" - — ( ) [ ] { } ... / \\ < > | _ * & @ # $ % ^ ~ ``";
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.indexOf(c) == -1 && !Character.isWhitespace(c) && validPunctuation.indexOf(c) == -1) {
                return false;  // Invalid character found
            }
        }
        return true;  // Valid input
    }

    // Validate the key to ensure it is valid within the alphabet
    public boolean isValidKey(int key, String alphabet) {
        return key >= -alphabet.length() && key <= alphabet.length();
    }
}
