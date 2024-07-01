package WrapperClasses;
/*
The Integer class also has some interesting methods, which provide various ways to represent, manipulate, and
convert integers in Java, showcasing the flexibility and utility of the Integer class. Here they are:
1.String Integer.toHexString(int) - Returns a string that is the hexadecimal representation of the number
2.String Integer.toBinaryString(int) - Returns a string that is the binary representation of the number
3.String Integer.toOctalString(int) - Returns a string that is the octal representation of the number
4.Integer Integer.valueOf(int i) - Wraps the passed int in an Integer object
5.Integer Integer.parseInt(String) - Returns the number obtained from the passed string
 */

public class IntegerMethods {
    public static void main(String[] args) {
        int number = 123;

        //1.Covert decimal to hexadecimal number.
        String hexDecimal = Integer.toHexString(number);
        System.out.println(String.format("The hexadecimal representation of %d is %s.", number, hexDecimal));

        //2.Covert decimal to binary number.
        String binary = Integer.toBinaryString(number);
        System.out.println(String.format("The binary representation of %d is %s.", number, binary));

        //3.Convert decimal to octal number.
        String octal = Integer.toOctalString(number);
        System.out.println(String.format("The octal representation of %d is %s.", number, octal));

        //4.Autoboxing - Convert primitive int type to its Integer wrapper class.
        Integer wrappedInteger = Integer.valueOf(number);
        System.out.println(String.format("Wrapped integer object: %d", wrappedInteger));

        //5.Convert string to integer
        String numericString = "123";
        int parsedNumber = Integer.parseInt(numericString);
        System.out.println(String.format("The parsed integer from string \"%s\" is:  %d", numericString, parsedNumber));

    }
}
