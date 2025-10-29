package InheritanceLoan;

public class Loan extends HomeLoan {
	
	void calculateEMI() {
		double ROI = 12; // Rate of Interest
		double Prin = 100000;
		double N = 24; // N is Loan Tenure in months
		double MIR = ROI /12;
				
		double TotalEMI = (Prin * MIR * Math.pow(1 + MIR, N)) / 
                (Math.pow(1 + MIR, N) - 1);
		double monthlyEMI = TotalEMI /12;			
		System.out.println(monthlyEMI);
			
	}

}
