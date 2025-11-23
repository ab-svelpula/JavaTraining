package interfaces_abstract_classes;

import java.util.Scanner;

public class MutualFunds implements Investment {
	double total;

	@Override
	public void invest(double amount) {
		// TODO Auto-generated method stub
		total = amount *2;
		System.out.println("Amount invested "+amount);
		
		
	}

	@Override
	public void calculateReturns() {
		// TODO Auto-generated method stub
		
		System.out.println("Returns for the amount invested "+total);
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
		double withdrawAmount = s.nextDouble();
		total = total - withdrawAmount;
		System.out.println("Available investment amount after withdraw "+total);
		
	}

}
