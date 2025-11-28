package threads;

public class File1 extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread()+"File  is downloading");	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
