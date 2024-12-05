package DateUnixTime;

import java.util.Calendar;
import java.util.Date;

public class BirthDay {
    public static void main(String[] args) {
        Date birthDate = new Date(90, Calendar.MARCH, 30);
        System.out.println("Day of birth: " +getDayOfWeek(birthDate));
    }
    static String getDayOfWeek(Date date){
        int day = date.getDay();
        String dayName = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid day of the week: " +day);
        };
        return dayName;
    }
}
