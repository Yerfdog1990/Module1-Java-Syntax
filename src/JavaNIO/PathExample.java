package JavaNIO;
/*
Path in Java NIO
The Path interface in Java NIO represents a path in the file system.
It is used to locate files or directories in a file system. A Path can represent an absolute path, which starts from the root, or a relative path, which is relative to a specific directory or the current working directory.

Key Features of Path:
    1.File System Representation: A Path represents a file or directory location within the file system.
    2.Cross-Platform: The Path interface provides a way to work with file and directory paths in a platform-independent manner.
    3.Easy Conversion: You can easily convert a Path to a File object and vice versa.
    4.Path Manipulation: Provides methods to manipulate paths, like resolving paths, normalizing them, and retrieving parts of the path.
    5.Immutability: Once a Path object is created, it is immutable.

Common Methods of Path:
    1.getFileName(): Returns the file name or the last element of the path.
    2.getParent(): Returns the parent path, or null if there is no parent.
    3.getRoot(): Returns the root component of the path, or null if the path is relative.
    4.resolve(Path other): Combines the current path with the given path.
    5.normalize(): Removes redundant elements like "." and ".." from the path.
    6.toAbsolutePath(): Converts the path to an absolute path.
    7.toString(): Returns the string representation of the path.
    8.startsWith(Path other): Checks if the path starts with the given path.
    9.endsWith(Path other): Checks if the path ends with the given path.
    10.relativize(Path other): Constructs a relative path between this path and another path.
    11.getFileSystem(): Returns the file system associated with the path.
 */
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        // Create a relative path
        Path relativePath = Paths.get("Main.java");
        System.out.println("Relative Path: " + relativePath);

        // Convert to absolute path
        Path absolutePath = relativePath.toAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);

        // Get the file name from the path
        Path fileName = absolutePath.getFileName();
        System.out.println("File Name: " + fileName);

        // Get the parent directory
        Path parentDir = absolutePath.getParent();
        System.out.println("Parent Directory: " + parentDir);

        // Normalize the path
        Path normalizedPath = absolutePath.normalize();
        System.out.println("Normalized Path: " + normalizedPath);

        // Check if the path starts with a particular directory
        boolean startsWithRoot = absolutePath.startsWith("/");
        System.out.println("Starts with root: " + startsWithRoot);

        // Check if the path ends with a particular file name
        boolean endsWithMainJava = absolutePath.endsWith("Main.java");
        System.out.println("Ends with Main.java: " + endsWithMainJava);

        // Relativize paths
        Path anotherPath = Paths.get("/home/user/Documents");
        Path relativeToAnother = anotherPath.relativize(absolutePath);
        System.out.println("Relative path to another: " + relativeToAnother);

        // Get the file system
        System.out.println("File System: " + relativePath.getFileSystem());
    }
}

