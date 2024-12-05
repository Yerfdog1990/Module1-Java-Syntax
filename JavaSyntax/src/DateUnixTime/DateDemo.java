package DateUnixTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //Displaying the current date on the screen
        Date current = new Date();
        System.out.println("Current date: " +current);
        //Setting a specific date
        Date birthday = new Date(90, 2, 30);
        System.out.println("My birthday is: " + birthday);
        //Setting a specific time
        Date setTime = new Date(124, 4, 23, 23, 55, 00);
        System.out.println("Deadline for submitting assignments at UoPeople: " +setTime);
        //Working with elements of a date
       
        // Get the year of the date (relative to 1900)
        int year = current.getYear() + 1900; // add 1900 to get the actual year
        System.out.println("Year: " + year);

        // Get the month of the date (0-based index, January = 0)
        int month = current.getMonth();
        System.out.println("Month: " + (month + 1)); // add 1 to get the 1-based month

        // Get the day of the month
        int dayOfMonth = current.getDate();
        System.out.println("Day of the Month: " + dayOfMonth);

        // Get the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int dayOfWeek = current.getDay();
        System.out.println("Day of the Week: " + dayOfWeek);

        // Get the hours of the date (24-hour format)
        int hours = current.getHours();
        System.out.println("Hours: " + hours);

        // Get the minutes of the date
        int minutes = current.getMinutes();
        System.out.println("Minutes: " + minutes);

        // Get the seconds of the date
        int seconds = current.getSeconds();
        System.out.println("Seconds: " + seconds);
        current.setYear(2030 - 1900); // 2024 - 1900 = 124
        System.out.println("After setting year to 2024: " + current);

        // Change the month to March (note: setMonth uses 0-based index)
        current.setMonth(2); // March is the 3rd month, so setMonth(2) for March
        System.out.println("After setting month to March: " + current);

        // Change the day of the month to the 15th
        current.setDate(15);
        System.out.println("After setting date to 15th: " + current);

        // Change the hours to 10 AM
        current.setHours(10);
        System.out.println("After setting hours to 10 AM: " + current);

        // Change the minutes to 30
        current.setMinutes(30);
        System.out.println("After setting minutes to 30: " + current);

        // Change the seconds to 45
        current.setSeconds(45);
        System.out.println("After setting seconds to 45: " + current);

        //Milliseconds - Returns the number of milliseconds that have elapsed since January 1, 1970
        Long time = current.getTime();
        System.out.println("Milliseconds: " +time);

        //Comparing dates
        System.out.println(birthday.getTime() < current.getTime());//true
        System.out.println(birthday.getTime() > current.getTime());//false
        System.out.println(birthday.after(current));//false
        System.out.println(birthday.before(current));//true
        System.out.println(current.compareTo(birthday));//If birthday represents a future date compared to current, the method will return a positive integer.
        System.out.println(current.compareTo(current));//If both current and current represent the exact same date and time, compareTo() will return 0.
        System.out.println(birthday.compareTo(current));//If birthday represents August 25, 2000, and current represents the current date (let's say it's August 25, 2024), then birthday.compareTo(current) will return a negative integer because the birthday is earlier than current.

        //Date format
        Date currentDate = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM-dd-YYYY");//Lowercase "dd" show day of the month
        System.out.println("Date format with day of the month: " +dateFormat1.format(currentDate));
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM-DD-YYYY");//Upper case "DD" shows day of the year
        System.out.println("Date format with day of the year: " +dateFormat2.format(currentDate));
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("MM-dd-YYYY");//Only two letters "MM" shows month as numbers instead of words.
        System.out.println("Date format with month as numbers: " +dateFormat3.format(currentDate));

        //Date.parse method - The Date class can do something else interesting and useful — it can get a date from a string. Or, as programmers say, it can parse a string.
        Date date = new Date();
        date.setTime(Date.parse("Jul 06 12:15:00 2019"));
        System.out.println(date);

        //Using calendar class
        Date birthDate = new Date(90, Calendar.MARCH, 30);
        System.out.println(birthDate);
   }
}
