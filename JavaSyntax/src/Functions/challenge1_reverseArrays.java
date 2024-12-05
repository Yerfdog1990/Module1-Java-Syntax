package Functions;

// Main method to test the reverseArray and printArray methods
public class challenge1_reverseArrays {
    public static void main(String[] args) {
        // Initialize the array with given values
        int[] array = {2, 1, 3, 4, 5, 7, 10, 6};

        // Print the array before reversing
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Print the array after reversing
        printArray(array);
    }
    // Method to reverse the order of elements in the array
    public static void reverseArray(int[] array){
        int left = 0; // Initialize left index
        int right = array.length - 1; // Initialize right index

        // Loop to swap elements from both ends of the array
        while(left < right){
            // Swap the elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the indices towards the middle
            left++;
            right--;
        }
    }
    // Method to print all elements of the array
    public static  void printArray(int[] array){
        // Iterate through the array and print each element
        for(int i : array){
            System.out.print(i + " ,");
        }
        // Print a newline at the end
        System.out.println();
    }
}
