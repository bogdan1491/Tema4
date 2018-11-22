import java.util.ArrayList;
import java.util.List;

public class SamsungGalaxy6 extends Samsung {
    private final double batteryLife = 30;
    private double tempBatteryLife = batteryLife;
    private final String imei = "255214698785214";
    private List<Contact> contactListSix = new ArrayList<>();
    private List<Message> messageListSix = new ArrayList<>();
    private List<Call> callListSix = new ArrayList<>();

    public SamsungGalaxy6() {
        setColor("Black");
        setMaterial("Glass");
    }

    @Override
    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        contactListSix.add(new Contact(id, phoneNumber, firstName, lastName));
    }

    @Override
    public void listContacts() {
        System.out.println("Your contacts are: ");
        for (Contact c : contactListSix) {
            System.out.println(c.getInfo());
        }
        System.out.println("___________________________________________________________________");
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if (tempBatteryLife >= 1) {
            tempBatteryLife -= 1;
            int maxLenght = 100;
            if (messageContent.length() > maxLenght) {
                System.out.println("The maximum number of characters in a message should be 100");
                messageContent = messageContent.substring(0, maxLenght);
            }
            messageListSix.add(new Message(phoneNumber, messageContent));
        } else {
            System.out.println("You don't have enough battery to send the message");
        }
    }


    @Override
    public Message listMessages(String phoneNumber) {
        System.out.println("Your messages are: ");
        Message result = null;
        for (Message sms : messageListSix) {
            if (sms.getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
                result = sms;
                System.out.println(sms.getMessageContent());
            }
            System.out.println("___________________________________________________________________");
        }

        return result;

    }

    @Override
    public void call(String phoneNumber) {
        if (tempBatteryLife >= 2) {
            tempBatteryLife -= 2;
            callListSix.add(new Call(phoneNumber));
        } else {
            System.out.println("You don't have enough battery to make this call");
        }
    }


    @Override
    public void viewHistory() {
        System.out.println("\nYour call history is: ");
        for (Call c1 : callListSix) {
            System.out.println(c1.getCalls());
        }
        System.out.println("___________________________________________________________________");
    }

    public double getBatteryLife() {
        return tempBatteryLife;
    }

    @Override
    public String toString() {
        return getColor() + getMaterial();
    }
}


