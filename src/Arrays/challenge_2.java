package Arrays;
/*
Write a Java program to sum values of an array.
 */
public class challenge_2 {
    public static void main(String[] args) {
       int[] array = {2, 5, 6, 1, 9, 0, 7};
       int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the elements = " +sum);
    }
}
