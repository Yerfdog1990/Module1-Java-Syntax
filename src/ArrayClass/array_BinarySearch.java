package ArrayClass;

import java.util.Arrays;

/*
The binarySearch() method is used to search an element in a sorted array.
It takes two parameters — the array to be searched and the value to be searched for.
If the value is found, it returns the index of the element, otherwise, it returns a negative value.
 */
public class array_BinarySearch {
    public static void main(String[] args) {
        //Original array
        int[] list = {13, 24, 19, 25, 12, 40, 17, 62, 15};
        //Sorting array first before performing binary search
        Arrays.sort(list);
        System.out.println("Sorted array: "+Arrays.toString(list));

        //calling the binarySearch method in the while loop then print the result
        int index1 = binarySearch(list, 20);
        System.out.println("Using While loop: Position of 2160: " +index1);

        //calling the binarySearch() method in the array class then print the result
        int index2 = Arrays.binarySearch(list, 20);
        System.out.println("Using binarySearch() Method: Position of 2160: " +index2);
    }
    public static int binarySearch(int[]data, int numberToFind){
        int minPosition = 0;
        int maxPosition = data.length - 1;
        while(minPosition <= maxPosition){
            int middlePosition = (maxPosition + minPosition)/2;
            int middleNumber = data[middlePosition];

            if(numberToFind == middleNumber){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                maxPosition = middlePosition - 1;
            }
            else{
                minPosition = middlePosition + 1;
            }

        }
        return -1;
    }
}
