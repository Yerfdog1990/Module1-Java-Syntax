package Recursion;
/*
The Fibonacci series is a sequence of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
The sequence starts as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
Recursive Method:
1.Simpler and more elegant in terms of code.
2.Less efficient due to repeated calculations.
3.Runs in exponential time, O(2^n), but can be optimized using memoization.
 */
public class FibonacciSeries_RecursiveMethod {
    // Recursive method to calculate Fibonacci number
    public static int findFibonacciSeries(int n){
        if(n <= 1){// Base case
            return n;
        }else{
            return findFibonacciSeries(n - 1) + findFibonacciSeries(n - 2); // Recursive calls
        }
    }
    //Main method
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i < number; i++) {
            System.out.print(findFibonacciSeries(i) + ",");
        }
    }
}
