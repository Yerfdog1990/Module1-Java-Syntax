package Module1Project;

import java.io.*;

public interface ICipher {
    // Encrypts the content of the input file and writes the encrypted content to an output file
    void encrypt(File inputFile, File outputFile, int key) throws IOException;

    // Decrypts the content of the input file and writes the decrypted content to an output file
    void decrypt(File inputFile, File outputFile, int key) throws IOException;
}


