package Recursion;

public class BinarySearch {
    //Method to perform binary search for an element in the array
    public static int performBinarySearch(int[] array, int target, int low, int high){
        if(low > high) {
            return -1;
        }
        int mid = (high + low)/2;
        if(array[mid] == target){
            return mid;
        }
        if(array[mid] > target){
            return performBinarySearch(array, target, low, mid-1);
        }else{
            return performBinarySearch(array, target, mid+1, high);
        }
    }
    //Main method
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        int result = performBinarySearch(array, target, 0, array.length-1);
        if(result == -1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("The element is found at index: " +result);
        }
    }
}
