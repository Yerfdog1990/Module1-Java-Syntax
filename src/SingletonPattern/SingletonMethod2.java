package SingletonPattern;
/*
Creating a singleton using a Private Constructor and a Public Static Method:
1.Declare a static field to hold the single instance.
2.Mark the constructor private.
3.Provide a public static method to return the instance.
 */
public class SingletonMethod2 {
    // Step 1: Declare a static field to hold the single instance
    public static final SingletonMethod2 INSTANCE = new SingletonMethod2();
    // Step 2: Mark the constructor private
    private SingletonMethod2() {
        // Private constructor to prevent instantiation
    }
    // Step 3: Provide a public static method to return the instance
    public static SingletonMethod2 getInstance(){
        return INSTANCE;
    }
    //Method to print message
    public void printMessage(){
        System.out.println("Hello from the Singleton instance!");
    }
    // Main method to demonstrate the singleton behavior
    public static void main(String[] args) {
        // Initialize the singleton and call the print method
        SingletonMethod2 singleton3 = SingletonMethod2.getInstance();
        SingletonMethod2 singleton4 = SingletonMethod2.getInstance();
        // Print to demonstrate that both references point to the same instance
        System.out.println("Singleton 3: " +singleton3);
        System.out.println("Singleton 4: " +singleton4);
        // Call the print method
        singleton3.printMessage();
        singleton4.printMessage();

        // Check if both references are the same
        System.out.println("Are both printers the same instance? " +(singleton3 == singleton4));
    }
}
