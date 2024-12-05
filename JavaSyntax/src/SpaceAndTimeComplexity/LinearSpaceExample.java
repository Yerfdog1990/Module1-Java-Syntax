package SpaceAndTimeComplexity;

import java.util.ArrayList;

/*
O(n) - Linear Space:
   - Example: Storing an array or list of input size n.
   - Explanation: The space used grows linearly with the size of the input data.
   - Java Example: `int[] array = new int[n]; ArrayList<Integer> list = new ArrayList<>(n);`
 */
public class LinearSpaceExample {
    public static void main(String[] args) {
        // Creating an array and an ArrayList with input size n
        int n = 10;
        int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        // Filling the array and arraylist with values
        for (int i = 0; i < n; i++) {
            arrayList.add(array[i]);
        }
        System.out.println("Array: ");
        for(int value : arrayList){
            System.out.print(value+ ", ");
        }
        System.out.println("\nArralist: " +arrayList);// Uses O(n) space
    }
}
