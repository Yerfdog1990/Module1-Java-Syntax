package JavaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ChannelBufferExample {

    public static void main(String[] args) {
        Path inputPath = Path.of("input.txt"); // Source file
        Path outputPath = Path.of("output.txt"); // Destination file

        try (FileChannel inputChannel = FileChannel.open(inputPath, StandardOpenOption.READ);
             FileChannel outputChannel = FileChannel.open(outputPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            // Allocate a ByteBuffer with a specific capacity
            ByteBuffer buffer = ByteBuffer.allocate(1024); // Allocate 1KB buffer

            // Read data from the input file into the buffer
            int bytesRead = inputChannel.read(buffer); // Read data from the channel into the buffer
            System.out.println("Bytes read: " + bytesRead);

            // Switch buffer from write mode to read mode
            buffer.flip();

            // Write data from the buffer to the output file
            while (buffer.hasRemaining()) {
                outputChannel.write(buffer); // Write buffer content to the output channel
            }

            // Reset buffer to read the content again
            buffer.rewind();

            // Print buffer content as a string (assumes text data)
            byte[] byteArray = new byte[buffer.limit()];
            buffer.get(byteArray);
            System.out.println("Buffer content: " + new String(byteArray));

            // Clear the buffer to be reused
            buffer.clear();

            // Mark the current position
            buffer.put((byte) 'X'); // Write a single byte
            buffer.mark(); // Mark the current position
            buffer.put((byte) 'Y'); // Write another byte

            // Reset the buffer to the marked position
            buffer.reset();
            System.out.println("After reset: " + (char) buffer.get());

            // Clear buffer for another operation
            buffer.clear();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

