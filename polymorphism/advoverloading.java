public class advoverloading{
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();
        app.testMethods();
    }
}
 
class Notifier {

    public void send(String message) {
        System.out.println("General Notification: " + message);
    }

    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phone) {
        System.out.println("SMS sent to " + phone + ": " + message);
    }

    private void send(String message, String email, long phone) {
        System.out.println("Internal Notification: " + message);
    }


    public void accessPrivate(String msg, String email, long phone) {
        send(msg, email, phone); 
    }
}
class AppNotifier extends Notifier {

    public void testMethods() {

        send("Hello User");
        send("Hello via Email", "user@gmail.com");
        send("Hello via SMS", 9876543210L);

        accessPrivate("Secret Message", "user@gmail.com", 9876543210L);
    }
}
