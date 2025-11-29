package collectionFrameWork;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorOfIntegers {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		Enumeration e = v.elements();
		System.out.println("Given elements are");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  index you want to remove");
		int remove = s.nextInt();
		v.remove(remove);
		System.out.println("Updated elements in vector are");
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		v.addElement(6);
		Enumeration e2 = v.elements();
		System.out.println("Updated elements are adding another element");
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}
		
	}

}
