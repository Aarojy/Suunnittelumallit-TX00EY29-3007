package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Message;

public class Compensation_handler extends Handler {
    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == Chain_of_Responsibility.MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation_handler handled the message: " + message.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
