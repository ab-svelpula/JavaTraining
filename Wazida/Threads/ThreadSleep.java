package threads;

public class ThreadSleep extends Thread{
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=5;i++) {
			System.out.println("Number is "+i);
			Thread.sleep(1000);
		}
			
		
	}

}
