package threads;

public class DownloadFile {
	public static void main(String[] args) throws InterruptedException {
		File1 f1 = new File1();
		File1 f2 = new File1();
		File1 f3 = new File1();
		
		f1.start();
		f2.start();
		f3.start();
	}

}
