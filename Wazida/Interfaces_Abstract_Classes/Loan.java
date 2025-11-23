package interfaces_abstract_classes;

public abstract class Loan {
	String LoanId;
	String customerName;
	double amount;
	
	public void addAmount(double p, double t, double r)
	{
		t = t*12;
		amount = (p * r * Math.pow(1 + r, t)) /
    (Math.pow(1 + r, t) - 1);
	}
	public abstract void calculateEMI();

}
