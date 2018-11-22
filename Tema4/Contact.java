public class Contact {
    private String id;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(String id, String phoneNumber, String firstName, String lastName) {

        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInfo() {
        return "Id: " + id +
                " Phone number: " + phoneNumber +
                " First Name: " + firstName +
                " Last Name: " + lastName;
    }

}
