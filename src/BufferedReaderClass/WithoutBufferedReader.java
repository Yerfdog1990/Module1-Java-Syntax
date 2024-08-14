package BufferedReaderClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WithoutBufferedReader {
    public static void main(String[] args) throws FileNotFoundException{
        String filePath = "C:/Users/Yerdog/Desktop/CodeGym/Module 1 - Java Syntax/Lesson 23 - Input Output 1/Text document.txt";
        try(FileReader fileReader = new FileReader(filePath)) {
            int charRead;
            while((charRead = fileReader.read()) != -1){
                System.out.print((char) charRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
