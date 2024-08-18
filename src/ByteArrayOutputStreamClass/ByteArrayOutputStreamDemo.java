package ByteArrayOutputStreamClass;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
ByteArrayOutputStream Class in Java
The ByteArrayOutputStream class in Java is a subclass of OutputStream that allows you to write data to a byte array.
It provides a buffer where data is stored, and the buffer automatically grows as more data is written to it.
This class is useful when you need a stream that doesn't write data directly to a file or a network socket but instead collects it in memory for further processing.

Key Features:
1.Dynamic Buffer: The buffer grows as needed when more data is written.
2.Data Storage: All data written to the ByteArrayOutputStream is stored in a byte array.
3.Convenient Conversion: The stored data can easily be converted to a byte array or a string.
4.Efficient: No need to specify the size of the buffer in advance, and you avoid the overhead of reallocation when the buffer grows.

Key Methods:
1.void write(int b): Writes a single byte to the stream.
2.void write(byte[] b, int off, int len): Writes a portion of a byte array to the stream.
3.void writeTo(OutputStream out): Writes the entire content of this ByteArrayOutputStream to another output stream.
4.byte[] toByteArray(): Returns the contents of this output stream as a byte array.
5.String toString(): Converts the contents of the stream to a string, using the platform's default character set.
6.int size(): Returns the current size of the buffer.
7.void reset(): Resets the ByteArrayOutputStream so that you can reuse it without throwing away the existing buffer.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        // Create a ByteArrayOutputStream
        ByteArrayOutputStream firstStream = new ByteArrayOutputStream();
        try {
            // Method 1: write(int b)
            firstStream.write(65); //Writes 'A'
            // Method 2: write(byte[] b, int off, int len
            byte[] byteArray = "Hello, world!".getBytes(StandardCharsets.UTF_8);
            firstStream.write(byteArray, 0, 5); //Writes "Hello"
            // Method 3: writeTo(OutputStream out)
            ByteArrayOutputStream secondStream = new ByteArrayOutputStream();
            firstStream.writeTo(secondStream);
            System.out.println("Content of anotherStream: " + secondStream.toString());// Outputs "AHello"
            // Method 4: toByteArray()
            byte[] byteArrayResult = firstStream.toByteArray();
            System.out.println("Byte array content: " +new String(byteArrayResult, StandardCharsets.UTF_8));// Outputs "AHello"
            // Method 5: toString()
            String stringResult = firstStream.toString();
            System.out.println("String content: " +stringResult); // Outputs "AHello"
            // Method 6: size()
            int size = firstStream.size();
            System.out.println("Size of the stream: " +size); // Outputs 6
            // Method 7: reset()
            firstStream.reset(); // Clears the stream
            firstStream.write("Reset!".getBytes(StandardCharsets.UTF_8));
            System.out.println("Content after reset: " +firstStream.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
Conclusion and the big question
The big question after reading this lesson is "Why can't I just use byte[], since it's more convenient and doesn't impose restrictions?"
The advantage of ByteArrayInputStream is that it strong indicates that you're going to use read-only bytes (because the stream doesn't provide an interface to changing its content). That said, it is important to note that a programmer can still access the bytes directly.
But if sometimes you have a byte[], sometimes you have a file, sometimes you have a network connection, and so on, you'll need some kind of abstraction for "a stream of bytes, and I don't care where they come from". And that's what InputStream is. When the source happens to be a byte array, ByteArrayInputStream is a good InputStream to use.
This is helpful in many situations, but here are two specific examples:
1.You're writing a library that receives bytes and processes them somehow (for example, suppose it's a library of image processing utilities). Users of your library can provide bytes from a file, from an in-memory byte[], or from some other source. So you provide an interface that accepts an InputStream, which means that if they have a byte[], they need to wrap it in a ByteArrayInputStream.
2.You're writing code that reads a network connection. But to perform unit tests on this code, you don't want to open a connection — you just want to feed a few bytes to the code. So the code takes an InputStream and your test passes in a ByteArrayInputStream.
 */