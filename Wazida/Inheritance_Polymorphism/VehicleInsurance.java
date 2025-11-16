package inheritance_encapsulation;

public class VehicleInsurance extends InsurancePolicy{
	private String vehicleType;

    public VehicleInsurance(String policyHolder, double coverageAmount, String vehicleType) {
        super(policyHolder, coverageAmount);
        this.vehicleType = vehicleType;
    }

    @Override
    public double calculatePremium() {
        double baseRate = 0.03; // 3%
        if (vehicleType.equalsIgnoreCase("car")) {
            baseRate += 0.01; // add 1% for cars
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            baseRate += 0.015; // add 1.5% for bikes
        }
        return coverageAmount * baseRate;
    }

}
