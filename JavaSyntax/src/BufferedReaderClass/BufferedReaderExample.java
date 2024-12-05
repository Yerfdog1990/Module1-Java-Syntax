package BufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader is indeed a class in Java. It is part of the java.io package and is designed to provide efficient reading of characters, arrays, and lines from a character input stream. The BufferedReader class wraps around another Reader (such as FileReader or InputStreamReader) and reads a large chunk of data into a buffer at once. Subsequent read requests can then be served from this buffer, reducing the number of direct I/O operations needed.

Key Features of BufferedReader
1.Buffering: It reads a block of data into memory (the buffer) and provides access to it, reducing the number of actual reads from the underlying stream.
2.Line Reading: The readLine() method is a convenient feature that reads an entire line of text at once, returning it as a String.
3.Efficiency: By reducing the number of I/O operations, BufferedReader improves the performance of reading data from slower I/O sources like files or network streams.

Common Methods
1.String readLine(): Reads a line of text, returning null if the end of the stream is reached.
2.int read(): Reads a single character from the buffer.
3.int read(char[] cbuf, int off, int len): Reads characters into a portion of an array.
4.boolean ready(): Checks if the buffer is ready to be read without blocking.
5.void close(): Closes the stream and releases any system resources associated with it.
 */
public class BufferedReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:/Users/Yerdog/Desktop/CodeGym/Module 1 - Java Syntax/Lesson 23 - Input Output 1/Text document.txt";
        try(BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filePath))) {
            // 1. String readLine(): Reads a line of text, returning null if the end of the stream is reached
            System.out.println("1. Reading lines:");
            String line;
            while ((line = bufferedReader1.readLine()) != null){
                System.out.println(line);
            }
            // Resetting the stream for demonstration purposes
            bufferedReader1.close();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(filePath));
            // 2. int read(): Reads a single character from the buffer
            System.out.println("\n2. Reading single characters:");
            int charAsInt;
            while((charAsInt = bufferedReader2.read()) != -1){
                System.out.print((char) charAsInt);
            }
            System.out.println();
            // Resetting the stream for the next example
            bufferedReader2.close();
            BufferedReader bufferedReader3 = new BufferedReader(new FileReader(filePath));
            // 3. int read(char[] cbuf, int off, int len): Reads characters into a portion of an array
            System.out.println("\n3. Reading into a portion of an array:");
            char[] buffer = new char[20];
            int charRead = bufferedReader3.read(buffer, 5, 10);// Read 10 chars starting at index 5
            System.out.println(new String(buffer, 5, charRead));
            // 4. boolean ready(): Checks if the buffer is ready to be read without blocking
            System.out.println("\n4. Checking if the buffer is ready:");
            if(bufferedReader3.ready()){
                System.out.println("The buffer is ready for reading.");
            }else{
                System.out.println("The buffer is not ready for reading.");
            }
            // 5. void close(): Closes the stream and releases any system resources associated with it
            bufferedReader3.close();
            System.out.println("\n5. BufferedReader closed.");
        } catch (IOException e) {
            System.out.println("An error ocurred. " +e.getMessage());;
        }
    }
}
