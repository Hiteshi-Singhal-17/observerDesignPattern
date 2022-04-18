public class SubscriberTwo implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Message Subsriber Two:: "+m.getMessageContent());
    }
    
}
