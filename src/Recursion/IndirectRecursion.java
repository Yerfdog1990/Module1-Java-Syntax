package Recursion;
/*
Indirect recursion
Indirect recursion occurs when a function calls another function, which in turn calls the original function, creating a cycle of calls. This type of recursion can involve more than two functions and is characterized by several key features:

Key Features of Indirect Recursion
1.Mutual Function Calls: Indirect recursion involves two or more functions calling each other in a cyclical manner. For example, function A calls function B, and function B calls function A.
2.Base Case in Each Function: Each function in the cycle must have its own base case to terminate the recursion. Without proper base cases, the recursion can lead to infinite loops and stack overflow.
3,Progression Towards Termination: Similar to direct recursion, each call should progress towards meeting the base case. This often involves passing modified arguments that move closer to the termination condition.
4.State Maintenance Across Calls: Since multiple functions are involved, the state or context is often passed and modified across these calls, maintaining consistency and ensuring logical progression.
5.Complexity and Readability: Indirect recursion can sometimes make the code more complex and harder to follow compared to direct recursion. It requires careful tracking of the flow of control and the conditions under which each function calls the other.
6.Applicability: Indirect recursion is particularly useful in scenarios where multiple operations or states are involved, and direct recursion would be less intuitive or practical.
 */
public class IndirectRecursion {
    // Function A which calls Function B
    public static void functionA(int n){
        if(n > 0){// Base case for function A
            System.out.println("Function A: " +n);
            functionB(n - 3);// Call function B instead of function A
        }
    }
    // Function B which calls Function A
    public static void  functionB(int n){
        if(n > 1){// Base case for function B
            System.out.println("Function B: " +n);
            functionA(n/2);// Call function B instead of function A
        }
    }

    public static void main(String[] args) {
        // Initial call to function A
        functionA(10);
        // Initial call to function B
        //functionB(10);
    }
}
