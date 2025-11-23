package interfaces_abstract_classes;

public class Life implements ClaimService{
	
	double claim = 1000000;

	@Override
	public void registerClaim() {
		// TODO Auto-generated method stub
		System.out.println("Your details are registered and claim is "+claim);
		
	}

	@Override
	public void verifyClaim() {
		// TODO Auto-generated method stub
		if(claim>=50000 && claim<=1000000)
			System.out.println("Verifying the claim");
		else
			System.out.println("your claim doesn't meet requirements");
		
	}

	@Override
	public void settleClaim() {
		// TODO Auto-generated method stub
		if(claim<=1000000)
			claim = claim - 10000; // debiting the charges;
			System.out.println("Approved claim is "+claim);
		
	}

}
