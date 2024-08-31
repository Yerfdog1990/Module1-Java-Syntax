package DateUnixTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/*
The LocalDateTime class combines the capabilities of the LocalDate and LocalTime classes: it stores both a date and a time.
Its objects are also immutable, and its methods are similar to those of the LocalDate and LocalTime classes.
 */
public class LocalDateTimeClass {
    public static void main(String[] args) {
        //Getting the current date and time
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: " +current);

        //Getting a specific date and time
        LocalDateTime date = LocalDateTime.of(1990, Month.MARCH,30, 12,30,00);
        System.out.println("My birthday: " +date);

        //Getting elements of a date and time
        LocalDateTime currentDayTime = LocalDateTime.now();
        System.out.println("Year: " +currentDayTime.getYear());//Returns the year of a specific date
        System.out.println("Month: " +currentDayTime.getMonth());//Returns the date's month: one of several constants. E.g: JANUARY, FEBRUARY, ...;
        System.out.println("Month value: " +currentDayTime.getMonthValue());//Returns the index of the date's month. January == 1.
        System.out.println("Day of the Month: " +currentDayTime.getDayOfMonth());//Returns the index of the day of the month
        System.out.println("Day of the year: " +currentDayTime.getDayOfYear());//Returns the day's index from the beginning of the year
        System.out.println("Day of the week: " +currentDayTime.getDayOfWeek());//Returns the day of the week: one of several constants. E.g: MONDAY, TUESDAY, ...;
    }
}
