package constructors_scanner_classes;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age =s.nextInt();
		if(age>=18)
			System.out.println("You are eligible to vote");
		else
			System.out.println("You are not eligible to vote");
		
	}

}
