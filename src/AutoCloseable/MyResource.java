package AutoCloseable;
/*
AutoCloseable Interface
The AutoCloseable interface in Java is a functional interface that represents a resource that can be closed.
It has a single method, close(), which is invoked automatically when the resource is no longer needed, typically at the end of a try-with-resources statement.
Any class that implements this interface can be used as a resource in a try-with-resources statement.

Key Method
    -void close() throws Exception: Closes this resource, relinquishing any underlying resources.
 */
public class MyResource implements AutoCloseable{
    public MyResource() {
        System.out.println("MyResource created");
    }
    public void doSomething(){
        System.out.println("Doing something with MyResource");
    }
    @Override
    public void close() throws Exception {
        System.out.println("MyResource closed");
    }
}
