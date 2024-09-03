package Module1Project;

import java.io.*;

public class Validator {

    // Method to validate if the key is valid
    public boolean isValidKey(int key, char[] alphabet) {
        // A valid key should be between 0 and the length of the alphabet (inclusive of negative shifts)
        return key >= -alphabet.length && key <= alphabet.length;
    }

    // Method to check if a file exists at the given file path
    public boolean isFileExists(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile();
    }
}


