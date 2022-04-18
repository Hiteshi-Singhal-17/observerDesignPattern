public class SubscriberThree implements Observer{
    @Override
    public void update(Message m) {
                System.out.println("Message Subsriber Three:: "+m.getMessageContent());
    }
}
