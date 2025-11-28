package threads;

public class Receiver 
extends Thread {
    private ChatSimulation chat;

    public Receiver(ChatSimulation chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        String[] replies = {"Hello!", "I'm good.", "Just working.", "Sure, let's plan.", "Take care!"};
        for (String reply : replies) {
            chat.receiveMessage(reply);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
