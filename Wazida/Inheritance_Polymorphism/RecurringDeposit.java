package inheritance_encapsulation;

public class RecurringDeposit extends Account{
	private double monthlyDeposit;
    private int months;
    private double rate = 5.5; // Annual interest rate in %

    public RecurringDeposit(double monthlyDeposit, int months) {
        super(0); // Initial balance is 0
        this.monthlyDeposit = monthlyDeposit;
        this.months = months;
        this.balance = monthlyDeposit * months;
    }

    @Override
    public double calculateInterest() {
        // Interest formula for RD: (P * N * (N + 1) * R) / (2 * 12 * 100)
        return (monthlyDeposit * months * (months + 1) * rate) / (2 * 12 * 100);
    }

}
