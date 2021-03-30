package interfaces.callback;

public class CallbackMain {

    public static void main(String[] args) {
        MessageReceiver messageReceiver = new MessageReceiver();
        MessageEventHandler messageEventHandler = new MessageHandlerImpl();

        messageReceiver.onMessageReceived(messageEventHandler);


        messageReceiver.onMessageReceived(new MessageEventHandler() { // clasa anonima
            @Override
            public void handleMessage() {
                System.out.println("New message from anonymous class");
            }
        });

    }
}
