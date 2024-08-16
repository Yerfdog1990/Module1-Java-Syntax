package WriterClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteCharacter {
    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in);
            FileWriter output = new FileWriter(console.nextLine())) {
            char[] charArray = new char[] {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D'};
            for(char character : charArray){
                output.write((char)character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
