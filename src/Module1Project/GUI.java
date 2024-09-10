package Module1Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GUI {
    private final FileManager fileManager;
    private final Cipher cipher;
    private final BruteForce bruteForce;
    private final StatisticalAnalyzer statisticalAnalyzer;
    private final Validator validator;
    private final String inputEncryptFile;
    private final String outputEncryptFile;
    private final String inputDecryptFile;
    private final String outputDecryptFile;
    private final String inputBruteForceFile;
    private final String outputBruteForceFile;
    private final String inputStatAnalysisFile;
    private final String outputStatAnalysisFile;
    private final String sampleFile;
    private final String keyFile;

    public GUI(FileManager fileManager, Cipher cipher, BruteForce bruteForce, StatisticalAnalyzer statisticalAnalyzer, Validator validator,
               String inputEncryptFile, String outputEncryptFile, String inputDecryptFile, String outputDecryptFile,
               String inputBruteForceFile, String outputBruteForceFile, String inputStatAnalysisFile, String outputStatAnalysisFile,
               String sampleFile, String keyFile) {
        this.fileManager = fileManager;
        this.cipher = cipher;
        this.bruteForce = bruteForce;
        this.statisticalAnalyzer = statisticalAnalyzer;
        this.validator = validator;
        this.inputEncryptFile = inputEncryptFile;
        this.outputEncryptFile = outputEncryptFile;
        this.inputDecryptFile = inputDecryptFile;
        this.outputDecryptFile = outputDecryptFile;
        this.inputBruteForceFile = inputBruteForceFile;
        this.outputBruteForceFile = outputBruteForceFile;
        this.inputStatAnalysisFile = inputStatAnalysisFile;
        this.outputStatAnalysisFile = outputStatAnalysisFile;
        this.sampleFile = sampleFile;
        this.keyFile = keyFile;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Cipher Crypto Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create a panel for the menu buttons
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1));

        // Create and style buttons
        JButton encryptButton = new JButton("Encrypt");
        JButton decryptButton = new JButton("Decrypt");
        JButton bruteForceButton = new JButton("Brute Force");
        JButton statAnalyzerButton = new JButton("Statistical Analyzer");

        // Apply styles
        Font font = new Font("Arial", Font.BOLD, 20);
        Color glowingColor = new Color(245, 235, 250); // Light lavender or pale lilac for glow effect.

        encryptButton.setFont(font);
        encryptButton.setForeground(glowingColor);
        encryptButton.setBackground(new Color(0, 153, 76)); // Green
        decryptButton.setFont(font);
        decryptButton.setForeground(glowingColor);
        decryptButton.setBackground(new Color(255, 102, 102)); // Red
        bruteForceButton.setFont(font);
        bruteForceButton.setForeground(glowingColor);
        bruteForceButton.setBackground(new Color(255, 153, 51)); // Orange
        statAnalyzerButton.setFont(font);
        statAnalyzerButton.setForeground(glowingColor);
        statAnalyzerButton.setBackground(new Color(102, 178, 255)); // Blue

        // Add buttons to panel
        menuPanel.add(encryptButton);
        menuPanel.add(decryptButton);
        menuPanel.add(bruteForceButton);
        menuPanel.add(statAnalyzerButton);

        // Add panel to frame
        frame.add(menuPanel, BorderLayout.CENTER);

        // Add a welcome message with glowing light effect
        JLabel welcomeLabel = new JLabel("Welcome to Cipher Crypto", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(new Color(14, 7, 227)); // Deep blue or royal blue color for glow effect
        frame.add(welcomeLabel, BorderLayout.NORTH);

        // Button actions
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showEncryptDialog();
            }
        });

        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDecryptDialog();
            }
        });

        bruteForceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBruteForceDialog();
            }
        });

        statAnalyzerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStatisticalAnalyzerDialog();
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    // Method to handle encryption
    private void showEncryptDialog() {
        String textToEncrypt = JOptionPane.showInputDialog("Enter text to encrypt:");
        if (textToEncrypt != null) {
            boolean validKey = false;
            int key = -1;

            // Loop to repeatedly prompt for a valid key
            while (!validKey) {
                try {
                    String keyInput = JOptionPane.showInputDialog("Enter encryption key:");
                    if (keyInput == null) {
                        return; // User cancelled the key input dialog
                    }
                    key = Integer.parseInt(keyInput);

                    // Validate the key using Validator
                    if (!validator.isValidKey(key, "abcdefghijklmnopqrstuvwxyz".toCharArray())) {
                        JOptionPane.showMessageDialog(null, "Invalid key. Please enter a valid key between 0 and 25.");
                    } else {
                        validKey = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid key. Please enter a number.");
                }
            }

            try {
                fileManager.writeFile(textToEncrypt, inputEncryptFile);
                cipher.encrypt(new File(inputEncryptFile), new File(outputEncryptFile), key);
                fileManager.writeFile(fileManager.readFile(outputEncryptFile), inputDecryptFile);
                fileManager.writeFile(fileManager.readFile(outputEncryptFile), inputBruteForceFile);
                fileManager.writeFile(fileManager.readFile(outputEncryptFile), inputStatAnalysisFile);
                fileManager.writeFile(String.valueOf(key), keyFile);
                JOptionPane.showMessageDialog(null, "Encryption successful.\nEncrypted text:\n" + fileManager.readFile(outputEncryptFile));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error during file operations.");
            }
        }
    }

    // Method to handle decryption
    private void showDecryptDialog() {
        try {
            int key = Integer.parseInt(fileManager.readFile(keyFile).trim());
            // Validate the key using Validator
            if (!validator.isValidKey(key, "abcdefghijklmnopqrstuvwxyz".toCharArray())) {
                JOptionPane.showMessageDialog(null, "Invalid key in key file. The key should be valid.");
                return;
            }
            cipher.decrypt(new File(outputEncryptFile), new File(outputDecryptFile), key);
            JOptionPane.showMessageDialog(null, "Decryption successful.\nDecrypted text:\n" + fileManager.readFile(outputDecryptFile));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid key in key file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during file operations.");
        }
    }

    // Method to handle brute force attack
    private void showBruteForceDialog() {
        try {
            bruteForce.bruteForce(inputBruteForceFile, outputBruteForceFile);
            JOptionPane.showMessageDialog(null, "Brute force attack completed.\nResults:\n" + fileManager.readFile(outputBruteForceFile));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during brute force operation.");
        }
    }

    // Method to handle statistical analysis
    private void showStatisticalAnalyzerDialog() {
        try {
            statisticalAnalyzer.statisticalAnalysis(inputStatAnalysisFile, outputStatAnalysisFile, sampleFile);
            JOptionPane.showMessageDialog(null, "Statistical analysis completed.\nResults:\n" + fileManager.readFile(outputStatAnalysisFile));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during statistical analysis.");
        }
    }
}
