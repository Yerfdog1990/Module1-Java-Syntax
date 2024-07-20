package SpaceAndTimeComplexity;
/*
O(n^2) - Quadratic Time
Operations that take O(n^2) time usually involve nested loops where each element in a collection is compared
with every other element. Simple sorting algorithms like Bubble Sort, Selection Sort, and Insertion Sort
exhibit this time complexity.

Java Example using a simple Bubble Sort:
 */

public class QuadraticTimeExample {
    public static void main(String[] args) {
        // Create an array with random integers
        int[] array = {23, 56, 12, 90, 45, 23, 17, 5};
        // Perform Bubble Sort which has O(n^2) complexity
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]){
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
        // Print the sorted array
        System.out.println("Sorted array: ");
        for(int numbers : array){
            System.out.print(numbers + ",");
        }
    }
}
