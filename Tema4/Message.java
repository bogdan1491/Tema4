import java.util.Objects;

public class Message {
    private String phoneNumber;
    private String messageContent;

    public Message(String phoneNumber, String messageContent) {
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessageContent() {
        return messageContent;
    }


}
