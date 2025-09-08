package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Message;

public class DevHandler extends Handler {
    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == Chain_of_Responsibility.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("DevHandler handled the message: " + message.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
