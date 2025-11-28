package threads;

public class MyRunnableMain {
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		
		Thread t = new Thread(mt);
		t.start();
	}

}
