package threads;

public class Sender 
extends Thread {
    private ChatSimulation chat;

    public Sender(ChatSimulation chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        String[] messages = {"Hi!", "How are you?", "What are you doing?", "Let's meet soon.", "Bye!"};
        for (String msg : messages) {
            chat.sendMessage(msg);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
