package threads;

public class MyThread extends Thread{
	public void run()
	{
		for (int i=0;i<5;i++)
			System.out.println("Creating and starting the Thread using thread class");
	}
	

}
