package com.masai;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class ContinuousCountdownTo2023 {
    public static void main(String[] args) {
        // Define the end date and time (December 31, 2023, 23:59:59)
        LocalDateTime endDate = LocalDateTime.of(2023, Month.DECEMBER, 31, 23, 59, 59);

        while (true) {
            // Get the current date and time
            LocalDateTime now = LocalDateTime.now();

            // Calculate the duration between the current time and the end time
            Duration duration = Duration.between(now, endDate);

            // Extract days, hours, minutes, and seconds from the duration
            long days = duration.toDays();
            long hours = duration.toHoursPart();
            long minutes = duration.toMinutesPart();
            long seconds = duration.toSecondsPart();

            // Display the countdown
//            System.out.println("Countdown to the end of 2023:");
            System.out.printf("Days: %02d, Hours: %02d, Minutes: %02d, Seconds: %02d%n", days, hours, minutes, seconds);

            try {
                // Sleep for 1 second before updating the countdown
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Break the loop when the end date is reached
            if (now.isAfter(endDate)) {
                System.out.println("Happy New Year!");
                break;
            }
        }
    }
}

