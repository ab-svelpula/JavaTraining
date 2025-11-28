package threads;

public class BankAccount {
	int total;
	public void deposit(int balance)
	{
		System.out.println("Balance before desposit "+balance);
		balance = balance + total;
		System.out.println("Balance after deposit is "+balance);
	}
	public void withdraw(int balance)
	{
		System.out.println("Balance before withdraw "+balance);
		balance = balance- total;
		System.out.println("Balance after withdraw is "+total);
	}
}
