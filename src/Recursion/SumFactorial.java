package Recursion;

import java.util.Scanner;

public class SumFactorial {
    //Method to calculate factorial
    public static int calculateFactorial(int n){
        if(n == 0){
           return 1;
        }else{
            return n * calculateFactorial(n-1);
        }
    }
    //Method to calculate sum (factorial) of first N numbers.
    public static int calculateSumFactorial (int N){
        if(N == 0){
            return 0;
        }else{
            return N + calculateSumFactorial(N-1);
        }
    }
    //Main method
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = userInput.nextInt();
        int result1 = calculateFactorial(number);
        System.out.println("Factorial of " +number+ " is: " +result1);
        int result2 = calculateSumFactorial(number);
        System.out.println("Sum (factorial) of first " +number+ " numbers is: " +result2);

    }
}
