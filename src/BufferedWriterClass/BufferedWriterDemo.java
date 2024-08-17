package BufferedWriterClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
BufferedWriter Class Overview
The BufferedWriter class in Java is a character output stream that provides efficient writing of characters, arrays, and strings by buffering the data before writing it to the underlying output stream.
This reduces the number of I/O operations, improving performance when writing large amounts of data.

Key Features of BufferedWriter
1.Buffered Output: It buffers data before writing it to the underlying stream, reducing the number of I/O operations and improving performance.
2.Character Stream: It handles characters and is typically used for writing text data.
3.Efficient Writing: By minimizing direct interaction with the underlying stream, it provides a more efficient writing process, especially for large data.
4.Synchronization: The BufferedWriter is not thread-safe, meaning it does not handle synchronization internally. External synchronization is needed when used in a multithreaded environment.

Key Methods of BufferedWriter
1.void write(int c): Writes a single character to the buffer.
2.void write(char[] cbuf, int off, int len): Writes a portion of an array of characters to the buffer.
3.void write(String s, int off, int len): Writes a portion of a string to the buffer.
4.void newLine(): Writes a line separator to the buffer.
5.void flush(): Flushes the buffered data to the underlying stream, ensuring that all data is written out.
6.void close(): Closes the BufferedWriter, flushing any remaining data and releasing system resources.
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        // File to write to
        String fileName = "bufferedReader.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            // Method 1: write(int c)
            // Writes a single character to the buffer
            bufferedWriter.write(65);//Writes 'A'
            // Method 2: write(char[] cbuf, int off, int len)
            // Writes a portion of an array of characters to the buffer
            char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
            bufferedWriter.write(charArray, 0, 3);//Writes "ABCD"
            // Method 3: write(String s, int off, int len)
            // Writes a portion of a string to the buffer
            String str = "Hello BufferedWriter";
            bufferedWriter.write(str, 6, 10);// Writes "BufferedW"
            // Method 4: newLine()
            // Writes a line separator to the buffer
            bufferedWriter.newLine();
            // Method 5: append(CharSequence csq)
            // Appends a sequence of characters to the buffer
            bufferedWriter.append("This is an appended line.");  // Appends the string
            // Method 6: flush()
            // Flushes the buffered data to the underlying stream
            bufferedWriter.flush();// Ensures everything is written to the file
            // Method 7: close()
            // Closes the writer, flushing any remaining data
            // This is handled automatically by the try-with-resources block
            System.out.println("Data successfully written to " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
