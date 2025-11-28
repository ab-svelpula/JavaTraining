package threads;

public class MessageBox {

private String message;
    private boolean hasMessage = false;

    public synchronized void putMessage(String msg) {
        while (hasMessage) { // Wait if message is not yet consumed
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message = msg;
        hasMessage = true;
        System.out.println("Producer: " + msg);
        notify(); // Notify consumer
    }

    public synchronized String getMessage() {
        while (!hasMessage) { // Wait if no message to consume
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer: " + message);
        hasMessage = false;
        notify(); // Notify producer
        return message;
    }
}

