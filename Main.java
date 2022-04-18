public class Main {
    public static void main(String[] args) {
        SubscriberOne s1 = new SubscriberOne();
        SubscriberTwo s2 = new SubscriberTwo();
        SubscriberThree s3 = new SubscriberThree();
         
        Publisher p = new Publisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notify(new Message("I met head of maasai tribe"));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notify(new Message("Reading Shoe Dog")); //s2 and s3 will receive the update
    }
}
