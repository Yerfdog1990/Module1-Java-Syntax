package Exceptions;
/*
Errors
These are serious problems that are not typically caught by application code because they represent conditions
that a reasonable application cannot be expected to recover from. These are subclasses of java.lang.Error.
Two common types of errors are OutOfMemoryError and StackOverflowError are: OutOfMemoryError and StackOverflowError.
When Are They Used?
1.OutOfMemoryError: Used when the JVM runs out of memory. This typically happens if an application tries to
allocate more memory than is available. It can occur during:
    -Large object allocation.
    -Memory leaks where objects are not properly garbage collected.
    -Excessive use of memory-heavy data structures.
2.StackOverflowError: Used when the application stack space is exhausted, typically due to deep or infinite
recursion. It can occur during:
    -Recursive method calls without a proper base case.
    -Very deep nesting of method calls.
 */
public class Error {
    //Method to demonstrate OutOfMemoryError
    public static void storeLargeArray(){
        try{
            int[][] largeArray = new int[Integer.MAX_VALUE][Integer.MAX_VALUE];
        }catch (OutOfMemoryError e){
            System.out.println("No enough space to store large array.");
        }
    }
    //Method to demonstrate StackOverflowError
    public static void infiniteRecursion(){
        while(true){
            try{
                infiniteRecursion();
            }catch (StackOverflowError e){
                System.out.println("Caught StackOverflowError");
            }
            break;
        }
    }
    //Main method
    public static void main(String[] args) {
        storeLargeArray();
        infiniteRecursion();
    }
}
