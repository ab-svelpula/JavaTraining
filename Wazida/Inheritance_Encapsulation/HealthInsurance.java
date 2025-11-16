package inheritance_encapsulation;

public class HealthInsurance extends InsurancePolicy {
	private int age;

    public HealthInsurance(String policyHolder, double coverageAmount, int age) {
        super(policyHolder, coverageAmount);
        this.age = age;
    }

    @Override
    public double calculatePremium() {
        double baseRate = 0.04; // 4%
        if (age > 50) {
            baseRate += 0.02; // add 2% for higher age
        }
        return coverageAmount * baseRate;
    }

}
