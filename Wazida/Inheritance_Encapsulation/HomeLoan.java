package inheritance_encapsulation;

public class HomeLoan extends Loan{
	private final double homeLoanRate = 7.0; // 7% annual interest

    public HomeLoan(double principal, int tenureMonths) {
        super(principal, tenureMonths);
    }

    public double calculateEMI(double ignoredRate) {
        return super.calculateEMI(homeLoanRate);
    }
	
	

}
