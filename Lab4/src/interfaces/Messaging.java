package interfaces;

public interface Messaging {

    void sendMessage(String message);

    default String appendMessages(String... messages) { // static and public
        return String.join(", ", messages);
    }

}
