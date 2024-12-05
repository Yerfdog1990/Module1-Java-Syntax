package JavaNIO;
/*
Channel in Java NIO
A Channel in Java NIO is an abstraction representing an open connection to an I/O device, such as a file, socket, or another data source.
Channels provide a more efficient way to read and write data compared to traditional I/O streams by enabling non-blocking I/O operations, and they can be used with ByteBuffers for greater flexibility in handling data.

Key Features of Channels:
    1.Non-Blocking I/O: Channels can be set to operate in non-blocking mode, allowing your program to continue executing while the channel is waiting for an operation to complete.
    2.Asynchronous Operations: Channels can work with asynchronous I/O operations, which means they can perform read and write operations without blocking the thread.
    3.Direct Data Transfer: Channels can efficiently transfer data directly between buffers or even between two channels without the need for intermediate buffering.
    4.Support for Multiple Types of Channels: Java NIO provides various types of channels, such as FileChannel, SocketChannel, DatagramChannel, and ServerSocketChannel, each corresponding to different I/O sources.
    5.Compatibility with Selectors: Channels can be used with Selectors to monitor multiple channels for events (like readiness to read or write), enabling efficient I/O multiplexing.

Commonly Used Methods in Channels:
    1.read(ByteBuffer dst): Reads data from the channel into the given buffer.
    2.write(ByteBuffer src): Writes data from the given buffer into the channel.
    3.close(): Closes the channel and releases any resources associated with it.
    4.isOpen(): Checks if the channel is still open.
    5.position(): Gets or sets the current position of the channel (only for FileChannel).
    6.size(): Returns the size of the channel (only for FileChannel).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelExample {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Yerdog\\Desktop\\Computer Science\\CS 1103 - Programming 2\\Week 2\\Programming Assignment 2.txt";
        String data = "Hello from channel!";
        try (// Open the file in read-write mode
             RandomAccessFile file = new RandomAccessFile(fileName, "rw");
             FileChannel fileChannel = file.getChannel()){

            // Write data to the file using FileChannel
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            byteBuffer.put(data.getBytes());
            byteBuffer.flip(); // Prepare the buffer for writing
            fileChannel.write(byteBuffer);
            // Read data from the file using FileChannel
            byteBuffer.clear(); // Prepare the buffer for reading
            fileChannel.position(); // Set position to the beginning of the file
            int byteRead = file.read(byteBuffer.array());
            System.out.println("Byte read: " +byteRead);
            // Convert the buffer's data to a string
            byteBuffer.flip();
            byte[] byteArray = new byte[byteBuffer.remaining()];
            byteBuffer.get(byteArray);
            String result = new String(byteArray);
            System.out.println("Data read from file: " + result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
