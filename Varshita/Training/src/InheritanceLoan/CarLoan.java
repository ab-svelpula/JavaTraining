package InheritanceLoan;

public class CarLoan {
	void calculateEMI() {
		double ROI = 14; // Rate of Interest
		double Prin = 300000;
		double N = 12; // N is Loan Tenure in months
		double MIR = ROI /12;
				
		double TotalEMI = (Prin * MIR * Math.pow(1 + MIR, N)) / 
                (Math.pow(1 + MIR, N) - 1);
		double monthlyEMI = TotalEMI /12;			
		System.out.println(monthlyEMI);
			
	}
}
