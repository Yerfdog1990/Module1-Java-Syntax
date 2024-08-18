package ByteArrayInputStreamClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
ByteArrayInputStream Class Overview
The ByteArrayInputStream class in Java is a subclass of InputStream that allows a byte array to be used as an input stream.
It provides a way to read data from a byte array as if it were an input stream, which is useful for situations where you need to
read from a byte array in the same way you would read from an external source like a file or a network connection.

Key Features of ByteArrayInputStream
1.In-Memory Stream: It operates on an in-memory array of bytes, making it faster for reading small or moderate amounts of data.
2.No External Resources: Since it works with byte arrays, it doesn't rely on external resources like files or network connections, making it lightweight and efficient.
3.Mark and Reset Support: It supports marking a position in the input stream and resetting to that position, which can be useful for parsing data.
4.Thread-Safe: The class is thread-safe, meaning it can be safely used by multiple threads if synchronized properly.

Key Methods of ByteArrayInputStream
1.int read(): Reads the next byte of data from the input stream and returns it as an integer (0-255). Returns -1 if the end of the stream is reached.
2.int read(byte[] b, int off, int len): Reads up to len bytes of data from the input stream into an array starting at off. Returns the number of bytes read or -1 if the end of the stream is reached.
3.int available(): Returns the number of remaining bytes that can be read from the input stream.
4.skip(long n): Used to skip a certain number of bytes and not read them.
4.void mark(int readAheadLimit): Marks the current position in the input stream so that you can reset to this position later.
5.void reset(): Resets the stream to the most recent mark, or the beginning if no mark was set.
6.boolean markSupported(): Returns true if the input stream supports the mark() and reset() methods.
7.void close(): Closes the input stream and releases any system resources associated with it. (In ByteArrayInputStream, this method has no effect but is present for compatibility with the InputStream interface.)
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        // Creating a byte array
        byte[] byteArray = {65, 66, 67, 68, 69};// Corresponds to "ABCDE"
        // Creating a ByteArrayInputStream from the byte array
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        // Method 1: read()
        // Reading the first byte
        int singleByteArray = byteArrayInputStream.read();
        System.out.println("First byte read: " +(char)singleByteArray); // Outputs 'A'
        // Method 2: read(byte[] b, int off, int len)
        // Reading the next 2 bytes into a buffer
        byte[] buffer = new byte[2];
        int byteRead = byteArrayInputStream.readNBytes(buffer, 0, 2);
        System.out.println("Byte read: " +new String(buffer));// Outputs "BC"
        // Method 3: available()
        // Checking the number of bytes available to read
        int availableBytes = byteArrayInputStream.available();
        System.out.println("Bytes available: " +availableBytes);
        // Method 4: skip(long n)
        // Used to skip a certain number of bytes and not read them.
        byteArrayInputStream.skip(1);
        while(byteArrayInputStream.available() != 0){
            int data = byteArrayInputStream.read();
            System.out.println("Next byte after skipping: " +(char)data);
        }
        // Method 4: mark(int readAheadLimit)
        // Marking the current position in the stream
        byteArrayInputStream.mark(10);
        // Reading the next byte after marking
        int nextbyte = byteArrayInputStream.read();
        System.out.println("Next byte: " + (char)nextbyte);// Outputs 'E'
        // Method 5: reset()
        // Resetting the stream to the marked position
        byteArrayInputStream.reset();
        System.out.println("Byte array after reset: " +(char)byteArrayInputStream.read());// Outputs 'E' again
        // Method 6: markSupported()
        // Checking if mark/reset is supported
        System.out.println("Mark supported: " +byteArrayInputStream.markSupported());
        // Method 7: close()
        // Closing the stream (no effect here)
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
