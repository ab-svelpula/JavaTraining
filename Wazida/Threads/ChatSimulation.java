package threads;

public class ChatSimulation extends Thread
{

private boolean senderTurn = true;

    public synchronized void sendMessage(String message) {
        while (!senderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + message);
        senderTurn = false;
        notify();
    }

    public synchronized void receiveMessage(String message) {
        while (senderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + message);
        senderTurn = true;
        notify();
    }
}

	
