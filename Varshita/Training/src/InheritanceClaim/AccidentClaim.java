package InheritanceClaim;

public class AccidentClaim extends TheftClaim {
	
	void claimrules()
	{
		int ClaimAmount = 500000 ;
		if (ClaimAmount < 200000)
		{
			System.out.println("Approve Claim");
						
		}
		else {
			System.out.println("Reject Claim");
		}

	}
}
