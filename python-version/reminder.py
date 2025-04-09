from datetime import datetime

class Reminder:
    def __init__(self, subscription, days_before):
        self.subscription = subscription
        self.days_before = days_before

    def send_reminder(self):
        remaining_days = (self.subscription.expiry_date - datetime.now()).days
        if remaining_days <= self.days_before:
            return f"Reminder: Your {self.subscription.software_name} license expires in {remaining_days} days."
        return None
