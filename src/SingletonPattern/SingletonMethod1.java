package SingletonPattern;
/*
Create a singleton using a Private Constructor and a Public Static Final Field:
1.Declare a static final field in the class to hold the single instance.
2.Mark the constructor private to prevent external instantiation.
3.This approach ensures that only one instance of the class is created, and provides a simple way to access the instance.
 */

// Define the Singleton class
public class SingletonMethod1 {
    // Declare a public static final field to hold the single instance of the class
    public static final SingletonMethod1 INSTANCE = new SingletonMethod1();
    // Field to demonstrate instance initialization
    private String message = "Hello from the Singleton instance!";
    // Private constructor to prevent external instantiation
    private SingletonMethod1() {
    }
    // Method to get the message
    public String getMessage() {
        return message;
    }
    // Main method to demonstrate the Singleton pattern
    public static void main(String[] args) {
        // Get a reference to the single instance of the Singleton class
        SingletonMethod1 singleton1 = SingletonMethod1.INSTANCE;
        // Call a method on the Singleton instance
        System.out.println(singleton1.getMessage());
        // Get another reference to the single instance of the Singleton class
        SingletonMethod1 singleton2 = SingletonMethod1.INSTANCE;
        System.out.println(singleton2.getMessage());
        // Check if both references point to the same instance
        if(singleton1 == singleton2){
            System.out.println("singleton1 and singleton2 are pointing the same instance");
        }else{
            System.out.println("singleton1 and singleton2 are pointing different instance");
        }
    }
}
