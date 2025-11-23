package interfaces_abstract_classes;

public class VehicleInsurance extends InsurancePolicy{

	@Override
	public void CalculatePremium() {
		// TODO Auto-generated method stub
		System.out.println("Amount for the vehicle insurance "+amount);
		System.out.println("Vehicle insurance is "+(amount*2.5));
		
	}
	

}
