package inheritance_encapsulation;

public class FixedDeposit extends Account{
	private double rate = 6.5; // Annual interest rate in %

    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        // Simple interest for 1 year
        return (balance * rate * 1) / 100;
    }

}
