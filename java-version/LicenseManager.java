// File: LicenseManager.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LicenseManager {
    private List<Subscription> subscriptions;

    public LicenseManager() {
        subscriptions = new ArrayList<>();
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void checkExpiredLicenses() {
        for (Subscription sub : subscriptions) {
            if (sub.getExpiryDate().isBefore(LocalDate.now())) {
                System.out.println("Subscription for " + sub.getSoftwareName() + " has expired!");
            }
        }
    }

    public void listActiveSubscriptions() {
        for (Subscription sub : subscriptions) {
            if (!sub.getExpiryDate().isBefore(LocalDate.now())) {
                System.out.println("Active Subscription: " + sub.getSoftwareName());
            }
        }
    }
}
