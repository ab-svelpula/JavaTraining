package threads;

public class Producer 
extends Thread {
    private MessageBox box;

    public Producer(MessageBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "How are you?", "Working on threads", "Almost done", "Bye"};
        for (String msg : messages) {
            box.putMessage(msg);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

