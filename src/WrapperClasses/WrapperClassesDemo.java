package WrapperClasses;

import java.util.ArrayList;

/*
Java provides wrapper classes for each of the eight primitive types,
allowing primitive values to be treated as objects. This can be useful for various reasons,
such as utilizing collection classes that can only store objects or using methods that require objects.
Here are the eight primitive types and their corresponding wrapper classes:
1.byte → Byte
2.short → Short
3.int → Integer
4.long → Long
5.float → Float
6.double → Double
7.char → Character
8.boolean → Boolean

Key Features of Wrapper Classes
1.Object Methods: Wrapper classes provide methods to manipulate primitive values.
2.Collections: Wrapper classes allow primitive values to be stored in collections like ArrayList.
3.Null Values: Unlike primitive types, wrapper classes can be null.
4.Type Conversion: Wrapper classes offer methods for type conversion and parsing.
5.Constants: Wrapper classes define constants like MAX_VALUE and MIN_VALUE
that represent the maximum and minimum values the primitive types can hold.
6.Immutability: Wrapper objects are immutable, meaning once created, their values cannot be changed.
7.Autoboxing and Unboxing: Java provides automatic conversion between primitives and wrapper objects through
autoboxing (converting a primitive to a wrapper object) and
unboxing (converting a wrapper object to a primitive).
 */
public class WrapperClassesDemo {
    public static void main(String[] args) {
        //1.Using Wrapper Classes to Create Objects
        Integer intObj = Integer.valueOf(12);
        String strObj = String.valueOf("Godfrey");
        Byte byteObj = Byte.valueOf((byte)10);
        Boolean boolObj = Boolean.valueOf(true);
        Double doubleObj = Double.valueOf(3.142);
        Float floatObj = Float.valueOf((float) 4.5);
        Long longObj = Long.valueOf(30031990L);
        Character charObj = Character.valueOf('G');

        System.out.println("Integer object: " +intObj);
        System.out.println("String object: " +strObj);
        System.out.println("Byte object: " +byteObj);
        System.out.println("Boolean object: " +boolObj);
        System.out.println("Double object: " +doubleObj);
        System.out.println("Float object: " +floatObj);
        System.out.println("Long object: " +longObj);
        System.out.println("Character object: " +charObj);

        //2.Using Wrapper Classes in Collections
        ArrayList<Integer> intList = new ArrayList<>();
        //Autoboxing - the automatic conversion between the primitive types and their corresponding object wrapper classes.
        intList.add(0);
        intList.add(1);
        intList.add(2);
        System.out.println("Array list of integers: " +intList);

        //3.Null Values
        Integer intNull = null;
        System.out.println("Null integer: " +intNull);
        //int age = null; Error. Primitive type cannot have null values like the wrapper classes

        //4.Type Conversion - String to integer
        String strNumber = "2024";
        int intNumber = Integer.parseInt(strNumber);
        System.out.println("String to integer: " +intNumber);

        //5.Constants
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("The maximum integer value: " +max);
        System.out.println("The minimum integer value: " +min);

        //6.Comparing wrapper objects
        Integer first = Integer.valueOf(35);
        Integer second = Integer.valueOf(35);
        System.out.println(first.equals(second));
        System.out.println(first == second);

        //7.Immutability
        Integer originalValue = Integer.valueOf(200);
        Integer newValue = Integer.valueOf(originalValue + 1);
        System.out.println("The original value: " +originalValue);//Still 200
        System.out.println("The new value: " +newValue);//201
        //Checking if the originalValue and newValue refer to the same object
        System.out.println(originalValue == newValue);
        newValue += 1;
        System.out.println("After increamenting the new value:");
        System.out.println("The original value: " +originalValue);//Still 200
        System.out.println("The new value: " +newValue);//202

    }
}
