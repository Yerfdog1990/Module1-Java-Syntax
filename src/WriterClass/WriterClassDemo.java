package WriterClass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
Writer Class Overview
The Writer class in Java is an abstract class used for writing character streams.
It is part of the java.io package and provides a foundation for various classes that handle character-based output, such as FileWriter, BufferedWriter, and PrintWriter. Unlike OutputStream, which deals with bytes, the Writer class is designed for handling characters, making it ideal for writing text data.

Key Features of Writer
1.Abstract Class: Writer is an abstract class, so it cannot be instantiated directly. It provides a framework for classes that write character data.
2.Character-Based: Unlike OutputStream, which deals with byte streams, Writer handles character streams, making it suitable for writing text data.
3.Extensible: You can extend the Writer class to create custom character stream writers by implementing its abstract methods.
4.Buffered Writing: Subclasses like BufferedWriter use buffering to enhance performance by reducing the number of I/O operations.
5.Automatic Resource Management: When used within a try-with-resources block, Writer objects are automatically closed, ensuring that resources are properly released.

Key Methods of Writer
1.void write(int c): Writes a single character to the writer.
2.void write(char[] cbuf): Writes an array of characters to the writer.
3.void write(char[] cbuf, int off, int len): Writes a portion of an array of characters to the writer.
4.void write(String str): Writes a string to the writer.
5.void write(String str, int off, int len): Writes a portion of a string to the writer.
6.void flush(): Flushes the writer, ensuring that any buffered characters are written out.
7.void close(): Closes the writer and releases any system resources associated with it.
 */
public class WriterClassDemo {
    public static void main(String[] args)  {
        try (Writer writer = new FileWriter("writer_demo.txt")){
            // Method 1: write(int c)
            // Writes a single character to the writer.
            writer.write(65); // Writes 'A' (ASCII value 65)
            // Method 2: write(char[] cbuf)
            // Writes an entire array of characters to the writer.
            char[] charArray = {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D'};
            writer.write(charArray); //Writes "HELLO WORLD"
            // Method 3: write(char[] cbuf, int off, int len)
            // Writes a portion of an array of characters to the writer.
            writer.write(charArray, 0, 6); //Writes "HeLLO"
            // Method 4: write(String str)
            // Writes an entire string to the writer.
            String str = "Java Programming";
            writer.write(str); // Writes "Java Programming."
            // Method 5: write(String str, int off, int len)
            // Writes a portion of a string to the writer.
            writer.write(str, 0, 4); // Writes "Java"
            // Method 6: flush()
            // Flushes the writer, ensuring all buffered characters are written out.
            writer.flush();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Method 7: close()
        // The close() method is automatically called due to try-with-resources.
    }
}
