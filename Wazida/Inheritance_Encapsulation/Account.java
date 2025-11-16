package inheritance_encapsulation;

public class Account {
	double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    public double calculateInterest() {
        // Default interest logic (can be overridden)
        return 0;
    }

}
