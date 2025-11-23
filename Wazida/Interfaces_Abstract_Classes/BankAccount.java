package interfaces_abstract_classes;

public abstract class BankAccount {
	String accountNumber;
	String AccountHolder;
	double balance;
	void deposit(double amount)
	{
		amount = amount + balance;
		System.out.println("Deposited amount is "+amount);
	}
	public abstract void calculateInterest();

}
