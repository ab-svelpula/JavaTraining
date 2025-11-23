package interfaces_abstract_classes;

public class LifeInsurance extends InsurancePolicy {

	@Override
	public void CalculatePremium() {
		// TODO Auto-generated method stub
		System.out.println("Amount for the life insurance "+amount);
		System.out.println("Life Insurance for the account holder is "+(amount*1.9));
	}
	

}
