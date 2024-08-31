package DateUnixTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // Using a predefined DateTimeFormatter with SHORT FormatStyle for date
        DateTimeFormatter shortDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Short Date: " + LocalDateTime.now().format(shortDateFormatter));

        // Using a predefined DateTimeFormatter with SHORT FormatStyle for time
        DateTimeFormatter shortTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("Short Time: " + LocalDateTime.now().format(shortTimeFormatter));

        // BASIC_ISO_DATE - Basic ISO date
        System.out.println("Basic ISO Date: " + date.format(DateTimeFormatter.BASIC_ISO_DATE));

        // ISO_LOCAL_DATE - ISO Local Date
        System.out.println("ISO Local Date: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));

        // ISO_OFFSET_DATE - ISO Date with offset
        System.out.println("ISO Offset Date: " + zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE));

        // ISO_DATE - ISO Date with or without offset
        System.out.println("ISO Date: " + zonedDateTime.format(DateTimeFormatter.ISO_DATE));

        // ISO_LOCAL_TIME - Time without offset
        System.out.println("ISO Local Time: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));

        // ISO_OFFSET_TIME - Time with offset
        System.out.println("ISO Offset Time: " + zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_TIME));

        // ISO_TIME - Time with or without offset
        System.out.println("ISO Time: " + zonedDateTime.format(DateTimeFormatter.ISO_TIME));

        // ISO_LOCAL_DATE_TIME - ISO Local Date and Time
        System.out.println("ISO Local DateTime: " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // ISO_OFFSET_DATE_TIME - Date Time with Offset
        System.out.println("ISO Offset DateTime: " + zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        // ISO_ZONED_DATE_TIME - Zoned Date Time
        System.out.println("ISO Zoned DateTime: " + zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        // ISO_DATE_TIME - Date and time with ZoneId
        System.out.println("ISO DateTime: " + zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        // ISO_ORDINAL_DATE - Year and day of year
        System.out.println("ISO Ordinal Date: " + date.format(DateTimeFormatter.ISO_ORDINAL_DATE));

        // ISO_WEEK_DATE - Year and Week
        System.out.println("ISO Week Date: " + date.format(DateTimeFormatter.ISO_WEEK_DATE));

        // ISO_INSTANT - Date and Time of an Instant
        System.out.println("ISO Instant: " + zonedDateTime.format(DateTimeFormatter.ISO_INSTANT));

        // RFC_1123_DATE_TIME - RFC 1123 / RFC 822
        System.out.println("RFC 1123 DateTime: " + zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }
}
