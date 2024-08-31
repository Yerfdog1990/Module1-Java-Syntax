package DateUnixTime;

import java.time.Instant;

/*
The Instant class in Java is designed for working with time in a way that's more focused on computer processes. Instead of using hours, minutes, and seconds, it deals with seconds, milliseconds, and nanoseconds since January 1, 1970.
The class has two key fields:
    -The number of seconds that have passed since January 1, 1970.
    -The number of nanoseconds within the current second.
This class simplifies the Date class, keeping only what developers typically need. It works in Unix-time (starting from 1970) and is often seen as a more streamlined version of the older Date class.
 */
public class InstantClass {
    public static void main(String[] args) {
        // Get the current timestamp
        Instant timestamp = Instant.now();
        System.out.println("Current timestamp: " + timestamp);

        // Get the number of milliseconds since January 1, 1970
        long millis = timestamp.toEpochMilli();
        System.out.println("Milliseconds since epoch: " + millis);

        // Create a new Instant object using the milliseconds since epoch
        Instant timeFromMillis = Instant.ofEpochMilli(millis);
        System.out.println("Instant from milliseconds: " + timeFromMillis);

        // Create a new Instant object using the seconds since epoch
        long seconds = timestamp.getEpochSecond();
        Instant timeFromSeconds = Instant.ofEpochSecond(seconds);
        System.out.println("Instant from seconds: " + timeFromSeconds);

        // Create a new Instant object using the seconds and nanoseconds since epoch
        int nanos = timestamp.getNano();
        Instant timeFromSecondsAndNanos = Instant.ofEpochSecond(seconds, nanos);
        System.out.println("Instant from seconds and nanoseconds: " + timeFromSecondsAndNanos);

        // Adding 10 seconds to the current timestamp
        Instant plusSeconds = timestamp.plusSeconds(10);
        System.out.println("Timestamp after adding 10 seconds: " + plusSeconds);

        // Subtracting 5 milliseconds from the current timestamp
        Instant minusMillis = timestamp.minusMillis(5);
        System.out.println("Timestamp after subtracting 5 milliseconds: " + minusMillis);

        // Adding 500 nanoseconds to the current timestamp
        Instant plusNanos = timestamp.plusNanos(500);
        System.out.println("Timestamp after adding 500 nanoseconds: " + plusNanos);
    }
}
