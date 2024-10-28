package Module1Project;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class StatisticalAnalyzer {
    private final CipherCryptography cipherCryptography;
    private final Validator validator;

    public StatisticalAnalyzer(CipherCryptography cipherCryptography, Validator validator) {
        this.cipherCryptography = cipherCryptography;
        this.validator = validator;
    }

    public void statisticalAnalysis(String inputFile, String outputFile, String sampleFile) throws IOException {
        String encryptedText = new String(Files.readAllBytes(Paths.get(inputFile)));
        String representativeText = new String(Files.readAllBytes(Paths.get(sampleFile)));

        if (!validator.validateInput(representativeText)) {
            throw new IllegalArgumentException("Representative text contains invalid characters.");
        }

        Map<Character, Double> representativeFreq = validator.getCharacterFrequency(representativeText);
        int mostLikelyShift = findMostLikelyShift(encryptedText, representativeFreq);

        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("Most likely shift key: " + mostLikelyShift);
        }
    }

    private int findMostLikelyShift(String encryptedText, Map<Character, Double> representativeFreq) {
        int bestShift = 0;
        double bestScore = Double.NEGATIVE_INFINITY;

        for (int shift = 0; shift < 26; shift++) {
            String decryptedText = decryptWithShift(encryptedText, shift);
            Map<Character, Double> decryptedFreq = validator.getCharacterFrequency(decryptedText);

            double score = calculateFrequencyScore(representativeFreq, decryptedFreq);
            if (score > bestScore) {
                bestScore = score;
                bestShift = shift;
            }
        }
        return bestShift;
    }

    private String decryptWithShift(String text, int shift) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            decryptedText.append(cipherCryptography.shiftCharacter(c, -shift));
        }
        return decryptedText.toString();
    }

    private double calculateFrequencyScore(Map<Character, Double> referenceFreq, Map<Character, Double> testFreq) {
        double score = 0.0;
        for (char c : referenceFreq.keySet()) {
            score += referenceFreq.get(c) * testFreq.getOrDefault(c, 0.0);
        }
        return score;
    }
}
