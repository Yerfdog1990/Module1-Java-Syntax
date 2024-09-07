package Module1Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager implements AutoCloseable {
    // Method to read the contents of a file and return it as a String
    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
    // Method to write the provided content to the specified file
    public void writeFile(String content, String filePath) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
        // Override the close method from AutoCloseable
    @Override
    public void close() throws IOException {
        // Clean up resources if needed
        System.out.println("Resources in FileManager have been closed.");
    }
}
