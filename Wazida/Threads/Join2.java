package threads;

public class Join2 extends Thread{
	public void run()
	{
		int i;
		for( i=0;i<=5;i++)
		{
			i=i+1;
			
		}
		System.out.println("Total of first 5 numbers is "+i);
	}

}
