package ReaderClass;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String src = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 6/Programming Assignment 6.txt";
        String copy = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 6/Programming Assignment 6 copy.txt";
        try(FileReader reader = new FileReader(src);//Reader for reading from a file
            FileWriter writer = new FileWriter(copy))//Writer for writing to a file
         {
             char[] buffer = new char[5646];//Buffer into which we will read the data
             while(reader.ready()){//As long as there is data in the stream
                 int real = reader.read(buffer);//Read data into a buffer
                 writer.write(buffer, 0, real);//Write the data from the buffer to the second stream
             }
        }
    }
}
