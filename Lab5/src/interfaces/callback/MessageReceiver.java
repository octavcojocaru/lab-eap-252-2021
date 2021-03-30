package interfaces.callback;

public class MessageReceiver {

    public void onMessageReceived(MessageEventHandler messageEventHandler) {
        messageEventHandler.handleMessage(); // delegam metoda interfetei
    }
}
