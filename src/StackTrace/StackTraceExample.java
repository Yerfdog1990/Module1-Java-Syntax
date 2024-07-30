package StackTrace;
/*
Stack Trace in Java
A stack trace in Java is a report of the active stack frames at a certain point in time during the execution of a program. It is a useful tool for debugging,
as it shows the sequence of method calls that led to the current point in the program, allowing developers to trace back to the origin of an error or unexpected behavior.

Key Features of Stack Trace
1.Trace Method Calls: It provides a list of method calls in the order they were invoked, starting from the current method and going back to the main() method.
2.Debugging Aid: It helps in identifying the exact point in the code where an exception was thrown and the path taken by the execution flow.
3.Class and Method Information: Each element in the stack trace includes the class name, method name, and line number where the method was called.
4.Exception Handling: It is typically included in the stack trace when an exception is thrown, giving detailed information about the error.

Methods to Work with Stack Trace
1.Thread.currentThread().getStackTrace(): Returns an array of StackTraceElement representing the stack trace of the current thread.
2.Throwable.getStackTrace(): Returns an array of StackTraceElement representing the stack trace when an exception was thrown.
3.Exception.printStackTrace(): Prints the stack trace to the standard error stream.
 */
public class StackTraceExample {
    public static void methodA(){
        methodB();
    }
    public static void methodB(){
        methodC();
    }
    public static void methodC(){
        throw new RuntimeException("An error ocurred in method C");
    }
    public static void main(String[] args) {
        try{
            methodA();
        }catch (Exception e){
            e.getStackTrace();// Print stack trace to the standard error stream
        }
        // Get and print the stack trace of the current thread
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElement){
            System.out.println(element);
        }
    }
}
