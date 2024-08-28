package DateUnixTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClassDemo {
    public static void main(String[] args) {
        //Creating a calendar object with any date
        Calendar gregorianCalendar = new GregorianCalendar(1990, 02, 30);
        System.out.println(gregorianCalendar.getTime());

        //Creating a Calendar object initialized with the current date.
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week: " +day);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Month: " +month);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Year: " +year);
        int era = calendar.get(Calendar.ERA);
        System.out.println("Era: " +era);

        //To change an element of a date, use the set method
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 15);
        calendar.set(Calendar.SECOND, 0);

        System.out.println(calendar.getTime());

        //Constants of the Calendar class
        Calendar birthday = new GregorianCalendar(1990, Calendar.MONTH, 30);
        System.out.println("Birthday: " +birthday.getTime());

        //Changing the date in a Calendar object
        birthday.add(Calendar.DAY_OF_MONTH, 2);//Results in 2 days later date
        System.out.println(birthday.getTime());
        birthday.add(Calendar.DAY_OF_MONTH, -4);//Results in 2 days earlier date
        System.out.println(birthday.getTime());

        //Rolling elements of a date
        //Its signature is just like the add() method, but this method changes only one element of the date, leaving the rest unchanged.
        birthday.roll(Calendar.DAY_OF_MONTH, 2);//Results in 2 days later date
        System.out.println(birthday.getTime());
        birthday.roll(Calendar.DAY_OF_MONTH, -4);//Results in 2 days earlier date
        System.out.println(birthday.getTime());

    }
}
