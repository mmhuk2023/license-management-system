from datetime import datetime, timedelta

class Subscription:
    def __init__(self, sub_id, software_name, license_key, start_date, duration, price):
        self.sub_id = sub_id
        self.software_name = software_name
        self.license_key = license_key
        self.start_date = start_date
        self.expiry_date = start_date + timedelta(days=duration)
        self.price = price
        self.renewal_history = []

    def renew(self, duration):
        if self.expiry_date < datetime.now():
            self.expiry_date = datetime.now() + timedelta(days=duration)
        else:
            self.expiry_date += timedelta(days=duration)
        self.renewal_history.append((datetime.now(), duration))

