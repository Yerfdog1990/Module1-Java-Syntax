package OutputStreamClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
OutputStream Class Overview
The OutputStream class in Java is an abstract class that represents an output stream of bytes.
It is part of the java.io package and is the superclass of all classes that write bytes to a destination, such as files, network connections, or memory buffers.

Key Features of OutputStream
1.Abstract Class: OutputStream is an abstract class, meaning it cannot be instantiated directly. Instead, it provides a framework for specific output stream implementations like FileOutputStream, ByteArrayOutputStream, BufferedOutputStream, etc.
2.Byte-Oriented: It is designed to handle binary data as it deals with streams of bytes.
3.Extensible: You can extend OutputStream to create custom output streams by implementing its abstract methods.
4.Automatic Resource Management: With the introduction of try-with-resources in Java 7, OutputStream can be used within a try block, and it will be automatically closed at the end of the block.

Key Methods of OutputStream
1.void write(int b): Writes the specified byte to the output stream. The byte is passed as an integer, but only the lower 8 bits are written.
2.void write(byte[] b): Writes an array of bytes to the output stream.
3.void write(byte[] b, int off, int len): Writes len bytes from the specified byte array starting at offset off to the output stream.
4.void flush(): Flushes the output stream, forcing any buffered output bytes to be written out.
5.void close(): Closes the output stream and releases any system resources associated with it.
 */
public class OutputStreamExample {
    public static void main(String[] args) {
        try(OutputStream outputStream = new FileOutputStream("output_demo.txt")) {
            // Method 1: write(int b)
            // Writes a single byte to the output stream.
            outputStream.write(72);  // H
            outputStream.write(101); // e
            outputStream.write(108); // l
            outputStream.write(108); // l
            outputStream.write(111); // o

            // Method 2: write(byte[] buffer)
            // Writes an entire byte array to the output stream.
            byte[] byteArray = "\nHello world!".getBytes();
            outputStream.write(byteArray); // Writes "Hello world!"
            // Method 3: write(byte[] buffer, int off, int len)
            // Writes a part of the byte array to the output stream.
            outputStream.write(byteArray, 0, 6);// Writes "Hello"
            // Method 4: flush()
            // Flushes the output stream, ensuring all data is written.
            outputStream.flush();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Method 5: close()
        // The close() method is automatically called due to try-with-resources.
    }
}
