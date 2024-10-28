package Module1Project;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainApp {
    // Define the base path using an absolute path
    private static final String basePath = "C:\\Users\\Yerdog\\IdeaProjects\\JavaSyntax\\Module 1 project\\files\\";

    // Update file paths using absolute paths
    private static final String inputEncryptFile = basePath + "inputEncrypt.txt";
    private static final String outputEncryptFile = basePath + "outputEncrypt.txt";
    private static final String inputDecryptFile = basePath + "inputDecrypt.txt";
    private static final String outputDecryptFile = basePath + "outputDecrypt.txt";
    private static final String inputBruteForceFile = basePath + "inputBruteForce.txt";
    private static final String outputBruteForceFile = basePath + "outputBruteForce.txt";
    private static final String inputStatAnalysisFile = basePath + "inputStatAnalysis.txt";
    private static final String outputStatAnalysisFile = basePath + "outputStatAnalysis.txt";
    private static final String sampleFile = basePath + "sample.txt";
    private static final String keyFile = basePath + "encryptionKey.txt";

    public static void main(String[] args) {
        Validator validator = new Validator("abcdefghijklmnopqrstuvwxyz");

        try (FileManager fileManager = new FileManager()) {
            CipherCryptography cipherCryptography = new CipherCryptography("abcdefghijklmnopqrstuvwxyz");

            // Validation for file existence using absolute paths
            if (!validator.isFileExists(inputEncryptFile)) {
                throw new FileNotFoundException("Input file for encryption does not exist: " + inputEncryptFile);
            }
            if (!validator.isFileExists(inputDecryptFile)) {
                throw new FileNotFoundException("Input file for decryption does not exist: " + inputDecryptFile);
            }

            BruteForce bruteForce = new BruteForce(cipherCryptography);
            StatisticalAnalyzer statisticalAnalyzer = new StatisticalAnalyzer(cipherCryptography, validator);

            // Ensure the GUI input/output file paths are correct
            new GUI(fileManager, cipherCryptography, bruteForce, statisticalAnalyzer, validator,
                    inputEncryptFile,
                    outputEncryptFile,
                    inputDecryptFile,
                    outputDecryptFile,
                    inputBruteForceFile,
                    outputBruteForceFile,
                    inputStatAnalysisFile,
                    outputStatAnalysisFile,
                    sampleFile,
                    keyFile);

        } catch (IOException e) {
            System.err.println("Error during file operations: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
