package InputStreamClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
InputStream class
The InputStream class is interesting because it is the parent class for hundreds of descendant classes.
It doesn't have any data of its own, but it does have methods that all of its derived classes inherit.
In general, it is rare for stream objects to store data internally. A stream is a tool for reading/writing data,
but not storage. That said, there are exceptions. Here are some key features and a code example demonstrating the usage of some of the common methods provided by InputStream and its descendants.

Key Features of InputStream Class
1.Abstract Base Class: InputStream is an abstract class and cannot be instantiated directly. It defines methods that all its subclasses must implement.
2.Reading Data: Provides methods to read bytes from a source.
3.Data Source Independence: InputStream and its subclasses can read data from various sources like files, network sockets, byte arrays, etc.
4.No Data Storage: Generally, streams do not store data but facilitate reading from a data source.
5.Resource Management: Provides a close() method to release resources associated with the stream.

Methods of the InputStream class and all its descendant classes:
1.read() method:
    -The read() method reads one byte from the stream and returns it. You might be confused by the int return type.
    -This type was chosen because int is the standard integer type. The first three bytes of the int will be zero.
2.read(byte[] buffer) method:
    -This is the second variant of the read() method. It lets you read a byte array from an InputStream all at once.
    -The array that will store the bytes must be passed as an argument. The method returns a number — the number of bytes actually read.
    -Let's say you have a 10 kilobyte buffer, and you're reading data from a file using the FileInputStream class.
    -If the file contains only 2 kilobytes, all the data will be loaded into the buffer array, and the method will return the number 2048 (2 kilobytes).
3.readAllBytes() method:
    -A very good method. It just reads all the data from the InputStream until it runs out and returns it as a single byte array.
    -This is very handy for reading small files. Large files may not physically fit in memory, and the method will throw an exception.
4.skip(long n) method
    -This method allows you to skip the first n bytes from the InputStream object.
    -Because the data is read strictly sequentially, this method simply reads the first n bytes from the stream and discards them.
    -Returns the number of bytes that were actually skipped (in case the stream ended before n bytes were skipped).
5.int available() method:
    -The method returns the number of bytes that are still left in the stream
6.void close() method
    -The close() method closes the data stream and releases the external resources associated with it.
    -Once a stream is closed, no more data can be read from it.
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        // Convert the string "Hello, InputStream!" into a byte array
        byte[] data = "Hello input stream!".getBytes();
        // Create a ByteArrayInputStream using the byte array as the source
        InputStream inputStream = new ByteArrayInputStream(data);
        try{
            // Read one byte at a time using the read() method
            int byteData;
            while ((byteData = inputStream.read()) != -1){
                // Cast the byte to a char and print it
                System.out.print((char)byteData);
            }
            // Print a newline for separation
            System.out.println();
            // Reset the input stream for further reading
            inputStream = new ByteArrayInputStream(data);
            // Read multiple bytes at once into a buffer array
            byte[] buffer = new byte[7];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1){
                // Convert the read bytes into a string and print it
                System.out.println(new String(buffer, 0, bytesRead));
            }
            // Print a newline for separation
            System.out.println("******************************");
            // Reset the input stream for further reading
            inputStream = new ByteArrayInputStream(data);
            // Skip the first 7 bytes in the stream
            inputStream.skip(7);
            int remainingByte;
            while((remainingByte = inputStream.read()) != -1){
                // Cast the byte to a char and print it
                System.out.print((char) remainingByte);
            }
            // Print a newline for separation
            System.out.println();
            //Reset input stream for further reading
            inputStream = new ByteArrayInputStream(data);
            // Check and print the number of available bytes to be read
            System.out.println("Available bytes: " +inputStream.available());
            // Read all bytes at once using readAllBytes() method
            byte[] allBytes = inputStream.readAllBytes();
            // Convert the byte array to a string and print it
            System.out.println(new String(allBytes));
        }catch (IOException e){
            // Handle any IOException that may occur
            e.getStackTrace();
        }finally {
            try{
                if(inputStream != null){
                    // Close the input stream to release resources
                    inputStream.close();
                }
            }catch (IOException e){
                // Handle any IOException that may occur during closing
                e.getStackTrace();
            }
        }
    }
}
