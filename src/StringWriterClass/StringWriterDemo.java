package StringWriterClass;

import java.io.IOException;
import java.io.StringWriter;

/*
StringWriter Class Overview
The StringWriter class in Java is a character stream that collects its output in a StringBuffer, which can then be used to construct a String.
It is part of the java.io package and is useful when you need to write data to a string rather than directly to a file or other output stream.
Since it writes to a StringBuffer, all data is stored in memory.

Key Features of StringWriter
1.Character Stream: Unlike OutputStream, which deals with byte streams, StringWriter deals with character streams, making it suitable for text data.
2.In-Memory Storage: The output is collected in an in-memory StringBuffer, allowing for easy conversion to a String at any time.
3.Thread-Safe: The underlying StringBuffer is synchronized, making StringWriter safe for use by multiple threads.
4.No IOExceptions: Unlike other writers, StringWriter does not throw IOException because it doesn't perform actual I/O operations (like writing to a file or network).
5.Chaining: You can chain multiple write operations together since StringWriter returns itself after each write operation.

Key Methods of StringWriter
1.void write(int c): Writes a single character to the StringWriter.
2.void write(char[] cbuf): Writes an array of characters to the StringWriter.
3.void write(char[] cbuf, int off, int len): Writes a portion of an array of characters to the StringWriter.
4.void write(String str): Writes a string to the StringWriter.
5.void write(String str, int off, int len): Writes a portion of a string to the StringWriter.
6.String toString(): Returns the contents of the StringWriter as a String.
7.StringBuffer getBuffer(): Returns the StringBuffer holding the current contents of the StringWriter.
8.void flush(): Flushes the writer, but since StringWriter is memory-based, this typically has no effect.
9.void close(): Closes the StringWriter, but again, since it is memory-based, this typically has no effect.
 */
public class StringWriterDemo {
    public static void main(String[] args) {
        // Create a StringWriter instance
        StringWriter writer = new StringWriter();
        // Method 1: write(int c)
        // Writes a single character to the writer.
        writer.write(65); // Writes 'A' (ASCII value 65)
        // Method 2: write(char[] cbuf)
        // Writes an entire array of characters to the writer.
        char[] charArray = {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D'};
        try {
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
        // Method 6: toString()
        // Returns the contents of the StringWriter as a String
        String result = writer.toString();
        System.out.println("StringWriter content: " +result);
        // Method 7: getBuffer()
        // Returns the StringBuffer holding the current contents
        StringBuffer buffer = writer.getBuffer();
        System.out.println("StringBuffer content: " +buffer.toString());
        // Method 8: flush() - typically has no effect in StringWriter
        writer.flush();
        // Method 9: close() - typically has no effect in StringWriter
        writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data written to file successfully.");

    }
}
