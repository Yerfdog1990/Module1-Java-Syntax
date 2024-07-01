package WrapperClasses;
/*
The Integer class has two fields that contain the maximum and minimum possible values of the int type:
1.Integer.MAX_VALUE - Returns the maximum possible integer value.
2.Integer.MIN_VALUE - Returns the minimum possible integer value.
 */

public class IntegerFields {
    public static void main(String[] args) {
        //1.Maximum possible integer value
        int max = Integer.MAX_VALUE;
        System.out.println(String.format("The maximum possible integer value: %d", max));

        //2.Minimum possible integer value
        int min = Integer.MIN_VALUE;
        System.out.println(String.format("The minimum possible integer value: %d", min));
    }
}
