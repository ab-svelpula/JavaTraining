package threads;

public class Deposit extends Thread{
	public void run()
	{
		BankAccount ba = new BankAccount();
		ba.deposit(100);
	}
}
