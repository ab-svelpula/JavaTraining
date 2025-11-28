package threads;

public class Counter {

private int count = 0;

    // Synchronized method to prevent race condition
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


}
