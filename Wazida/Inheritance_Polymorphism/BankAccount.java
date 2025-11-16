package inheritance_encapsulation;

public class BankAccount{
	    protected String accountNumber;
	    protected double balance;

	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
	    }
}
