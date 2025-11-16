package inheritance_encapsulation;

public class CarLoan extends Loan {
	private final double carLoanRate = 9.5; // 9.5% annual interest

    public CarLoan(double principal, int tenureMonths) {
        super(principal, tenureMonths);
    }

    public double calculateEMI(double ignoredRate) {
        return super.calculateEMI(carLoanRate);
    }

}
