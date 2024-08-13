package ReaderClass;

import java.io.*;

/*
Definition:
The Reader class in Java is an abstract class that serves as the superclass for all classes that read character streams.
Unlike the InputStream class, which reads raw bytes, the Reader class is designed for reading characters, handling character encoding automatically.
This class provides the basic functionality for reading characters, arrays, and lines of text, making it a crucial part of Java's I/O system for handling text data.

Key Features:
1.Character-Oriented:
    -The Reader class and its subclasses work with characters (char) rather than bytes.
    -This makes it ideal for reading text data, as it can handle different character encodings.
2.Abstract Class:
    -The Reader class is abstract, meaning it cannot be instantiated directly.
    -Instead, it serves as a base class for other concrete reader classes like FileReader, BufferedReader, and InputStreamReader.
3.Stream Operations:
    -The Reader class provides essential methods for reading characters, character arrays, and lines of text.
    -These methods include read(), read(char[] buffer), and readLine() (provided by subclasses like BufferedReader).
4.Subclasses:
    -Many subclasses extend the Reader class, each designed for specific types of input sources, such as files (FileReader), strings (StringReader), and byte streams (InputStreamReader).
5.Error Handling:
    -The Reader class includes mechanisms for handling I/O exceptions through IOException.
    -This ensures that programs can respond appropriately to errors during reading operations.
6.Closing Streams:
    -Like other I/O classes in Java, Reader implements the Closeable interface, which means it must be closed after use to release system resources.
    -This is typically done using a try-with-resources statement.
7.Unicode Support:
    -Since Reader deals with characters, it supports Unicode characters, enabling the reading of international text data across different languages and scripts.
8.Buffered Reading:
    -Subclasses like BufferedReader provide efficient reading capabilities by buffering characters, which reduces the number of I/O operations needed, improving performance.
9.Line-Based Reading:
    -Certain subclasses of Reader, such as BufferedReader, offer methods like readLine() that allow reading an entire line of text at once, making it easier to process text files line by line.
10.Error Handling:
    -Reader and its subclasses are equipped to handle input/output exceptions through IOException, ensuring robust error management during character reading operations.
11.Extendibility:
    -Developers can create custom readers by extending the Reader class, providing specialized character reading functionalities tailored to specific needs.

Common Methods:
1.int read(): Reads a single character and returns it as an integer. If the end of the stream is reached, it returns -1.
2.int read(char[] cbuf): Reads characters into a portion of an array. The method returns the number of characters read or -1 if the end of the stream is reached.
3.int read(char[] cbuf, int off, int len): Reads up to len characters into an array, starting at the specified offset.
4.long skip(long n): Skips n characters in the input stream.
5.boolean ready(): Checks whether the stream is ready to be read without blocking.
6.void close(): Closes the stream and releases any system resources associated with it.
 */
public class ReaderExample {
    public static void main(String[] args) {
        String data = "Hello, this is a sample text for Reader class demonstration.";

        // Using StringReader to create a Reader from the string data
        try (Reader reader = new StringReader(data)) {

            // 1. int read(): Reads a single character and returns it as an integer
            int charAsInt = reader.read();
            System.out.println("1. Read single character: " + (char) charAsInt);

            // 2. int read(char[] cbuf): Reads characters into a portion of an array
            char[] buffer = new char[10];
            int charsRead = reader.read(buffer);
            System.out.println("2. Read characters into array: " + new String(buffer, 0, charsRead));

            // 3. int read(char[] cbuf, int off, int len): Reads up to len characters into an array
            char[] partialBuffer = new char[15];
            int partialCharsRead = reader.read(partialBuffer, 5, 10);
            System.out.println("3. Read into partial array: " + new String(partialBuffer, 5, partialCharsRead));

            // 4. long skip(long n): Skips n characters in the input stream
            long charsSkipped = reader.skip(5);
            System.out.println("4. Skipped characters: " + charsSkipped);

            // 5. boolean ready(): Checks whether the stream is ready to be read without blocking
            boolean isReady = reader.ready();
            System.out.println("5. Is stream ready?: " + isReady);

            // Reading the remaining content to check if ready() worked
            int remainingChar;
            System.out.print("Remaining content: ");
            while ((remainingChar = reader.read()) != -1) {
                System.out.print((char) remainingChar);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // 6. void close(): Closes the stream and releases any system resources associated with it
        // This is handled automatically by the try-with-resources statement above
        System.out.println("\n6. Reader closed successfully.");
    }
}