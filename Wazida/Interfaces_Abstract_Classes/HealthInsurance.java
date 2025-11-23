package interfaces_abstract_classes;

public class HealthInsurance extends InsurancePolicy {

	@Override
	public void CalculatePremium() {
		// TODO Auto-generated method stub
		System.out.println("Amount for the health insurance "+amount);
		System.out.println("Health insurance is "+(amount*1.2));
		
	}
	

}
