package interfaces_abstract_classes;

public class InsurancePolicyMain {
	public static void main(String[] args)
	{
		
		LifeInsurance li = new LifeInsurance();
		li.deposit(1000);
		li.CalculatePremium();
		
		HealthInsurance  hi = new HealthInsurance();
		hi.deposit(2000);
		hi.CalculatePremium();
		
		VehicleInsurance vi = new VehicleInsurance();
		vi.deposit(3000);
		vi.CalculatePremium();
	}

}
