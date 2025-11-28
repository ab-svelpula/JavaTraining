package threads;

public class CarsMain {
	public static void main(String[] args) {
		Cars c = new Cars();
		Cars c1 = new Cars();
		Cars c2 = new Cars();
		
		c.setPriority(Thread.NORM_PRIORITY);
		c1.setPriority(Thread.MAX_PRIORITY);
		c2.setPriority(Thread.MIN_PRIORITY);
		
		c.start();
		c1.start();
		c2.start();
	}

}
