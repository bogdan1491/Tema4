public interface MobilePhone {

    void addContact(String id, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNumber, String messageContent);

    Message listMessages(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();

    double getBatteryLife();
}
