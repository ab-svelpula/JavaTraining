package threads;

public class ThreadJoinMain {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj = new ThreadJoin();
		tj.join();
		Join2 j = new Join2();
		j.join();
		
		
		tj.start();
		j.start();
		
	}

}
