public class Main {

    public static void main(String[] args) {
        Phone phone = new SamsungGalaxy6();

        phone.addContact("1", "0745879512", "John", "Nickelback");
        phone.addContact("2", "0745896325", "Ronald", "McGonagall");
        phone.listContacts();

        // send a message to the first contact from the previous listed
        // max number of characters - 100
        phone.sendMessage("0745879512", "Please stop by the supermarket and buy some bread !");
        phone.listMessages("0745879512");


        // send a message to the second contact from the previous listed
        phone.call("0745896325");
        phone.viewHistory();

        System.out.println("Battery life: " + phone.getBatteryLife());
        System.out.println("Color: " + phone.getColor());
        System.out.println("Material: " + phone.getMaterial());
    }

}
