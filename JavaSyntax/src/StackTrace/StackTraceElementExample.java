package StackTrace;
/*
StackTraceElement in Java
The StackTraceElement class in Java provides detailed information about a single stack frame,
which represents one method call in the stack trace. It is primarily used in debugging and error
handling to pinpoint the exact location of an issue within the code.

Key Features of StackTraceElement
1.Class and Method Information: It contains the class name and method name of the stack frame.
2.File Information: It provides the file name and the line number where the method was called.
3.Module Information: It includes the module name and version (can be null).
4.Methods of StackTraceElement
5.String getClassName(): Returns the name of the class.
6.String getMethodName(): Returns the name of the method.
7.String getFileName(): Returns the name of the file.
8.int getLineNumber(): Returns the line number in the file.
9.String getModuleName(): Returns the name of the module (can be null).
10.String getModuleVersion(): Returns the version of the module (can be null).
 */
public class StackTraceElementExample {
        public static void methodE(){
            methodF();
        }
        public static void methodF(){
            methodG();
        }
        public static void methodG(){
            throw new RuntimeException("An error ocurred in method C");
        }
        public static void main(String[] args) {
            try {
                methodE();
            } catch (Exception e) {
                e.printStackTrace();// Print stack trace to the standard error stream
            }
            // Get and print the stack trace of the current thread
            StackTraceElement[] stackTraceElementExample = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : stackTraceElementExample) {
                System.out.println("Class Name: " + element.getClassName());
                System.out.println("Method Name: " + element.getMethodName());
                System.out.println("File Name: " + element.getFileName());
                System.out.println("Line Number: " + element.getLineNumber());
                System.out.println("Module Name: " + element.getModuleName());
                System.out.println("Module Version: " + element.getModuleVersion());
                System.out.println("-----------------------------");

            }
        }
    }

