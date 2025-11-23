package interfaces_abstract_classes;

public abstract class InsurancePolicy {
	String PolicyNumber;
	String HolderName;
	double amount;
	
	public void deposit(double balance)
	{
		amount = amount+balance;
	}
	
	public abstract void CalculatePremium(); 

}
