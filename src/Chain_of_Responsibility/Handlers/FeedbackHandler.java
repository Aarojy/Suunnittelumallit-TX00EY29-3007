package Chain_of_Responsibility.Handlers;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Message;
import Chain_of_Responsibility.MessageType;

public class FeedbackHandler extends Handler {
    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("FeedbackHandler handled the message: " + message.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
