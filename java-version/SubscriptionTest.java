// File: SubscriptionTest.java
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

public class SubscriptionTest {
    @Test
    public void testRenewSubscription() {
        Subscription sub = new Subscription(101, "Zoom", "XYZ456", LocalDate.of(2024, 4, 1), 30, 120.00);
        sub.renew(10);
        LocalDate expected = LocalDate.of(2024, 5, 11);
        assertEquals(expected, sub.getExpiryDate());
    }
}