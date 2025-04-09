// File: Main.java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Mosharaf", "mosharaf@example.com", "password123");

        Subscription sub1 = new Subscription(101, "Microsoft 365", "ABC123", LocalDate.of(2024, 4, 1), 30, 99.99);
        user1.addSubscription(sub1);

        LicenseManager manager = new LicenseManager();
        manager.addSubscription(sub1);

        Reminder reminder = new Reminder(sub1, 10);
        reminder.sendReminder();

        manager.checkExpiredLicenses();
        manager.listActiveSubscriptions();
    }
}
