package Enum;
/*
Enum in Java
Enum (short for "enumeration") is a special data type in Java that enables a variable to be a set of predefined constants.
It is used to define collections of constants that can be assigned to a variable.
Enums are particularly useful when you have a fixed set of related constants, such as days of the week, months of the year, or directions.

Key Features of Enums
1.Type Safety: Enums provide type safety, ensuring that the variable can only take one of the predefined constants.
2.Singleton Nature: Each constant in an enum is a singleton, meaning it is unique and only one instance exists.
3.Namespace: Enums provide a namespace for the constants, avoiding naming conflicts.
4.Readable Code: Enums make the code more readable and maintainable by using meaningful names instead of numeric or string literals.
5.Methods and Fields: Enums can have fields, methods, and constructors, allowing more complex behavior.

Common Methods of Enums
Java provides several built-in methods for enums, and you can also define custom methods. Here are some of the common methods:
1.values(): Returns an array containing all of the values of the enum. For example, Day[] days = Day.values();
2.valueOf(String name): Returns the enum constant of the specified name. For example, Day day = Day.valueOf("Monday");
3.ordinal(): Returns the ordinal (position in the enum declaration) of the enum constant. For example, int ordinal = Day.Monday.ordinal();
4.name(): Returns the name of the enum constant. For example, String name = Day.Monday.name();
5.toString(): Returns the name of the enum constant, as contained in the declaration. For example, String name = Day.Monday.toString()
 */
public enum Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    // Method to check if it's a weekday
    public boolean isWeekDay(){
        return this != Saturday && this != Sunday;
    }
    // Method to check if it's a weekend
    public boolean isWeekEnd(){
        return this == Saturday || this == Sunday;
    }
    public static void main(String[] args) {
        Day[] days = Day.values();
        System.out.println("Days of the week:");
        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " +(i+1)+ " : " +days[i]);
        }
        // Example usage of custom methods
        Day today = Day.Thursday;
        System.out.println("Is Thursday a weekday? " +today.isWeekDay());
        System.out.println("Is Thursday a weekend? " +today.isWeekEnd());

        // Using valueOf and ordinal
        Day day = Day.valueOf("Tuesday");
        System.out.println("Day: " +day +" , Ordinal: " +day.ordinal());
    }
}
