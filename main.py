from user import User
from subscription import Subscription
from reminder import Reminder
from manager import LicenseManager
from datetime import datetime

def main():
    # User setup
    user1 = User(1, "Mosharaf", "mosharaf@example.com", "password123")

    # Subscription setup
    subscription1 = Subscription(
        101, "Microsoft 365", "ABC123",
        datetime(2025, 3, 1), 365, 99.99
    )
    user1.add_subscription(subscription1)

    # Reminder setup
    reminder = Reminder(subscription1, 10)
    reminder_msg = reminder.send_reminder()
    if reminder_msg:
        print(reminder_msg)

    # License Manager setup
    license_manager = LicenseManager()
    license_manager.add_subscription(subscription1)

    # Check expired licenses
    expired_licenses = license_manager.check_expired_licenses()
    print("Expired Licenses:", expired_licenses)

    # List active subscriptions
    active_subs = license_manager.list_active_subscriptions()
    print("Active Subscriptions:", active_subs)

if __name__ == "__main__":
    main()
