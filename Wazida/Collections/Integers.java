package collectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Integers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList();
		System.out.println("Enter the numbers");
		for(int i=0;i<10;i++)
		{
			int integer = s.nextInt();
			al.add(integer);
		}
		System.out.println("Entered numbers are ");
		System.out.println(al);
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum =sum + al.get(i);
		}
		System.out.println(sum);
		System.out.println(sum/al.size());
	}

}
