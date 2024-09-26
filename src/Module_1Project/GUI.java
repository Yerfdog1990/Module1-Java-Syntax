package Module_1Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class GUI {
    private final FileManager fileManager;
    private final CaesarCipher cipher;
    private final BruteForce bruteForce;
    private final StatisticAnalyzer statisticalAnalyzer;
    private final Validator validator;

    public GUI(FileManager fileManager, CaesarCipher cipher, BruteForce bruteForce, StatisticAnalyzer statisticalAnalyzer, Validator validator) {
        this.fileManager = fileManager;
        this.cipher = cipher;
        this.bruteForce = bruteForce;
        this.statisticalAnalyzer = statisticalAnalyzer;
        this.validator = validator;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Cipher Crypto Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(4, 1));

        JButton encryptButton = new JButton("Encrypt");
        JButton decryptButton = new JButton("Decrypt");
        JButton bruteForceButton = new JButton("Brute Force");
        JButton statAnalyzerButton = new JButton("Statistical Analyzer");

        Font font = new Font("Arial", Font.BOLD, 20);
        Color glowingColor = new Color(245, 235, 250);

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

        menuPanel.add(encryptButton);
        menuPanel.add(decryptButton);
        menuPanel.add(bruteForceButton);
        menuPanel.add(statAnalyzerButton);

        frame.add(menuPanel, BorderLayout.CENTER);

        JLabel welcomeLabel = new JLabel("Welcome to Cipher Crypto", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(new Color(14, 7, 227));
        frame.add(welcomeLabel, BorderLayout.NORTH);

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

        frame.setVisible(true);
    }

    private void showEncryptDialog() {
        String textToEncrypt = JOptionPane.showInputDialog("Enter text to encrypt:");
        if (textToEncrypt != null) {
            boolean validKey = false;
            int key = -1;

            while (!validKey) {
                try {
                    String keyInput = JOptionPane.showInputDialog("Enter encryption key:");
                    if (keyInput == null) {
                        return;
                    }
                    key = Integer.parseInt(keyInput);

                    if (!validator.isValidKey(key, Arrays.toString("abcdefghijklmnopqrstuvwxyz".toCharArray()))) {
                        JOptionPane.showMessageDialog(null, "Invalid key. Please enter a valid key between 0 and 25.");
                    } else {
                        validKey = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid key. Please enter a number.");
                }
            }

            try {
                // Write encrypted text to file using FileManager (using relative path)
                fileManager.writeFile(textToEncrypt, "encrypted.txt");
                String encryptedText = cipher.encrypt(textToEncrypt, key);
                fileManager.writeFile(encryptedText, "output.txt");
                JOptionPane.showMessageDialog(null, "Encryption successful.\nEncrypted text:\n" + encryptedText);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error during file operations.");
            }
        }
    }

    private void showDecryptDialog() {
        try {
            // Use relative paths for files
            String encryptedText = fileManager.readFile("output.txt");
            String keyInput = JOptionPane.showInputDialog("Enter decryption key:");
            if (keyInput != null) {
                int key = Integer.parseInt(keyInput);
                String decryptedText = cipher.decrypt(encryptedText, key);
                fileManager.writeFile(decryptedText, "decrypted.txt");
                JOptionPane.showMessageDialog(null, "Decryption successful.\nDecrypted text:\n" + decryptedText);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during file operations.");
        }
    }

    private void showBruteForceDialog() {
        try {
            // Use relative paths for files
            String encryptedText = fileManager.readFile("output.txt");
            String bruteForceResults = bruteForce.bruteForce(encryptedText);
            fileManager.writeFile(bruteForceResults, "bruteforce.txt");
            JOptionPane.showMessageDialog(null, "Brute force results:\n" + bruteForceResults);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during brute force operation.");
        }
    }

    private void showStatisticalAnalyzerDialog() {
        try {
            // Use relative paths for files
            String encryptedText = fileManager.readFile("output.txt");
            String representativeText = JOptionPane.showInputDialog("Enter representative text:");
            if (representativeText != null) {
                int mostLikelyShift = statisticalAnalyzer.statisticalAnalysis(encryptedText, representativeText);
                String decryptedText = cipher.decrypt(encryptedText, mostLikelyShift);
                fileManager.writeFile(decryptedText, "stat_analysis.txt");
                JOptionPane.showMessageDialog(null, "Statistical analysis completed.\nDecrypted text:\n" + decryptedText);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error during statistical analysis.");
        }
    }
}
