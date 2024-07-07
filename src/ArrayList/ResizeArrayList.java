package ArrayList;
/*
The process of resizing the internal array of an ArrayList in Java when it needs more capacity to accommodate additional elements. Here's a summary of the steps involved:
1.Create a new array: When the current internal array of the ArrayList reaches its capacity and needs to grow, a new array with a larger size is created.
2.Copy all elements: All existing elements from the old array are copied into the new array. This ensures that no elements are lost during the resizing process.
3.Replace the old array: The reference to the old array is then updated to point to the new array. This effectively "replaces" the old array with the new one in terms of where the ArrayList is storing its elements.
4.Add the new element: Finally, the new element (in your example, the number 100) is added to the ArrayList. Now, the ArrayList has successfully accommodated the new element and can continue to grow as needed.

This resizing mechanism ensures that ArrayList can dynamically adjust its capacity as elements are added, providing efficient performance for operations like adding elements.
 */
public class ResizeArrayList {
    public static void main(String[] args) {
        
    }
}
