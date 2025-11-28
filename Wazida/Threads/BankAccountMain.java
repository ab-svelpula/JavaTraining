package threads;

public class BankAccountMain {
	public static void main(String[] args) {
		Deposit d = new Deposit();
		Withdraw w = new Withdraw();
		d.start();
		w.start();
		}

}
