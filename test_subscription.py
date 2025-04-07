import unittest
from datetime import datetime, timedelta
from subscription import Subscription

class TestSubscription(unittest.TestCase):
    def test_renew_subscription(self):
        sub = Subscription(101, "Zoom", "XYZ456", datetime(2025, 3, 1), 365, 120)
        sub.renew(30)
        expected_expiry = datetime(2026, 4, 1)
        self.assertEqual(sub.expiry_date, expected_expiry)

if __name__ == '__main__':
    unittest.main()
