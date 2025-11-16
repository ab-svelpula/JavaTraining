package inheritance_encapsulation;

public class BankAccountMain {
	public static void main (String[] args)
	{
		SavingsAccount sa = new SavingsAccount("wazida", 1000, 500);
        sa.deposit(200);
        sa.withdraw(400); // Allowed
        sa.withdraw(400); // Blocked due to min balance
        sa.displayBalance();

        CurrentAccount ca = new CurrentAccount("javid", 500, 1000);
        ca.deposit(300);
        ca.withdraw(1200); // Allowed within overdraft
        ca.withdraw(700);  // Blocked: exceeds overdraft
        ca.displayBalance();
		
	}

}
