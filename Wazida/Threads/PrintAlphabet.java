package threads;

public class PrintAlphabet extends Thread {
	public void run()
	{
		for(char ch ='A';ch<'Z';ch++)
			System.out.println("Letter is "+ch);
	}

}
