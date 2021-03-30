package interfaces;

public class Phone implements InstantMessaging, Calls {

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    @Override
    public void call(String telephoneNumber) {
        if(telephoneNumber == null) {
            System.out.println("Calling: " + EMERGENCY_NUMBER); // EMERGENCY_NUMBER is static field that belongs to Calls interface
        } else {
            System.out.println("Calling: " + telephoneNumber);
        }
    }

    public String handleMessages(String... messages) { //
        return appendMessages(messages);
    }

    @Override
    public void sendInstantMessage() {
        System.out.println("Sending instant messaging");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        String allMessages = phone.handleMessages("message1", "message2", "message3");
        System.out.println(allMessages);

        Calls call = new Phone(); // referire la Phone prin intermediul Interfetei Calls
        call.call("072994355");

    }
}
