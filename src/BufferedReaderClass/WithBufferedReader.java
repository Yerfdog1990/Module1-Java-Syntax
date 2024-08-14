package BufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
How BufferedReader Improves Efficiency
BufferedReader improves efficiency by reducing the number of I/O operations needed to read data from a stream.
When reading data from a stream, each read operation incurs overhead, such as accessing the file system or waiting for data to arrive from a network.
BufferedReader reduces this overhead by reading a large block of data (a buffer) into memory at once, then serving subsequent read requests from this buffer.
This minimizes the number of direct I/O operations required, as multiple reads from the buffer can be fulfilled without accessing the underlying stream again.
 */
public class WithBufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:/Users/Yerdog/Desktop/CodeGym/Module 1 - Java Syntax/Lesson 23 - Input Output 1/Text document.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
