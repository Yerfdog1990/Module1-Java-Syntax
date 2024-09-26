package Module_1Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager implements AutoCloseable {
    // Define base path for relative file paths (relative to Module 1 project)
    private static final String basePath = "files/";  // Adjust to match your project structure

    // Method to read the contents of a file and return it as a String
    public String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(basePath + fileName)));
    }

    // Method to write the provided content to the specified file
    public void writeFile(String content, String fileName) throws IOException {
        Files.write(Paths.get(basePath + fileName), content.getBytes());
    }

    // Override the close method from AutoCloseable
    @Override
    public void close() throws IOException {
        System.out.println("Resources in FileManager have been closed.");
    }
}
