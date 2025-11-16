package inheritance_encapsulation;

public class CurrentAccount extends BankAccount{
	private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

}
