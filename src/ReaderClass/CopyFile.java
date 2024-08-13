package ReaderClass;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String src = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 6/Programming Assignment 6.txt";
        String copy = "C:/Users/Yerdog/Desktop/Computer Science/CS 1103 - Programming 2/Week 6/Programming Assignment 6 copy.txt";
        try(FileReader reader = new FileReader(src);
            FileWriter writer = new FileWriter(copy))
         {
             char[] buffer = new char[5646];
             while(reader.ready()){
                 int real = reader.read(buffer);
                 writer.write(buffer, 0, real);
             }
        }
    }
}
