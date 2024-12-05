package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Key Features of Try-Catch Block
1.Exception Handling: The try-catch block is used to handle exceptions and prevent the program from terminating unexpectedly.
2.Try Block: This block contains code that might throw an exception. It is followed by one or more catch blocks.
3.Catch Block: This block handles specific exceptions thrown by the try block. You can have multiple catch blocks to handle different types of exceptions.
4.Finally Block: This is an optional block that executes regardless of whether an exception was thrown or not. It is typically used for cleanup code.
5.Multiple Catch Blocks: You can catch different exceptions with different catch blocks.
6.Exception Propagation: If an exception is not caught by any catch block, it propagates to the caller method.

Key Methods
1.try: Defines the block of code to be tested for exceptions.
2.catch: Defines the block of code to be executed if an exception occurs.
3.finally: (Optional) Defines a block of code that will execute after the try-catch block, regardless of whether an exception was thrown.
 */
public class Try_CatchBlock {
    // Method of a single try-catch block
   public static void singleCatchBlock(int index){
       String[] countries = {"Kenya", "Uganda", "Tanzania", "Rwanda", "Burundi"};
       try{
           // Code that may throw an exception
           System.out.printf("Element at index %d is: %s.%n", index, countries[index]);
       }catch (ArrayIndexOutOfBoundsException e){
           // Handling the specific exception
           System.out.printf("Exception caught: %s.%n", e);
       }
       // Method of a multiple try-catch block
   }
   //Main method
    public static void findQuotient(int dividend, int divider){
        // Code that may throw multiple exceptions
        try{
            double quotient = (double) dividend/divider;
            System.out.printf("Quotient: %d/%d = %.2f%n", dividend, divider, quotient);
        }catch (ArithmeticException e){
            // Handling divide by zero exception
            System.out.println("Division by zero not allowed");
        }catch (Exception e){
            // Handling other exceptions
            System.out.println("Handling other exceptions!" +e);
        }

    }
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
        // Loop for index input
       while(true){
           try {
               System.out.print("Enter the index: ");
               int index = userInput.nextInt();
               //Calling single try-catch block method
               singleCatchBlock(index);
               break; // Exit loop if input is valid
           }catch (InputMismatchException e){
               System.out.printf("Only integers allowed. try again!.%n");
               userInput.next(); // Clear the invalid input
           }
       }
        // Loop for quotient calculation
        while(true) {
            try {
                System.out.print("Enter dividend: ");
                int dividend = userInput.nextInt();
                System.out.print("Enter the divisor: ");
                int divisor = userInput.nextInt();
                //Calling the multiple try-catch block
                findQuotient(dividend, divisor);
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Only integers allowed. try again!%.n");
                userInput.next(); // Clear the invalid input
            }
        }
        userInput.close();
    }
}
