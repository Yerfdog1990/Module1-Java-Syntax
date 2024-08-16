package ChainedStreams;

import java.io.*;

/*
InputStreamReader Class Overview
InputStreamReader is a class in Java that acts as a bridge between byte streams and character streams.
It reads bytes from an InputStream and decodes them into characters using a specified charset or the platform's default charset if none is provided.
This makes it a vital component in handling character data in applications where data is read from sources like files, network connections, or other input streams.

Key Features of InputStreamReader
1.Charset Conversion: InputStreamReader converts bytes to characters using a specified charset, enabling proper handling of text in different encodings.
2.Integration with InputStream: It allows chaining with an InputStream, enabling the combination of byte stream and character stream processing.
3.Buffering Capability: When used with BufferedReader, it improves efficiency by reducing the number of I/O operations.
4.Supports Marking: Inherited from Reader, it supports marking and resetting within the stream, which is useful for re-reading sections of the data.

Common Methods
int read(): Reads a single character from the stream.
int read(char[] cbuf, int offset, int length): Reads characters into a portion of an array.
boolean ready(): Checks if the stream is ready to be read without blocking.
void close(): Closes the stream and releases any associated resources.
String getEncoding(): Returns the name of the character encoding being used.
 */
public class InputStreamReaderClass {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:/Users/Yerdog/Desktop/CodeGym/Module 1 - Java Syntax/Lesson 23 - Input Output 1/Text document.txt";
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            // 1. Reading and printing the encoding
            String encoding = inputStreamReader.getEncoding();
            System.out.println("Enpcoding used: " +encoding);
            // 2. Reading and printing the file content
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            // 3. Checking if the stream is ready
            if(inputStreamReader.ready()){
                System.out.println("Stream is ready for reading.");
            }else{
                System.out.println("Stream is not ready for reading.");
            }
        } catch (IOException e) {
            throw new RuntimeException(STR."An error occurred.\{e.getMessage()}");
        }
    }
}
