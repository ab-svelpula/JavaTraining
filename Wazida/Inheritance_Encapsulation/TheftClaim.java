package inheritance_encapsulation;

public class TheftClaim extends Claim {
    private int daysSinceIncident;

    public TheftClaim(String claimantName, double claimAmount, int daysSinceIncident) {
        super(claimantName, claimAmount);
        this.daysSinceIncident = daysSinceIncident;
    }

    @Override
    public boolean approveClaim() {
        // Approve only if claim is filed within 30 days and amount < ₹75,000
        return daysSinceIncident <= 30 && claimAmount <= 75000;
    }

}
