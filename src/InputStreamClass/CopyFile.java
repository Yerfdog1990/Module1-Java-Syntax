package InputStreamClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        String src = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 3/Programming Assignment 3.txt";
        String copy = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 3/Programming Assignment 3 Copy.txt";
        try(//InputStream for reading from the file
            FileInputStream input = new FileInputStream(src);
            //InputStream for reading from the file
            FileOutputStream output = new FileOutputStream(copy))
            {
                //Buffer into which we will read the data
                byte[] buffer = new byte[65536];
                //As long as there is data in the stream
                while (input.available() > 0){
                    //Read data into the buffer
                    int real = input.read(buffer);
                    //Write the data from the buffer to the second stream
                    output.write(buffer, 0, real);
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Operation executed successfully.");
        }
    }
}
