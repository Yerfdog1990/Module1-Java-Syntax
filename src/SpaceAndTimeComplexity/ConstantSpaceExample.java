package SpaceAndTimeComplexity;
/*
O(1) - Constant Space:
   - Example: Storing a fixed number of variables.
   - Explanation: The algorithm uses a constant amount of space regardless of the input size.
   - Java Example: `int a = 10; int b = 20;`
 */
public class ConstantSpaceExample {
    public static void main(String[] args) {
        // Using a fixed number of variables
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum = " +sum);// Uses O(1) space

    }
}
