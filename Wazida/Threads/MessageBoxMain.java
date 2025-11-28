package threads;

public class MessageBoxMain {
	public static void main(String[] args) {

       MessageBox mb = new MessageBox();
        Producer p = new Producer(mb);
        Consumer c = new Consumer(mb);

        p.start();
        c.start();

		
	}

}
