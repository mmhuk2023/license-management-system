// File: Reminder.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reminder {
    private Subscription subscription;
    private int daysBefore;

    public Reminder(Subscription subscription, int daysBefore) {
        this.subscription = subscription;
        this.daysBefore = daysBefore;
    }

    public void sendReminder() {
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), subscription.getExpiryDate());
        if (daysLeft <= daysBefore) {
            System.out.println("Reminder: Your " + subscription.getSoftwareName() + " license will expire in " + daysLeft + " days.");
        }
    }
}
