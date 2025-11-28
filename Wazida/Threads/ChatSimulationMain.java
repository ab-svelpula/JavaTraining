package threads;

public class ChatSimulationMain {
	public static void main(String[] args) {

ChatSimulation chat = new ChatSimulation();
        Sender sender = new Sender(chat);
        Receiver receiver = new Receiver(chat);

        sender.start();
        receiver.start();

	}

}
