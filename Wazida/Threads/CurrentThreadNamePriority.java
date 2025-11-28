package threads;

public class CurrentThreadNamePriority extends Thread{
	public void run()
	{
		System.out.println("Running "+Thread.currentThread() + "Priority "
	+Thread.currentThread().getPriority());
		
	}

}
