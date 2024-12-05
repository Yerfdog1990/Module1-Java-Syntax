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

Methods for working with a buffer
1.allocate(int capacity): this method is used to allocate a new buffer with the specified capacity. The allocate() method throws an IllegalArgumentException if the passed capacity is a negative integer.
2.capacity(): returns the current buffer's capacity.
3.position(): returns the current cursor position. Read and write operations move the cursor to the end of the buffer. The return value is always less than or equal to the limit.
4.limit(): returns the current buffer's limit.
5.mark(): is used to mark (save) the current cursor position.
6.reset(): returns the cursor to the previously marked (saved) position.
7.clear(): sets the position to zero and sets the limit to the capacity. This method does not clear the data in the buffer. It only reinitializes the position, limit, and mark.
8.flip(): switches the buffer from write mode to read mode. It also sets the limit to the current position and then puts the position back at zero.
9.read(): The channel's read method is used to write data from the channel to the buffer, while the buffer's put() method is used to write data to the buffer.
10.write(): The channel's write method is used to write data from the buffer to the channel, while buffer's get() method is used to read data from the buffer.
11.rewind(): rewinds the buffer. This method is used when you need to reread the buffer — it sets the position to zero and does not change the limit.

And now a few words about channels.
The most important channel implementations in Java NIO are the following classes:
1.FileChannel — A channel for reading and writing data from/to a file.
2.DatagramChannel — This class reads and writes data over the network via UDP (User Datagram Protocol).
3.SocketChannel — A channel for reading and writing data over the network via TCP (Transmission Control Protocol).
4.ServerSocketChannel — A channel for reading and writing data over TCP connections, just as a web server does. A SocketChannel is created for each incoming connection.
 */
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.IOException;

public class BufferExample1 {
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

