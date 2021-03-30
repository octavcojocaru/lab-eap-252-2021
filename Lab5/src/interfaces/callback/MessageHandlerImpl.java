package interfaces.callback;

public class MessageHandlerImpl implements MessageEventHandler{

    @Override
    public void handleMessage() {
        System.out.println("Received Message!!!");
    }
}
