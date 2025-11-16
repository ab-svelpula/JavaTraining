package inheritance_encapsulation;

public class StockInvestment extends Investment {
    private double growthRate = 0.12; // 12% expected growth
    private double riskFactor = 0.85; // 85% reliability

    public StockInvestment(String investorName, double amount) {
        super(investorName, amount);
    }

    @Override
    public double calculateReturns() {
        // Return adjusted for risk
        return amount * growthRate * riskFactor;
    }

}
