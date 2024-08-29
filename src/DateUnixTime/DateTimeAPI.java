package DateUnixTime;

import java.time.*;

/*
Java's creators didn't like the situation with the Date and Calendar classes. They were good in their day, but times change. And something simple, powerful and reliable became necessary. And with the release of Java 8 (15 years after Calendar appeared), the Java Date Time API was introduced. It is a set of classes that should be able to solve every possible task dealing with time.
There were so many classes that they were split into several packages:
The java.time package is the base package for the Java Date Time API: it contains classes such as LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration. All objects of these classes are immutable, which means they cannot be changed after creation.
The java.time.format package contains classes for time formatting, i.e. converting times (and dates) to strings and vice versa. For example, it contains the versatile DateTimeFormatter class, which replaces the SimpleDateFormat class.
The java.time.zone package contains classes for working with time zones. It contains classes such as TimeZone and ZonedDateTime. If you're writing server code for clients located in different parts of the world, you will really need these classes.
 */
public class DateTimeAPI {
    public static void main(String[] args) {
        //Getting the current date
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //Getting a date in a specific time zone
        ZoneId timeZone = ZoneId.of("Africa/Nairobi");
        LocalDate kenyaDate = LocalDate.now(timeZone);
        System.out.println("Time in Nairobi now: " +kenyaDate);

        //Getting a date in a specific time zone
        ZoneId TimeZone = ZoneId.of("Africa/Nairobi");
        LocalDate kenyanDate = LocalDate.now(TimeZone);
        System.out.println("Time in Nairobi now: " +kenyanDate);

        //Getting a specific date
        LocalDate date = LocalDate.of(1990, Month.MARCH, 30);
        System.out.println("My birthday: " +date);

        //Getting a date by the index of the day
        LocalDate day = LocalDate.ofYearDay(2024, 243);
        System.out.println("257th day of the year 2024: " +day);

        //Getting a Unix date
        LocalDate unixDate = LocalDate.ofEpochDay(19965);
        System.out.println("Unix date: " +unixDate);

        //Getting elements of a date
        LocalDate currentDay = LocalDate.now();
        System.out.println("Year: " +currentDay.getYear());//Returns the year of a specific date
        System.out.println("Month: " +currentDay.getMonth());//Returns the date's month: one of several constants. E.g: JANUARY, FEBRUARY, ...;
        System.out.println("Month value: " +currentDay.getMonthValue());//Returns the index of the date's month. January == 1.
        System.out.println("Day of the Month: " +currentDay.getDayOfMonth());//Returns the index of the day of the month
        System.out.println("Day of the year: " +currentDay.getDayOfYear());//Returns the day's index from the beginning of the year
        System.out.println("Day of the week: " +currentDay.getDayOfWeek());//Returns the day of the week: one of several constants. E.g: MONDAY, TUESDAY, ...;
        System.out.println("Era: " +currentDay.getEra());//Returns the era: either BCE (Before Current Era) and CE (Current Era)

        //Changing the date in a LocalDate object
        LocalDate birthDay = LocalDate.of(1990, 3, 30);
        System.out.println("Add day(s): " +birthDay.plusDays(12));//Adds a specified number of days to the date
        System.out.println("Add week(s): " +birthDay.plusWeeks(12));//Adds weeks to the date
        System.out.println("Add month(s): " +birthDay.plusMonths(12));//Adds months to the date
        System.out.println("Add day(s): " +birthDay.plusYears(12));//Adds years to the date
        System.out.println("Subtract day(s): " +birthDay.minusDays(12));//Subtracts days from the date
        System.out.println("Subtract week(s): " +birthDay.minusWeeks(12));//Subtracts weeks from the date
        System.out.println("Subtract month(s): " +birthDay.minusMonths(12));//Subtracts months from date
        System.out.println("Subtract year(s): " +birthDay.minusYears(12));//Subtracts years from the date
    }
}
