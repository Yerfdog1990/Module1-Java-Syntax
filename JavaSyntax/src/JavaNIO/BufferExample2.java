package JavaNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferExample2 {
    public static void main(String[] args) {
        // Create a RandomAccessFile object, passing in the file path
// and a string that says the file will be opened for reading and writing
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("text.txt", "rw");
             // Get an instance of the FileChannel class
             FileChannel channel = randomAccessFile.getChannel();
        ) {
// Our file is small, so we'll read it in one go
// Create a buffer of the required size based on the size of our channel
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) channel.size());
            // Read data will be put into a StringBuilder
            StringBuilder builder = new StringBuilder();
            // Write data from the channel to the buffer
            channel.read(byteBuffer);
            // Switch the buffer from write mode to read mode
            byteBuffer.flip();
            // In a loop, write data from the buffer to the StringBuilder
            while (byteBuffer.hasRemaining()) {
                builder.append((char) byteBuffer.get());
            }
            // Display the contents of the StringBuilder on the console
            System.out.println(builder);

            // Now let's continue our program and write data from a string to the file
            // Create a string with arbitrary text
            String someText = "Hello, Amigo!!!!!";
            // Create a new buffer for writing,
            // but let the channel remain the same, because we're going to the same file
            // In other words, we can use one channel for both reading and writing to a file
            // Create a buffer specifically for our string — convert the string into an array and get its length
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(someText.getBytes().length);
            // Write our string to the buffer
            byteBuffer2.put(someText.getBytes());
            // Switch the buffer from write mode to read mode
            // so that the channel can read from the buffer and write our string to the file
            byteBuffer2.flip();
            // The channel reads the information from the buffer and writes it to our file
            channel.write(byteBuffer2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
