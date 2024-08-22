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
1.Path createFile(Path path): Creates a new file whose path is path
2.Path createDirectory(Path path): Creates a new directory
3.Path createDirectories(Path path): Creates multiple directories
4.Path createTempFile(prefix, suffix): Creates a temporary file
5.Path createTempDirectory(prefix): Creates a temporary directory
6.void delete(Path path): Deletes a file or directory if it is empty
7.Path copy(Path src, Path dest): Copies a file
8.Path move(Path src, Path dest): Moves a file
9.boolean isDirectory(Path path): Checks whether the path is a directory and not a file
10.boolean isRegularFile(Path path): Checks whether the path is a file and not a directory
11.boolean exists(Path path): Checks whether an object exists at the given path
12.long size(Path path): Returns the file size
13.byte[] readAllBytes(Path path): Returns the entire contents of a file as an array of bytes
14.String readString(Path path): Returns the entire contents of a file as a string
15.List<String> readAllLines(Path path): Returns the entire contents of a file as a list of strings
16.Path write(Path path, byte[]): Writes an array of bytes to a file
17.Path writeString(Path path, String str): Writes a string to a file
18.DirectoryStream<Path> newDirectoryStream(Path dir): Returns a collection of files (and subdirectories) from the given directory
 */
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FilesExample {

    public static void main(String[] args) {
        try {
            // 1. createFile(Path path)
            Path filePath = Paths.get("exampleFile.txt");
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("File created: " + filePath);
            }

            // 2. createDirectory(Path path)
            Path directoryPath = Paths.get("exampleDir");
            if (!Files.exists(directoryPath)) {
                Files.createDirectory(directoryPath);
                System.out.println("Directory created: " + directoryPath);
            }

            // 3. createDirectories(Path path)
            Path nestedDirectoryPath = Paths.get("exampleDir/nestedDir/subDir");
            if (!Files.exists(nestedDirectoryPath)) {
                Files.createDirectories(nestedDirectoryPath);
                System.out.println("Nested directories created: " + nestedDirectoryPath);
            }

            // 4. createTempFile(prefix, suffix)
            Path tempFilePath = Files.createTempFile("tempFile", ".txt");
            System.out.println("Temporary file created: " + tempFilePath);

            // 5. createTempDirectory(prefix)
            Path tempDirectoryPath = Files.createTempDirectory("tempDir");
            System.out.println("Temporary directory created: " + tempDirectoryPath);

            // 6. delete(Path path)
            Files.delete(tempFilePath); // Deleting the temp file
            System.out.println("Temporary file deleted: " + tempFilePath);

            // 7. copy(Path src, Path dest)
            Path copiedFilePath = Paths.get("copiedFile.txt");
            Files.copy(filePath, copiedFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied to: " + copiedFilePath);

            // 8. move(Path src, Path dest)
            Path movedFilePath = Paths.get("exampleDir/movedFile.txt");
            Files.move(copiedFilePath, movedFilePath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved to: " + movedFilePath);

            // 9. isDirectory(Path path)
            boolean isDir = Files.isDirectory(directoryPath);
            System.out.println("Is directory: " + isDir);

            // 10. isRegularFile(Path path)
            boolean isFile = Files.isRegularFile(filePath);
            System.out.println("Is regular file: " + isFile);

            // 11. exists(Path path)
            boolean exists = Files.exists(filePath);
            System.out.println("File exists: " + exists);

            // 12. size(Path path)
            long fileSize = Files.size(filePath);
            System.out.println("File size: " + fileSize + " bytes");

            // 13. readAllBytes(Path path)
            byte[] fileBytes = Files.readAllBytes(filePath);
            System.out.println("File content as bytes: " + new String(fileBytes));

            // 14. readString(Path path)
            String fileContent = Files.readString(filePath);
            System.out.println("File content as string: " + fileContent);

            // 15. readAllLines(Path path)
            List<String> fileLines = Files.readAllLines(filePath);
            System.out.println("File content as lines:");
            fileLines.forEach(System.out::println);

            // 16. write(Path path, byte[])
            String newContent = "This is new content!";
            Files.write(filePath, newContent.getBytes(), StandardOpenOption.APPEND);
            System.out.println("New content written to file.");

            // 17. writeString(Path path, String str)
            String additionalContent = "\nThis is additional content!";
            Files.writeString(filePath, additionalContent, StandardOpenOption.APPEND);
            System.out.println("Additional content written to file.");

            // 18. newDirectoryStream(Path dir)
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
                System.out.println("Directory contents:");
                for (Path path : directoryStream) {
                    System.out.println(path.getFileName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
