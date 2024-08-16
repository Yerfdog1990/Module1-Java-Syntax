package ReaderClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
In Java, you can read a line of input from the console using different classes that serve as intermediaries to the System.in input stream. The most common methods are:

Method 1: Using Scanner Class:
The Scanner class is a simple and convenient way to read data from the console. It wraps System.in and provides methods like nextLine() to read input as strings.
Method 2: Using BufferedReader Class:
The BufferedReader class, combined with an InputStreamReader, allows for more efficient reading of data, especially for larger inputs.
It reads data from System.in and provides the readLine() method to read input as strings.
 */
public class ReadFromConsole {
    public static void main(String[] args) throws IOException {
        //Method 1: Using Scanner Class
        InputStream input1 = System.in;
        Scanner console1 = new Scanner(input1);
        System.out.print("Enter a line using Scanner: ");
        String lineScanner = console1.nextLine();
        System.out.println("You entered (Scanner): " + lineScanner);

        //Method 2: Using BufferedReader Class
        InputStream input2 = System.in;
        InputStreamReader inputStream = new InputStreamReader(input2);
        BufferedReader buffer = new BufferedReader(inputStream);
        System.out.print("Enter a line using BufferedReader: ");
        String lineBuffer = buffer.readLine();
        System.out.println("You entered (BufferedReader): " + lineBuffer);
    }
}
