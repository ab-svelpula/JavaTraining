package InhertitanceInsurance;

public class VehicleInsurance {
	
	void calculatePremium (){
		//calculatePremium
		int Premium;
		int SI = 500000;  // Sum Insured
		int RF = 10 ; // Risk Factor
		int CP = 2;
			
		Premium = (RF * SI) / CP;
		System.out.println(Premium);

}
}