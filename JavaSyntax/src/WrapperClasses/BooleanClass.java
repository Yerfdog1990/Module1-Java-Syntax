package WrapperClasses;
/*
The Boolean type has two constants (two fields):
Boolean.TRUE - Checks if the statement is true
Boolean.FALSE - Checks if the statement is false.

Key Features of the Boolean Class:
1.Wrapper for primitive boolean: The Boolean class wraps a value of the primitive type boolean in an object.
2.Constants: The Boolean class defines two constants, Boolean.TRUE and Boolean.FALSE.
3.Immutability: Boolean objects are immutable, meaning their values cannot be changed once they are created.

Common Methods of the Boolean Class:
1.booleanValue(): Returns the value of the Boolean object as a boolean.
2.parseBoolean(String s): Parses the string argument as a boolean.
3.toString(): Returns a String object representing the specified boolean.
 */
public class BooleanClass {
    public static void main(String[] args) {
        // Primitive boolean
        boolean primitiveBool = true;

        // Boolean object
        Boolean booleanObject = Boolean.valueOf(primitiveBool);

        // Using primitive boolean in a condition
        if (primitiveBool) {
            System.out.println("Primitive boolean condition is true.");
        }

        // Using Boolean object in a condition
        if (booleanObject) {
            System.out.println("Boolean object condition is true.");
        }

        // Using Boolean.parseBoolean(String)
        String trueString = "true";
        boolean parsedBool = Boolean.parseBoolean(trueString);
        if (parsedBool) {
            System.out.println("Parsed boolean condition is true.");
        }

        // Converting Boolean to String
        String boolString = booleanObject.toString();
        System.out.println("Boolean object as string: " + boolString);

        // Using booleanValue()
        boolean boolValue = booleanObject.booleanValue();
        if (boolValue) {
            System.out.println("booleanValue() condition is true.");
        }
    }
}
