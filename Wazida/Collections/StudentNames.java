package collectionFrameWork;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> al = new ArrayList();
		System.out.println("Enter the names");
		for(int i=0;i<5;i++)
		{
			String name = s.next();
			al.add(name);
		}
		
		System.out.println("Entered names are ");
		System.out.println(al);
		System.out.println("Enter the name to remove");
		String removeName = s.next();
		al.remove(removeName);
		System.out.println("Updated list is ");
		System.out.println(al);
	}

}
