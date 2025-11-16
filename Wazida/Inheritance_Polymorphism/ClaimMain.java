package inheritance_encapsulation;

public class ClaimMain {
	public static void main(String[] args) {
        AccidentClaim ac = new AccidentClaim("Wazida", 90000, true);
        ac.showClaimStatus();

        TheftClaim tc = new TheftClaim("Javid", 80000, 25);
        tc.showClaimStatus();

        TheftClaim tcLate = new TheftClaim("Aravind", 70000, 45);
        tcLate.showClaimStatus();
    }

}
