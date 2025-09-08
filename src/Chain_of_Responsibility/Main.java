package Chain_of_Responsibility;

import Chain_of_Responsibility.Handlers.Compensation_handler;
import Chain_of_Responsibility.Handlers.ContactHandler;
import Chain_of_Responsibility.Handlers.DevHandler;
import Chain_of_Responsibility.Handlers.FeedbackHandler;

public class Main {
    public static void main(String[] args) {
        Message message1 = new Message(MessageType.COMPENSATION_CLAIM, "This is a compensation claim", "a.a@gmail.com");
        Message message2 = new Message(MessageType.CONTACT_REQUEST, "This is a contact request", "b.b@gmail.com");
        Message message3 = new Message(MessageType.DEVELOPMENT_SUGGESTION, "This is a development suggestion", "c.c@gmail.com");
        Message message4 = new Message(MessageType.GENERAL_FEEDBACK, "This is a general feedback", "d.d@gmail.com");

        Handler handler1 = new Compensation_handler();
        Handler handler2 = new ContactHandler();
        Handler handler3 = new DevHandler();
        Handler handler4 = new FeedbackHandler();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler4);

        handler1.handleRequest(message1);
        handler1.handleRequest(message2);
        handler1.handleRequest(message3);
        handler1.handleRequest(message4);
    }
}
