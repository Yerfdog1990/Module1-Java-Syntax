package Module1Project;

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
        // Initialize components
        FileManager fileManager = new FileManager();
        Cipher cipher = new Cipher("abcdefghijklmnopqrstuvwxyz", fileManager);
        BruteForce bruteForce = new BruteForce(cipher);
        StatisticalAnalyzer statisticalAnalyzer = new StatisticalAnalyzer();
        Validator validator = new Validator();

        // Launch GUI
        new GUI(fileManager, cipher, bruteForce, statisticalAnalyzer, validator,
                inputEncryptFile, outputEncryptFile, inputDecryptFile, outputDecryptFile,
                inputBruteForceFile, outputBruteForceFile, inputStatAnalysisFile, outputStatAnalysisFile,
                sampleFile, keyFile);
    }
}
