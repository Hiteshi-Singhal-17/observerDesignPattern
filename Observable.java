// Observable is subject only
public interface Observable{
    public void attach(Observer o) ;
    public void detach(Observer o) ;
    public void notify (Message m);
}