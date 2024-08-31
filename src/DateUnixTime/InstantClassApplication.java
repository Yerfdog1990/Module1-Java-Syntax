package DateUnixTime;

import java.time.Duration;
import java.time.Instant;

/*
The Instant class is particularly useful in programming when dealing with precise timestamps or time intervals, especially in systems where time accuracy and consistency are crucial.
Here are some situations where a programmer might find Instant necessary:
 */
public class InstantClassApplication {
    public static void main(String[] args) {
        // 1. System Events and Logging
        Instant eventTime = Instant.now();
        System.out.println("Event occurred at: " + eventTime);

        // Simulate some delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Time Comparisons
        Instant startTime = Instant.now();
        // Perform some task (simulated with sleep)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Task duration: " + duration.toMillis() + " milliseconds");

        // 3. Scheduling and Delayed Execution
        Instant futureTime = Instant.now().plusSeconds(30);
        System.out.println("Scheduled task will execute at: " + futureTime);

        // 4. Data Storage and Interoperability
        Instant purchaseTime = Instant.now();
        System.out.println("Purchase time recorded as: " + purchaseTime);
        // Store 'purchaseTime' in the database (simulated here by printing it)

        // 5. Precision Timing in Distributed Systems (simulated with logging)
        Instant distributedEvent = Instant.now();
        System.out.println("Distributed system event logged at: " + distributedEvent);

        // 7. Benchmarking and Performance Measurement
        Instant benchmarkStart = Instant.now();
        // Code to benchmark (simulated with sleep)
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant benchmarkEnd = Instant.now();
        System.out.println("Operation took: " + Duration.between(benchmarkStart, benchmarkEnd).toNanos() + " nanoseconds");
    }
}
