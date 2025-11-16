package inheritance_encapsulation;

public class Loan {
	protected double principal;
    protected int tenureMonths;

    public Loan(double principal, int tenureMonths) {
        this.principal = principal;
        this.tenureMonths = tenureMonths;
    }

    public double calculateEMI(double annualRate) {
        double monthlyRate = annualRate / (12 * 100);
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
               (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }

}
