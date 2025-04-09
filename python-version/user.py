class User:
    def __init__(self, user_id, name, email, password):
        self.__user_id = user_id
        self.__name = name
        self.__email = email
        self.__password = password
        self.subscriptions = []

    def add_subscription(self, subscription):
        self.subscriptions.append(subscription)

    def get_user_id(self):
        return self.__user_id

    def get_email(self):
        return self.__email

    def set_email(self, new_email):
        self.__email = new_email
