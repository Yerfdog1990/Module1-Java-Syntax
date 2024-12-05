package JavaNIO;
/*
FileSystem Class in Java NIO
The FileSystem class in Java NIO provides an interface to interact with the underlying file system.
It acts as a factory for creating various objects used in file system operations, such as Path, PathMatcher, and Files.
The FileSystem class allows for the abstraction of file systems, meaning you can work with different types of file systems (local, remote, etc.) in a consistent way.

Key Features of FileSystem:
    1.Abstraction of File Systems: Provides a unified interface to interact with different file systems (e.g., local file system, ZIP file system).
    2.Creating Objects: Acts as a factory for creating objects like Path, PathMatcher, and others that are used in file system operations.
    3.Root Directories: Allows access to the root directories of the file system.
    4.File Stores: Provides information about the underlying file stores.
    5.Supported File Attributes: Lists the file attributes that are supported by the file system.
    6.Open/Close File Systems: Supports operations to open and close file systems.

Common Methods of FileSystem:
    1.getRootDirectories(): Returns an iterable that contains the root directories of the file system.
    2.getFileStores(): Returns an iterable that contains the file stores of the file system.
    3.getPath(String first, String... more): Converts a path string or a sequence of strings into a Path object.
    4.getSeparator(): Returns the name separator used by the file system (e.g., "/" on UNIX systems).
    5.isOpen(): Checks if the file system is open.
    6.isReadOnly(): Checks if the file system is read-only.
    7.supportedFileAttributeViews(): Returns a set of the file attribute views supported by the file system.
 */
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.Set;

public class FileSystemExample {
    public static void main(String[] args) {
        try {
            // Get the default file system
            FileSystem fileSystem = FileSystems.getDefault();

            // Print the separator used by the file system
            System.out.println("File separator: " + fileSystem.getSeparator());

            // List the root directories
            System.out.println("Root directories:");
            for (Path rootDir : fileSystem.getRootDirectories()) {
                System.out.println(rootDir);
            }

            // List the file stores (e.g., partitions, drives)
            System.out.println("\nFile stores:");
            for (FileStore store : fileSystem.getFileStores()) {
                System.out.println(store);
            }

            // Check if the file system is open
            System.out.println("\nIs file system open? " + fileSystem.isOpen());

            // Check if the file system is read-only
            System.out.println("Is file system read-only? " + fileSystem.isReadOnly());

            // List supported file attribute views
            Set<String> supportedViews = fileSystem.supportedFileAttributeViews();
            System.out.println("\nSupported file attribute views:");
            for (String view : supportedViews) {
                System.out.println(view);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

