package DateUnixTime;

import java.time.LocalTime;

/*
LocalTime class
-The LocalTime class was created for cases where you need to work with time but without a date. For example, suppose you're writing an alarm clock application. You care about the time, but not the date.
-The LocalTime class is very similar to the LocalDate class — its objects similarly cannot be changed after creation.
 */
public class LocalTimeClass {
    public static void main(String[] args) {
        //Getting the current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " +now);

        //Getting a specific time
        LocalTime specificTime = LocalTime.of(12, 45, 54, 672);
        System.out.println("Specific time: " +specificTime);

        //Getting a time based on the index of a second
        LocalTime seconds = LocalTime.ofSecondOfDay(450);
        System.out.println("Number of seconds elapsed: " +seconds);

        //Getting elements of time
        System.out.println("Hour:" +now.getHour());//Returns the hours
        System.out.println("Minutes:" +now.getMinute());//Returns the minutes
        System.out.println("Seconds:" +now.getSecond());//Returns the seconds
        System.out.println("Nanoseconds:" +now.getNano());//Returns the nanoseconds

        //Changing the time in a LocalTime object
        System.out.println("Add hour(s): " +now.plusHours(1));//Adds hours
        System.out.println("Add minute(s): " +now.plusMinutes(10));//Adds minutes
        System.out.println("Add second(s): " +now.plusSeconds(100));//Adds seconds
        System.out.println("Add nanosecond(s): " +now.plusNanos(1000));//Adds nanoseconds
        System.out.println("Subtract hour(s): " +now.minusHours(2));//Subtracts hours
        System.out.println("Subtract minutes): " +now.minusMinutes(20));//Subtracts minutes
        System.out.println("Subtract second(s): " +now.minusSeconds(200));//Subtracts seconds
        System.out.println("Subtract nanosecond(s): " +now.minusNanos(2000));//Subtracts nanoseconds

        //Supported time
        LocalTime timeMax = LocalTime.MAX;//Maximum supported time
        System.out.println("Maximum time: " +timeMax);
        LocalTime timeMin = LocalTime.MIN;//Minimum supported time
        System.out.println("Minimum time: " +timeMin);
        LocalTime timeMidnight = LocalTime.MIDNIGHT;//Midnight time at the start of the day
        System.out.println("Midnight time: " +timeMidnight);
    }
}
