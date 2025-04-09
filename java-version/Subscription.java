// File: Subscription.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Subscription {
    private int subId;
    private String softwareName;
    private String licenseKey;
    private LocalDate startDate;
    private LocalDate expiryDate;
    private double price;
    private List<String> renewalHistory;

    public Subscription(int subId, String softwareName, String licenseKey, LocalDate startDate, int durationDays, double price) {
        this.subId = subId;
        this.softwareName = softwareName;
        this.licenseKey = licenseKey;
        this.startDate = startDate;
        this.expiryDate = startDate.plusDays(durationDays);
        this.price = price;
        this.renewalHistory = new ArrayList<>();
    }

    public void renew(int additionalDays) {
        renewalHistory.add("Renewed on " + LocalDate.now() + " for " + additionalDays + " days");
        expiryDate = expiryDate.plusDays(additionalDays);
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getSoftwareName() {
        return softwareName;
    }
}
