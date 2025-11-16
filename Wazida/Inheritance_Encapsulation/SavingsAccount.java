package inheritance_encapsulation;

public class SavingsAccount extends BankAccount{
	 private double minBalance;

	    public SavingsAccount(String accountNumber, double balance, double minBalance) {
	        super(accountNumber, balance);
	        this.minBalance = minBalance;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= minBalance) {
	            balance -= amount;
	            System.out.println("Savings Withdrawn: " + amount + ", Remaining Balance: " + balance);
	        } else {
	            System.out.println("Cannot withdraw: Minimum balance requirement not met.");
	        }
	    }

}
