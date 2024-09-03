package Module1Project;

import java.io.File;
import java.io.IOException;

public interface CaesarCipher {
    // Encrypts the content of the input file and writes the encrypted content to an output file
    void encrypt(File inputFile, File outputFile, int key) throws IOException;

    // Decrypts the content of the input file and writes the decrypted content to an output file
    void decrypt(File inputFile, File outputFile, int key) throws IOException;
}


