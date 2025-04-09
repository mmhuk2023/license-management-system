from datetime import datetime

class LicenseManager:
    def __init__(self):
        self.subscriptions = []

    def add_subscription(self, subscription):
        self.subscriptions.append(subscription)

    def check_expired_licenses(self):
        expired = [sub.software_name for sub in self.subscriptions if sub.expiry_date < datetime.now()]
        return expired if expired else "No expired subscriptions."

    def list_active_subscriptions(self):
        active = [sub.software_name for sub in self.subscriptions if sub.expiry_date >= datetime.now()]
        return active
