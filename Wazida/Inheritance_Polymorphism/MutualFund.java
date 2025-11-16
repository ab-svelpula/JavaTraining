package inheritance_encapsulation;

public class MutualFund extends Investment {
    private double annualRate = 0.08; // 8% annual return

    public MutualFund(String investorName, double amount) {
        super(investorName, amount);
    }

    @Override
    public double calculateReturns() {
        // Simple annual return
        return amount * annualRate;
    }

}
