package WrapperClasses;
/*
The Double class has six interesting fields:
1.Double.NEGATIVE_INFINITY - Returns negative infinity.
2.Double.POSITIVE_INFINITY - Returns positive infinity.
3.Double.MIN_EXPONENT - Returns minimum possible exponent (2x).
5.Double.MAX_EXPONENT - Returns maximum possible exponent (2x).
6.Double.MIN_VALUE - Returns minimum possible value of the double type.
7.Double.MAX_VALUE - Returns maximum possible value of the double type.
 */
public class DoubleFields {
    public static void main(String[] args) {
        //1.Negative infinity
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("Negative infinity: " +negativeInfinity);

        //2.Positive infinity
        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println("Positive infinity: " +positiveInfinity);

        //3.Minimum possible exponent (2^x)
        double minExponent = Double.MIN_EXPONENT;
        System.out.println("Minimum possible exponent: " +minExponent);

        //4.Maximum possible exponent (2^x)
        double maxExponent = Double.MAX_EXPONENT;
        System.out.println("Maximum possible exponent: " +maxExponent);

        //5.Minimum possible value of the double type
        double minDouble = Double.MIN_VALUE;
        System.out.println("Minimum possible value of the double type: " +minDouble);

        //6.Maximum possible value of the double type
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Maximum possible value of the double type: " +maxDouble);
    }
}
