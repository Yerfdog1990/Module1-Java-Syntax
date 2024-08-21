package JavaNIO;
/*
Files Class in Java NIO
The Files class in Java NIO is a utility class that provides several methods for file and directory operations.
It simplifies common file operations such as checking if a file exists, reading from and writing to files, copying files, deleting files, and much more.
This class is often used in combination with the Path class.

Key Features of the Files Class:
    1.File and Directory Operations: Provides methods for creating, copying, moving, and deleting files and directories.
    2.File Attributes: Allows you to retrieve and set file attributes like size, creation time, and permissions.
    3.Stream Support: Supports reading and writing files using streams, making it easier to work with large files.
    4.Symbolic Links: Supports creating and working with symbolic links.
    5.File Existence and Accessibility: Includes methods to check if a file exists, if it is readable, writable, or executable.
    6.Directory Stream: Allows listing directory contents with the ability to filter results.

Common Methods of the Files Class:
    1.exists(Path path): Checks if the file or directory at the given path exists.
    2.createFile(Path path): Creates a new file at the specified path.
    3.createDirectory(Path path): Creates a new directory at the specified path.
    4.copy(Path source, Path target, CopyOption... options): Copies a file from the source path to the target path.
    5.delete(Path path): Deletes the file or directory at the specified path.
    6.size(Path path): Returns the size of the file in bytes.
    7.readAllBytes(Path path): Reads the entire content of a file into a byte array.
    8.write(Path path, byte[] bytes, OpenOption... options): Writes the bytes to a file at the specified path.
    9.isReadable(Path path): Checks if the file is readable.
    10.isWritable(Path path): Checks if the file is writable.
    11.isExecutable(Path path): Checks if the file is executable.
    12.list(Path dir): Returns a stream of paths representing the entries in the directory.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {
        Path path = Paths.get("files/file.txt");

        try {
            // Check if the path exists
            boolean pathExists = Files.exists(path);
            System.out.println("Path exists: " + pathExists);

            if (!pathExists) {
                // Create a new file
                Files.createFile(path);
                System.out.println("File created: " + path);
            }

            // Write some content to the file
            String content = "Hello, Java NIO!";
            Files.write(path, content.getBytes());
            System.out.println("File written: " + content);

            // Read the content of the file
            List<String> lines = Files.readAllLines(path);
            System.out.println("File content:");
            for (String line : lines) {
                System.out.println(line);
            }

            // Get the size of the file
            long fileSize = Files.size(path);
            System.out.println("File size: " + fileSize + " bytes");

            // Copy the file to a new location
            Path copyPath = Paths.get("files/file_copy.txt");
            Files.copy(path, copyPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to: " + copyPath);

            // Delete the copied file
            Files.delete(copyPath);
            System.out.println("Copied file deleted: " + copyPath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

