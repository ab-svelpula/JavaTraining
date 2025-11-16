package inheritance_encapsulation;

public class Investment {
	protected String investorName;
    protected double amount;

    public Investment(String investorName, double amount) {
        this.investorName = investorName;
        this.amount = amount;
    }

    public double calculateReturns() {
        // Default return logic (can be overridden)
        return amount * 0.05; // 5% default return
    }

    public void showInvestmentDetails() {
        System.out.println("Investor: " + investorName);
        System.out.println("Invested Amount: ₹" + amount);
        System.out.printf("Estimated Returns: ₹%.2f%n", calculateReturns());
    }

}
