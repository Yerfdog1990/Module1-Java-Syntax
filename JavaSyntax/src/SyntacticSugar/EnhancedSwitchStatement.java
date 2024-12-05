package SyntacticSugar;
/*
The enhanced switch statement, introduced in Java 12 as a preview feature and standardized in Java 14, offers a more concise and expressive way to write switch statements.
It includes new syntax and capabilities that simplify common switch statement tasks, reduce boilerplate code, and help prevent common errors such as fall-through.

Key Features of Enhanced Switch Statement
1.Arrow Syntax (->):
    -Simplifies the syntax for cases, making them more readable.
    -Prevents fall-through without needing break statements.
2.Single Expression:
    -Allows cases to return values directly, useful in assignment expressions.
3.Block Syntax:
    -Allows complex logic to be executed within a case using a block of code.
4.Yield Keyword:
    -Used within block cases to return a value.
 */
public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        // Single Expression Case
        String dayName = switch (dayOfWeek){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day of week: " + dayOfWeek);
        };
        System.out.println("Day of week: " + dayName);

        // Block Case
        int year = 2024;
        int month = 2;
        int daysInMonth = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if(isLeapYear(year)){
                    yield 29;
                }else {
                    yield 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        System.out.println(year + " is leap year? " +isLeapYear(year));
    }
    public static boolean isLeapYear(int year){
        return (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0);
    }
}
