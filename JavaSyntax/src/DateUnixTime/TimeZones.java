package DateUnixTime;

import java.time.*;

public class TimeZones {
    public static void main(String[] args) {
        // Get a list of all available zone IDs
        int i = 1;
        for(String zoneID : ZoneId.getAvailableZoneIds()){
            System.out.println("Zone ID " +i+ ": " +zoneID);
            i++;
        }
        System.out.println("**************************************************");
        //Get a ZoneId object by its name
        ZoneId zone = ZoneId.of("Africa/Nairobi");
        System.out.println("Zone ID: " +zone);

        //Creating a ZonedDateTime object
        ZoneId zoneTime = ZoneId.of("Africa/Nairobi");
        System.out.println("Nairobi time: " +ZonedDateTime.now(zoneTime));
        System.out.println("Bangkok time: " +ZonedDateTime.now());

        //Converting a global date to a local one
        ZoneId zoneId = ZoneId.of("Africa/Nairobi");
        ZonedDateTime nairobiNow = ZonedDateTime.now(zoneId);

        LocalDate localDate = nairobiNow.toLocalDate();
        System.out.println("Local date: " +localDate);
        LocalTime localTime = nairobiNow.toLocalTime();
        System.out.println("Local time: " +localTime);
        LocalDateTime localDateTime = nairobiNow.toLocalDateTime();
        System.out.println("Local date & time: " +localDateTime);

        //Working with time
        //Getting elements of a date
        ZonedDateTime currentDay = ZonedDateTime.now();
        System.out.println("Year: " +currentDay.getYear());//Returns the year of a specific date
        System.out.println("Month: " +currentDay.getMonth());//Returns the date's month: one of several constants. E.g: JANUARY, FEBRUARY, ...;
        System.out.println("Month value: " +currentDay.getMonthValue());//Returns the index of the date's month. January == 1.
        System.out.println("Day of the Month: " +currentDay.getDayOfMonth());//Returns the index of the day of the month
        System.out.println("Day of the year: " +currentDay.getDayOfYear());//Returns the day's index from the beginning of the year
        System.out.println("Day of the week: " +currentDay.getDayOfWeek());//Returns the day of the week: one of several constants. E.g: MONDAY, TUESDAY, ...;
        System.out.println("Month value: " +currentDay.getMonthValue());//Returns the index of the date's month. January == 1

        //Changing the date in a LocalDate object
        System.out.println("Add day(s): " +currentDay.plusDays(12));//Adds a specified number of days to the date
        System.out.println("Add week(s): " +currentDay.plusWeeks(12));//Adds weeks to the date
        System.out.println("Add month(s): " +currentDay.plusMonths(12));//Adds months to the date
        System.out.println("Add day(s): " +currentDay.plusYears(12));//Adds years to the date
        System.out.println("Subtract day(s): " +currentDay.minusDays(12));//Subtracts days from the date
        System.out.println("Subtract week(s): " +currentDay.minusWeeks(12));//Subtracts weeks from the date
        System.out.println("Subtract month(s): " +currentDay.minusMonths(12));//Subtracts months from date
        System.out.println("Subtract year(s): " +currentDay.minusYears(12));//Subtracts years from the date
    }
}
