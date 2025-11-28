package threads;

public class Consumer extends Thread {
    private MessageBox box;

    public Consumer(MessageBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            box.getMessage();
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
