package threads;

public class DaemonThreadMain {

public static void main(String[] args) {
	DaemonThread dt = new DaemonThread();
        dt.setDaemon(true); // Set as daemon thread
        dt.start();

        System.out.println("Main thread running for 5 seconds...");
        try {
            Thread.sleep(5000); // Main thread runs for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread finished. Daemon thread will stop automatically.");
    }

	

}
