package InheritanceClaim;

public class approveClaim extends AccidentClaim{
	
	public static void main (String [] args) {
		AccidentClaim obj = new AccidentClaim();
		obj.claimrules();
		TheftClaim obj1 = new TheftClaim();
		obj1.claimrules();
	}

}
