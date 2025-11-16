package inheritance_encapsulation;

public class CalculateEMIMain {
	public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan(1000000, 240); // 20 years
        CarLoan carLoan = new CarLoan(500000, 60);      // 5 years

        System.out.printf("Home Loan EMI: ₹%.2f%n", homeLoan.calculateEMI(0));
        System.out.printf("Car Loan EMI: ₹%.2f%n", carLoan.calculateEMI(0));
    }

}
