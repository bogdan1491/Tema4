public abstract class Phone implements MobilePhone {
    private String color;
    private String material;

    public Phone() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public abstract void addContact(String id, String phoneNumber, String firstName, String lastName);

    @Override
    public abstract void listContacts();

    @Override
    public abstract void sendMessage(String phoneNumber, String messageContent);

    @Override
    public abstract Message listMessages(String phoneNumber);

    @Override
    public abstract void call(String phoneNumber);

    @Override
    public abstract void viewHistory();

    @Override
    public abstract double getBatteryLife();


}
