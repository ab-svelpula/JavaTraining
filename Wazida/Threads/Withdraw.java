package threads;

public class Withdraw extends Thread{
	public void run()
	{
		BankAccount ba = new BankAccount();
		ba.withdraw(50);
	}

}
