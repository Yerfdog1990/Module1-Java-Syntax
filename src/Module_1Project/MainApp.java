package Module_1Project;

public class MainApp {
    public static void main(String[] args) {
        // Create instances of necessary components
        FileManager fileManager = new FileManager();  // FileManager added to handle file operations
        CaesarCipher cipher = new CaesarCipher("abcdefghijklmnopqrstuvwxyz");
        BruteForce bruteForce = new BruteForce(cipher);
        StatisticAnalyzer statisticalAnalyzer = new StatisticAnalyzer();
        Validator validator = new Validator();

        // Initialize and display the GUI with FileManager
        GUI gui = new GUI(fileManager, cipher, bruteForce, statisticalAnalyzer, validator);

        // The GUI will now handle file operations via FileManager
    }
}
