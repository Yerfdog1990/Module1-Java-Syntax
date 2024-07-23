package SingletonPattern;
/*
Enum Singleton:
1.Ensures thread-safety and serialization safety by default.
2.Easy to implement and less error-prone.
 */

public enum SingletonMethod3 {
    INSTANCE;
    //Method to print message
    public void printMessage(){
        System.out.println("Hello from the Singleton instance!");
    }
    // Main method to demonstrate the singleton behavior
    public static void main(String[] args) {
        // Initialize the singleton and call the print method
        SingletonMethod3 singleton5 = SingletonMethod3.INSTANCE;
        SingletonMethod3 singleton6 = SingletonMethod3.INSTANCE;

        // Print to demonstrate that both references point to the same instance
        System.out.println("Singleton 5 refernce: " +singleton5);
        System.out.println("Singleton 6 refernce: " +singleton6);

        // Call the print method
        singleton5.printMessage();
        singleton6.printMessage();

        // Check if both references are the same
        System.out.println("Singleton 5 and singleton 6 both point to the same reference? " +(singleton5 == singleton6));
    }
}
