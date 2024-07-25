package Recursion;
/*
Recursion
Recursion is a programming technique where a function calls itself directly or indirectly to solve a problem.
Each recursive call solves a smaller instance of the same problem, progressively breaking it down until it
reaches a base case, which stops the recursion.

Key Features of Recursion
1.Base Case: The condition under which the recursion stops. It prevents infinite recursion and eventual stack overflow.
2.Recursive Case: The part of the function where it calls itself with modified parameters to gradually approach the base case.
3.Stack Usage: Each recursive call is placed on the call stack until the base case is reached, after which the stack unwinds.
4.Problem Decomposition: Recursion divides a complex problem into smaller, more manageable sub-problems of the same type.
5.Elegance and Simplicity: Recursive solutions can be more intuitive and simpler to write for certain types of problems, such as those involving hierarchical data structures (trees, graphs).

Methods of Recursion
1.Direct Recursion: When a function calls itself directly.
2.Indirect Recursion: When a function is called by another function, which in turn calls the original function.
 */
public class FactorialCalculation_DirectRecursion {
    // Recursive method to calculate factorial
    public static int findFactorial(int n){
        if(n == 0){//Base case
            return 1;
        }else{
            return n * findFactorial(n -1); //Recursive call
        }
    }
    //Main method
    public static void main(String[] args) {
        int number = 3;
        int result = findFactorial(number);
        System.out.printf("Factorial of %d is %d.", number, result);
    }
}
