package InheritanceClaim;

public class TheftClaim {
	
	void claimrules()
	{
		int ClaimAmount = 50000 ;
		if (ClaimAmount < 100000)
		{
			System.out.println("Approve Claim");
						
		}
		else {
			System.out.println("Reject Claim");
		}

	}
	

}
