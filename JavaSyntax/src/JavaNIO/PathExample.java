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
1.Path.of(): Used to create WindowsPath objects if the program is running on Windows.
2.Path getParent(): Returns the parent directory
3.Path getFileName(): Returns the filename without the directory
4.Path getRoot(): Returns the root directory from a path
5.boolean isAbsolute(): Checks whether the current path is absolute
6.Path toAbsolutePath(): Converts the path to absolute
7.Path normalize(): Removes wildcards in a directory name.
8.Path resolve(Path other): Constructs a new absolute path from absolute and relative paths.
9.Path relativize(Path other): Gets a relative path from two absolute paths.
10.boolean startsWith(Path other): Checks whether the current path starts with a given path
11.boolean endsWith(Path other): Checks whether the current path ends with a given path
12.int getNameCount(): Splits the path into parts using / as a delimiter. Returns the number of parts.
13.Path getName(int index): Splits the path into parts using / as a delimiter. Returns a part by its index.
14.Path subpath(int beginIndex, int endIndex): Splits the path into parts using / as a delimiter. Returns the subpath that corresponds to the given interval.
15.File toFile(): Converts a Path object to a deprecated File object
16.URI toUri(): Converts a Path object to a URI object
 */
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        String str = "C:\\Users\\Yerdog\\Desktop\\Computer Science\\CS 1103 - Programming 2\\Week 6\\Programming Assignment 6.txt";

        // 1. Path.of()
        Path path = Path.of(str);
        System.out.println("Path: " + path);

        // 2. getParent()
        Path parent = path.getParent();
        System.out.println("Parent Directory: " + parent);

        // 3. getFileName()
        Path fileName = path.getFileName();
        System.out.println("File Name: " + fileName);

        // 4. getRoot()
        Path root = path.getRoot();
        System.out.println("Root Directory: " + root);

        // 5. isAbsolute()
        boolean isAbsolute = path.isAbsolute();
        System.out.println("Is Absolute: " + isAbsolute);

        // 6. toAbsolutePath()
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);

        // 7. normalize()
        Path normalizedPath = path.normalize();
        System.out.println("Normalized Path: " + normalizedPath);

        // 8. resolve(Path other)
        Path otherPath = Paths.get("OtherFolder");
        Path resolvedPath = path.resolve(otherPath);
        System.out.println("Resolved Path: " + resolvedPath);

        // 9. relativize(Path other)
        Path basePath = Paths.get("C:\\Users\\Yerdog\\Desktop\\Computer Science");
        Path relativePath = basePath.relativize(path);
        System.out.println("Relative Path: " + relativePath);

        // 10. startsWith(Path other)
        boolean startsWith = path.startsWith(Paths.get("C:\\Users\\Yerdog"));
        System.out.println("Starts With 'C:\\Users\\Yerdog': " + startsWith);

        // 11. endsWith(Path other)
        boolean endsWith = path.endsWith(Paths.get("Programming Assignment 6.txt"));
        System.out.println("Ends With 'Programming Assignment 6.txt': " + endsWith);

        // 12. getNameCount()
        int nameCount = path.getNameCount();
        System.out.println("Name Count: " + nameCount);

        // 13. getName(int index)
        Path nameAtIndex = path.getName(5);
        System.out.println("Name at Index 5: " + nameAtIndex);

        // 14. subpath(int beginIndex, int endIndex)
        Path subPath = path.subpath(2, 6);
        System.out.println("Subpath (2, 6): " + subPath);

        // 15. toFile()
        File file = path.toFile();
        System.out.println("File Object: " + file);

        // 16. toUri()
        URI uri = path.toUri();
        System.out.println("URI: " + uri);
    }
}







