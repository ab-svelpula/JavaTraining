package interfaces_abstract_classes;

public class ClaimServiceMain {
	public static void main(String[] args)
	{
		Life l = new Life();
		l.registerClaim();
		l.verifyClaim();
		l.settleClaim();
		System.out.println("********************************");
		Health h = new Health();
		h.registerClaim();
		h.verifyClaim();
		h.settleClaim();
		System.out.println("********************************");
		Vehicle v = new Vehicle();
		v.registerClaim();
		v.verifyClaim();
		v.settleClaim();
		
	}

}
