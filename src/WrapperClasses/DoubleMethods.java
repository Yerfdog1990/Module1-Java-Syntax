package WrapperClasses;
/*
The Double class has interesting methods:
1.Double.toHexString(double) - Returns a string that is the hexadecimal representation of the number
2.Double.isInfinite(double) - Checks whether the passed number is infinity.
3.Double.isNaN(double) - Checks whether the passed number is NaN
4.Double.valueOf(double) - Wraps the passed double in a Double object
5.Double.parseDouble(String) - Returns the number obtained from the passed string
 */
public class DoubleMethods {
    public static void main(String[] args) {
        double number = 123.456;

        //1.Convert decimal to hexadecimal
        String hexaDecimal = Double.toHexString(number);
        System.out.println(String.format("Hexadecimal representation of %.3f is %s.", number, hexaDecimal));

        //2.Positive infinity
        double infinityNumber = Double.POSITIVE_INFINITY;
        boolean isInfinite = Double.isInfinite(infinityNumber);
        System.out.println(String.format("Is %f infinite? %b.", infinityNumber, isInfinite));

        //3.Check if NaN
        double nanNumber = Double.NaN;
        boolean isNaN = Double.isNaN(nanNumber);
        System.out.println(String.format("Is %f NaN? %b.", nanNumber, isNaN));

        //4.Autoboxing
        Double wrappedDouble = Double.valueOf(number);
        System.out.println(String.format("Wrapped double object: %.3f", wrappedDouble));

        //5.Covert String to double
        String stringDouble = "123.456";
        Double doubleNumber = Double.parseDouble(stringDouble);
        System.out.println(String.format("The parsed double from string \"%s\" is %.3f.", stringDouble, doubleNumber));
    }
}
