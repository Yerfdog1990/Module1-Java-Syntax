package JavaNIO;
/*
Paths Class in Java
The Paths class is a utility class in Java NIO that provides methods to obtain a Path object from a string or a URI.
It simplifies the conversion of a file path in string form or a URI into a Path object, which can then be used to interact with the file system.

Key Features:
1.Utility Class: The Paths class contains static methods, meaning it cannot be instantiated.
2.Path Conversion: Converts strings or URIs into Path objects.
3.Simplifies Path Handling: Allows easy creation of Path objects from common path representations.

Key Methods:
1.Path get(String first, String... more):
    Converts a path represented as a string or multiple strings into a Path object.
    Example: Paths.get("C:\\Users\\Public\\Documents");
2.Path get(URI uri):
    Converts a URI into a Path object.
    Example: Paths.get(new URI("file:///C:/Users/Public/Documents"));
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URI;

public class PathsExample {
    public static void main(String[] args) {
        // Example 1: Convert a string path to a Path object
        Path pathFromString = Paths.get("C:\\Users\\Yerdog\\Desktop\\Computer Science\\CS 1103 - Programming 2\\Week 6\\Programming Assignment 6.txt");
        System.out.println("Path from String: " + pathFromString);

        // Example 2: Convert a URI to a Path object
        try {
            URI uri = new URI("file:///C:/Users/Yerdog/Desktop/Computer%20Science/CS%201103%20-%20Programming%202/Week%206/Programming%20Assignment%206.txt");
            Path pathFromURI = Paths.get(uri);
            System.out.println("Path from URI: " + pathFromURI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

