package Try_With_Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Try-With-Resources
The try-with-resources statement is a try statement that declares one or more resources.
A resource is an object that must be closed after the program is finished with it.
The try-with-resources statement ensures that each resource is closed at the end of the statement.
This feature was introduced in Java 7 to simplify the management of resources and to prevent resource leaks.

Key Features of Try-With-Resources
1.Automatic Resource Management: Resources are automatically closed at the end of the statement, reducing the likelihood of resource leaks.
2.Simpler and Cleaner Code: Eliminates the need for explicit finally blocks to close resources, resulting in cleaner and more readable code.
3.Multiple Resources: Multiple resources can be declared in a single try-with-resources statement, each separated by a semicolon.
4.Exception Handling: If an exception is thrown within the try block, the resources are still closed. Additionally, it can handle suppressed exceptions.

Methods
The resource used in try-with-resources must implement the AutoCloseable interface, which has a single method:
-   void close() throws Exception: Closes this resource, relinquishing any underlying resources.
The Closeable interface, which is a sub-interface of AutoCloseable, is also commonly used for IO-related resources and has the same close method.
 */
public class TryWithResourcesExample {
    public static void main(String[] args) {
        File file = new File("example.txt");
        // Using try-with-resources to manage the Scanner resource
        try(Scanner userInput = new Scanner(file)){
            while(userInput.hasNext()){
                String line = userInput.nextLine();
                System.out.printf(line);
            }
        }catch (FileNotFoundException e){
            System.err.println("File not found: "+file.getAbsolutePath());
        }
    }
}
