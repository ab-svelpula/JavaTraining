package threads;

public class PrintNumber extends Thread{
	public void run()
	{
		for(int i =0;i<=10;i++)
			System.out.println("Number is "+i);
	}

}
