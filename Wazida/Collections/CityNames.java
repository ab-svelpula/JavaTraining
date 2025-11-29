package collectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class CityNames {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the city names");
		for(int i=1;i<=6;i++)
		{
			String name = s.next();
			al.add(name);
		}
		System.out.println("Entered Names are ");
		System.out.println(al);
		System.out.println("Enter the name you want to find");
		String finding = s.next();
		if(al.contains(finding))
			System.out.println("City Found");
		else
			System.out.println("City Not Found");	
		
	}

}
