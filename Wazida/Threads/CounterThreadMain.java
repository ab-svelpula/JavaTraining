package threads;

public class CounterThreadMain {
	public static void main(String[] args) {

Counter counter = new Counter();

        // Two threads incrementing the same counter
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final count
        System.out.println("Final Count: " + counter.getCount());
    }

	}

