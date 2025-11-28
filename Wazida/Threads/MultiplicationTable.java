package threads;

import java.util.Scanner;

public class MultiplicationTable extends Thread{
	public void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = s.nextInt();
		for(int i = 1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}

}
