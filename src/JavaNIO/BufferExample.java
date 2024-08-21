package JavaNIO;
/*
Buffer in Java NIO
In Java NIO, a Buffer is a container used to store data for various I/O operations.
The buffer is a crucial part of NIO as it provides the ability to manage the data being read from or written to channels.
Buffers allow you to handle data in a more controlled and flexible way, including the ability to navigate back and forth in the data, which is helpful for complex I/O processing tasks.

Key Features of Buffer:
    1.Capacity: The maximum amount of data the buffer can hold. Once a buffer is created, its capacity cannot be changed.
    2.Position: The current position where the next read or write operation will occur.
    3.Limit: The limit is the index of the first element that should not be read or written. For a buffer in write mode, this is the capacity. For a buffer in read mode, this is the position when flip() was last called.
    4.Mark: A special position within the buffer to which you can return using the reset() method.

Commonly Used Methods:
    1.allocate(int capacity): Allocates a new buffer with the specified capacity.
    2.flip(): Switches the buffer from write mode to read mode. It sets the limit to the current position and then sets the position to zero.
    3.clear(): Clears the buffer, making it ready for writing. It resets the position to zero and the limit to the capacity.
    4.rewind(): Sets the position to zero and does not change the limit. This is useful when you want to re-read the data from the buffer.
    5.get(): Reads the byte at the buffer's current position, and then increments the position.
    6.put(byte b): Writes the given byte into the buffer at the current position, then increments the position.
    7.hasRemaining(): Returns true if there are elements between the current position and the limit.
    8.compact(): Copies the remaining data to the beginning of the buffer and sets the position to just after the last remaining element.
 */
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.IOException;

public class BufferExample {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("example.txt", "r");
             FileChannel channel = file.getChannel()) {

            // Allocate a buffer with a capacity of 2048 bytes
            ByteBuffer buffer = ByteBuffer.allocate(2048);

            // Read data from the channel into the buffer
            int bytesRead = channel.read(buffer);
            System.out.println("Bytes read: " + bytesRead);

            // Switch the buffer from write mode to read mode
            buffer.flip();

            // Process the data in the buffer
            while (buffer.hasRemaining()) {
                byte data = buffer.get();
                System.out.print((char) data); // Print the data as characters
            }

            // Clear the buffer to make it ready for writing again
            buffer.clear();

            // If you want to rewind the buffer to re-read the data
            // buffer.rewind();
            // Process data again if necessary

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

