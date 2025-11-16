package inheritance_encapsulation;

public class InsurancePolicy {
	protected String policyHolder;
    protected double coverageAmount;

    public InsurancePolicy(String policyHolder, double coverageAmount) {
        this.policyHolder = policyHolder;
        this.coverageAmount = coverageAmount;
    }

    public double calculatePremium() {
        // Default premium logic (can be overridden)
        return coverageAmount * 0.05; // 5% base rate
    }

    public void showPolicyDetails() {
        System.out.println("Policy Holder: " + policyHolder);
        System.out.println("Coverage Amount: ₹" + coverageAmount);
        System.out.printf("Premium: ₹%.2f%n", calculatePremium());
    }
}
