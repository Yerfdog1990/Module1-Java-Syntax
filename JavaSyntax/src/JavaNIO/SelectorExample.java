package JavaNIO;
/*
Selector in Java NIO
The Selector class in Java NIO (Non-blocking I/O) provides a way to manage multiple channels (such as SocketChannel, ServerSocketChannel, etc.) using a single thread.
This is particularly useful for scenarios where you have many channels that may spend most of their time idle, waiting for data to become available, or for a connection to be established.

Key Features of Selector:
    1.Single Thread for Multiple Channels: Allows a single thread to monitor multiple channels for I/O readiness, which improves efficiency and resource usage, especially in scenarios like network servers.
    2.Non-Blocking Mode: Channels must be in non-blocking mode to be used with a selector, meaning the operations will not block the calling thread.
    3.Selection Keys: Channels register with a selector, and a SelectionKey is returned. This key indicates which operations are ready (e.g., read, write, connect, accept) and can be used to retrieve the channel.
    4.Event Multiplexing: The selector waits for events (like reading, writing, etc.) on the registered channels and processes them as they become ready, rather than dedicating a thread per channel.

Commonly Used Methods:
    1.open(): Creates a new selector.
    2.select(): Blocks until at least one channel is ready for the operations you're interested in.
    3.selectNow(): Non-blocking version of select(). Returns immediately with the number of ready channels.
    4.5.wakeup(): Causes the select() method to return immediately.
    5.close(): Closes the selector and releases any associated resources.

Types of Selection Keys:
    1.SelectionKey.OP_CONNECT: The channel is ready to establish a connection.
    2.SelectionKey.OP_ACCEPT: The channel is ready to accept a new connection.
    3.SelectionKey.OP_READ: The channel is ready for reading.
    4.SelectionKey.OP_WRITE: The channel is ready for writing.
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class SelectorExample {
    public static void main(String[] args) {
        try {
            // Create a selector
            Selector selector = Selector.open();

            // Create a ServerSocketChannel and bind it to a port
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(8080));
            serverChannel.configureBlocking(false); // Non-blocking mode

            // Register the channel with the selector for accepting new connections
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                // Wait for an event (blocking call)
                selector.select();

                // Get the set of ready channels
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();

                    // Remove the key from the set (important to avoid reprocessing)
                    keyIterator.remove();

                    // Check what kind of event this key represents
                    if (key.isAcceptable()) {
                        // Accept the new client connection
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        SocketChannel clientChannel = server.accept();
                        clientChannel.configureBlocking(false);
                        // Register this channel for reading
                        clientChannel.register(selector, SelectionKey.OP_READ);
                        System.out.println("Accepted new connection from client: " + clientChannel.getRemoteAddress());
                    } else if (key.isReadable()) {
                        // Read data from the client
                        SocketChannel clientChannel = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(256);
                        int bytesRead = clientChannel.read(buffer);
                        if (bytesRead == -1) {
                            // Client closed the connection
                            clientChannel.close();
                        } else {
                            buffer.flip();
                            String receivedString = new String(buffer.array(), 0, bytesRead);
                            System.out.println("Received from client: " + receivedString);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

