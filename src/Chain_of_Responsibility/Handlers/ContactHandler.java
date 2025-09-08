package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Message;

public class ContactHandler extends Handler {
    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == Chain_of_Responsibility.MessageType.CONTACT_REQUEST) {
            System.out.println("ContactHandler handled the message: " + message.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
