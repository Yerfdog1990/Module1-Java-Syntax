package Exceptions;
/*
throw operator
When an exception is caught by a catch block, and until it is thrown to the Java machine, it is just an object
that inherits Exception (or rather, Throwable). The exception object itself does not have any magical properties.
All the logic of how exceptions work is just a special way the Java machine behaves when an exception is thrown to it.
Note: A rethrown exception cannot be caught by other catch blocks in the same try block.
You can always rethrow a caught exception to the Java machine. To do this, you need to use the throw operator:
    -throw exception;
 */
public class ThrowOperator {
    public static void main(String[] args) {
        int n = 0;
        validateDenominator(n);
        if(n == 0){
            throw new IllegalArgumentException("Division by zero not allowed!");
        }else{
            System.out.println("The denominator is valid.");
        }
    }
    public static void validateDenominator(int n){
        try{
            double quotient = (double)25/n;
            System.out.printf("25 ÷ %d = %.2f%n", n, quotient);
        }catch (ArithmeticException e){
            System.out.println("Caught an exception: " +e.getMessage());
        }finally {
            System.out.println("Execution completed.");
        }
    }
}
