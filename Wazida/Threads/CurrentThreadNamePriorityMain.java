package threads;

public class CurrentThreadNamePriorityMain {
	public static void main(String[] args) {
		CurrentThreadNamePriority c = new CurrentThreadNamePriority();
		CurrentThreadNamePriority c1 = new CurrentThreadNamePriority();
		
		c.setPriority(Thread.MIN_PRIORITY);
		c1.setPriority(Thread.MAX_PRIORITY);
		
		c.start();
		c1.start();
	}

}
