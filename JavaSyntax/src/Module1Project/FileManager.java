package Module1Project;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager implements AutoCloseable {

    public FileManager() {
        // Constructor left empty since there is no need for additional setup
    }

    // Method to read the contents of a file and return it as a String
    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    // Encrypt method
    public void encrypt(File inputFile, File outputFile, int key, CipherCryptography cipherCryptography) throws IOException {
        // Passes true to the helper method processFile, indicating encryption
        processFile(inputFile, outputFile, key, true, cipherCryptography);
    }

    // Decrypt method
    public void decrypt(File inputFile, File outputFile, int key, CipherCryptography cipherCryptography) throws IOException {
        // Pass false to the helper method processFile, indicating decryption
        processFile(inputFile, outputFile, key, false, cipherCryptography);
    }

    // Helper method to process the file and perform encryption or decryption
    private void processFile(File inputFile, File outputFile, int key, boolean isEncrypt, CipherCryptography cipherCryptography) throws IOException {
        // Read the file content
        String inputContent = readFile(inputFile.getPath());
        // Encrypt or decrypt the content
        String processedContent = isEncrypt ? cipherCryptography.encryptionLogic(inputContent, key) : cipherCryptography.decryptionLogic(inputContent, key);
        // Write the processed content to the output file
        writeFile(processedContent, outputFile.getPath());
    }

    // Method to write the provided content to the specified file
    public void writeFile(String content, String filePath) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }

    @Override
    public void close() throws IOException {
        // No resources to close but can be used for future cleanups
        System.out.println("FileManager resources have been closed.");
    }
}
