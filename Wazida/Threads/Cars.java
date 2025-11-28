package threads;

public class Cars extends Thread{
	public void run()
	{
		System.out.println("Running car is "+currentThread().getName()+
				" And it's priority is "+currentThread().getPriority());
	}

}
