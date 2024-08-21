package JavaNIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
Java NIO (Non-Blocking I/O)
Java NIO (New Input/Output) is a collection of Java programming language APIs that offer features for intensive I/O operations.
It was introduced in Java 1.4 and provides an alternative to the standard Java I/O (java.io) package. Java NIO is designed to be non-blocking and more scalable,
making it particularly useful for building high-performance server applications.

Key Features of Java NIO:
    1.Buffers: Containers for data that provide structured access to byte data. Buffers are used in combination with channels to perform I/O operations.
    2.Channels: Represent connections to entities capable of performing I/O operations, such as files, sockets, or other data streams. Unlike streams in the traditional I/O package, channels are bidirectional.
    3.Selectors: Used to perform non-blocking I/O operations on multiple channels. A selector can monitor multiple channels for events (like read or write operations) and dispatch them to appropriate handlers.
    4.Non-blocking I/O: Operations do not block the executing thread, allowing the thread to perform other tasks while waiting for the operation to complete.
    5.File I/O: Java NIO provides enhanced file I/O capabilities, including memory-mapped files, file locking, and a more comprehensive file manipulation API.
    6.Charset and Encoders/Decoders: Java NIO offers better support for character encoding and decoding, using the Charset class.

Key Classes and Methods in Java NIO:
    1.Buffer (e.g., ByteBuffer, CharBuffer):
    2.flip(): Prepares the buffer for reading data.
    3.clear(): Clears the buffer, making it ready for writing data.
    4.rewind(): Rewinds the buffer to the beginning.
    5.remaining(): Returns the number of elements between the current position and the limit.
    6.Channel (e.g., FileChannel, SocketChannel):
    7.read(ByteBuffer): Reads data from the channel into the buffer.
    8.write(ByteBuffer): Writes data from the buffer into the channel.
    9.close(): Closes the channel.

Selector:
    1.select(): Blocks until at least one channel is ready for an I/O operation.
    2.selectNow(): Non-blocking version of select().
    3.select(int timeout): Blocks for a specified time until a channel is ready.
    4.wakeup(): Wakes up a blocked selector.
    5.Path & Files (from java.nio.file):
    6.Paths.get(String): Returns a Path object.
    7.Files.readAllBytes(Path): Reads all bytes from a file.
    8.Files.write(Path, byte[], OpenOption...): Writes bytes to a file.
 */
public class NioExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("NIO.txt");
        String data = "This is an example of Java NIO.";
        // Write data to file using FileChannel and ByteBuffer
        try(FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
            writeBuffer.put(data.getBytes());
            writeBuffer.flip();// Switch buffer from write mode to read mode
            fileChannel.write(writeBuffer); // Write data from buffer to file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Read data from file using FileChannel and ByteBuffer
        try(FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.READ)) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            int byteRead = fileChannel.read(readBuffer);
            while(byteRead != -1){
                readBuffer.flip();// Switch buffer from write mode to read mode
                while(readBuffer.hasRemaining()){
                    System.out.print((char) readBuffer.get());
                }
                readBuffer.clear();// Clear buffer for the next read
                byteRead = fileChannel.read(readBuffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
