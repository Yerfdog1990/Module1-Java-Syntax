package Module1Project;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainApp {
    private static final String basePath = "C:\\Users\\Yerdog\\Desktop\\CodeGym\\Module 1 - Java Syntax\\Module 1 project\\";
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
        // Initialize Validator to validate inputs before starting
        Validator validator = new Validator();

        // Use try-with-resources for file management and cipher handling
        try (FileManager fileManager = new FileManager();  // AutoCloseable FileManager
             Cipher cipher = new Cipher("abcdefghijklmnopqrstuvwxyz", fileManager) {
                 @Override
                 public void close() throws Exception {

                 }
             }) {  // Cipher utilizing FileManager

            // Check if inputEncryptFile exists before starting encryption
            if (!validator.isFileExists(inputEncryptFile)) {
                throw new FileNotFoundException("Input file for encryption does not exist: " + inputEncryptFile);
            }

            // Check if inputDecryptFile exists before starting decryption
            if (!validator.isFileExists(inputDecryptFile)) {
                throw new FileNotFoundException("Input file for decryption does not exist: " + inputDecryptFile);
            }

            // Initialize BruteForce and StatisticalAnalyzer
            BruteForce bruteForce = new BruteForce(cipher);
            StatisticalAnalyzer statisticalAnalyzer = new StatisticalAnalyzer();

            // Launch GUI
            GUI gui = new GUI(fileManager, cipher, bruteForce, statisticalAnalyzer, validator,
                    inputEncryptFile, outputEncryptFile, inputDecryptFile, outputDecryptFile,
                    inputBruteForceFile, outputBruteForceFile, inputStatAnalysisFile, outputStatAnalysisFile,
                    sampleFile, keyFile);
        } catch (IOException e) {
            System.err.println("Error during file operations: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
