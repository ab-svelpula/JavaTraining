package threads;

public class DaemonThread extends Thread{
	public void run()
	{
		while(true) {
			System.out.println("Saving background data…");	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
