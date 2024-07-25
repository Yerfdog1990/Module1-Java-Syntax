package Recursion;
/*
Iterative Method:
1.More efficient in terms of time complexity.
2.Runs in O(n) time.
3.Uses a constant amount of extra space, O(1).
 */
public class FibonacciSeries_IterationMethod {
    // Recursive method to calculate Fibonacci number
    public static void findFibonacciSeries(int n){
        int num1 = 0, num2 = 1; //Initialize the first tw0 terms
        System.out.print("Fibonacci series: " +num1+ " ," +num2);
        for (int i = 2; i < n; i++) {
            int nextTerm = num1 + num2; //Define the next term
            System.out.print(", " +nextTerm); //Print the remaining numbers
            num1 = num2;
            num2 = nextTerm; //Update the next term
        }
    }
    //Main method
    public static void main(String[] args) {
        // Number of terms in the Fibonacci series
        findFibonacciSeries(10);
    }
}
