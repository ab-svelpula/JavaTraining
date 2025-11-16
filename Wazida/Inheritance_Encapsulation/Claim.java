package inheritance_encapsulation;

public class Claim {
	protected String claimantName;
    protected double claimAmount;

    public Claim(String claimantName, double claimAmount) {
        this.claimantName = claimantName;
        this.claimAmount = claimAmount;
    }

    public boolean approveClaim() {
        // Default approval rule: approve if amount < ₹50,000
        return claimAmount < 50000;
    }

    public void showClaimStatus() {
        System.out.println("Claimant: " + claimantName);
        System.out.println("Claim Amount: ₹" + claimAmount);
        System.out.println("Claim Approved: " + approveClaim());
    }
}
