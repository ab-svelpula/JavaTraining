package inheritance_encapsulation;

public class AccidentClaim extends Claim{
	private boolean policeReportAvailable;

    public AccidentClaim(String claimantName, double claimAmount, boolean policeReportAvailable) {
        super(claimantName, claimAmount);
        this.policeReportAvailable = policeReportAvailable;
    }

    @Override
    public boolean approveClaim() {
        // Approve only if police report is available and amount < ₹100,000
        return policeReportAvailable && claimAmount <= 100000;
    }

}
