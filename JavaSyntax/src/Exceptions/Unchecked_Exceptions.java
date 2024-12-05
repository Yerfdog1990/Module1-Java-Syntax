package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Unchecked Exceptions:
Unchecked exceptions in Java are exceptions that are not checked at compile-time, meaning the compiler does not require methods to catch or specify these exceptions.
These exceptions extend RuntimeException and typically represent programming errors or conditions that the programmer did not foresee.
Here's when some common unchecked exceptions are used:.
1.ArithmeticException: Thrown during exceptional arithmetic conditions, such as division by zero.
2.NullPointerException: Thrown when an operation is performed on a null object reference.
3.ArrayIndexOutOfBoundsException: Thrown when accessing an array with an illegal index.
4.IllegalArgumentException: Thrown to indicate an illegal or inappropriate argument passed to a method.
4.NumberFormatException: Thrown when attempting to convert a string into a numeric type fails.
 */
public class Unchecked_Exceptions {
    // Method to demonstrate ArithmeticException
    public static void validateDenominator(int n) {
        try {
            double quotient = (double) 25 / n;
            if (n == 0) {
                throw new ArithmeticException();
            }
            System.out.println("Quotient = " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error! The denominator cannot be zero.");
        }
    }

    // Method to demonstrate NullPointerException
    public static void findStringSize(String str) {
        try {
            int length = str.length();
            System.out.println("String size = " + length);
        } catch (NullPointerException e) {
            System.out.println("Error! String cannot be null.");
        }
    }
    // Method to demonstrate ArrayIndexOutOfBoundsException
    public static void findElement(int index) {
        try {
            int[] array = {1990, 1991, 2019, 2024};
            if (index > array.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("The element at index " +index+ " is " +array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! The index cannot be greater than size of array.");
        }
    }
    // Method to demonstrate IllegalArgumentException
    public static void findAge(int age) {
        try {
            if (age < 18) {
                throw new IllegalArgumentException();
            }
            System.out.println("Bravo! You are eligible to vote");
        } catch (IllegalArgumentException e) {
            System.out.println("Error! You are illegible to vote. Wait until tour turn 18.");
        }
    }
    // Method to demonstrate NumberFormatException
    public static void convertToInteger(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("String " + str + " converted to integer is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error! The string format" + str + " is invalid.");
        }
    }
    //Main method
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the denominator: ");
                int denominator = userInput.nextInt();
                validateDenominator(denominator);
                break; // Exit loop if input is invalid
            } catch (InputMismatchException e) {
                System.out.printf("Only integers allowed. try again!%n");
                userInput.next(); // Clear the invalid input
            }
        }
        while(true){
                try{
                    System.out.print("Enter the string: ");
                    String str = userInput.nextLine();
                    findStringSize(str);
                    break; // Exit loop if input is invalid
                }catch (InputMismatchException e){
                    System.out.printf("Only string allowed. try again!%n");
                    userInput.next(); // Clear the invalid input
                }
            }
        while(true) {
            try {
                System.out.print("Enter the index: ");
                int index = userInput.nextInt();
                findElement(index);
                break; // Exit loop if input is invalid
            } catch (InputMismatchException e) {
                System.out.printf("Only integers allowed. try again!%n");
                userInput.next(); // Clear the invalid input
            }
        }
        while(true) {
            try {
                System.out.print("Enter age: ");
                int age = userInput.nextInt();
                findAge(age);
                break; // Exit loop if input is invalid
            } catch (InputMismatchException e) {
                System.out.printf("Only integers allowed. try again!%n");
                userInput.next(); // Clear the invalid input
            }
        }
        while(true){
            try{
                System.out.print("Enter the string: ");
                String str = userInput.nextLine();
                convertToInteger(str);
                break; // Exit loop if input is valid
            }catch (InputMismatchException e) {
                System.out.printf("Only string allowed. try again!%n");
                userInput.next(); // Clear the invalid input
            }
        }
    }
}
