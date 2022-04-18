// All other objects that want to track changes to the publisher’s state are called subscribers or observers
// Following are observers:
// SubscriberOne
// SubscriberTwo
// SubscriberThree

public interface Observer {
    public void update(Message m) ;
}
