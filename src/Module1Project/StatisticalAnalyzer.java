package Module1Project;

import java.util.HashMap;
import java.util.Map;

public class StatisticalAnalyzer {
    // Method to find the most likely shift key
    public int findMostLikelyShift(String encryptedText, char[] alphabet, String representativeText) {
        // Calculate the frequency distribution of the representative text
        Map<Character, Double> representativeFreq = calculateFrequencyDistribution(representativeText.toLowerCase(), alphabet);

        // Variable to store the best shift key and the smallest difference
        int bestShift = 0;
        double smallestDifference = Double.MAX_VALUE;

        // Try all possible shifts (0 to alphabet length - 1)
        for (int shift = 0; shift < alphabet.length; shift++) {
            // Decrypt the text with the current shift
            String decryptedText = decryptWithShift(encryptedText, alphabet, shift);

            // Calculate the frequency distribution of the decrypted text
            Map<Character, Double> decryptedFreq = calculateFrequencyDistribution(decryptedText.toLowerCase(), alphabet);

            // Calculate the difference between the frequency distributions
            double difference = calculateDifference(representativeFreq, decryptedFreq, alphabet);

            // If the difference is smaller than the current smallest difference, update the best shift
            if (difference < smallestDifference) {
                smallestDifference = difference;
                bestShift = shift;
            }
        }
        // Return the most likely shift key
        return bestShift;
    }
    // Helper method to calculate the frequency distribution of a text
    private Map<Character, Double> calculateFrequencyDistribution(String text, char[] alphabet) {
        Map<Character, Double> frequencyMap = new HashMap<>();

        // Initialize frequency map
        for (char c : alphabet) {
            frequencyMap.put(c, 0.0);
        }
        // Count occurrences of each character
        for (char c : text.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
        }
        // Convert counts to frequencies
        int totalChars = text.length();
        for (char c : frequencyMap.keySet()) {
            frequencyMap.put(c, frequencyMap.get(c) / totalChars);
        }
        return frequencyMap;
    }
    // Helper method to decrypt text with a given shift
    private String decryptWithShift(String text, char[] alphabet, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            int pos = new String(alphabet).indexOf(c);
            if (pos != -1) {
                int newPos = (pos - shift) % alphabet.length;
                if (newPos < 0) {
                    newPos += alphabet.length;
                }
                decryptedText.append(alphabet[newPos]);
            } else {
                decryptedText.append(c);  // Non-alphabetic characters are added as-is
            }
        }
        return decryptedText.toString();
    }
    // Helper method to calculate the difference between two frequency distributions
    private double calculateDifference(Map<Character, Double> freq1, Map<Character, Double> freq2, char[] alphabet) {
        double difference = 0.0;

        for (char c : alphabet) {
            difference += Math.abs(freq1.get(c) - freq2.get(c));
        }

        return difference;
    }
}


