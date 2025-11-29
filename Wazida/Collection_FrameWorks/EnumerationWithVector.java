package CollectionTypes;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationWithVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Hyderabad");
		v.addElement("Guntur");
		v.addElement("Vijayawada");
		v.addElement("Bengaluru");
		
		Enumeration e = v.elements();
		System.out.println("Given City names are");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		v.remove("Hyderabad");
		Enumeration e1 = v.elements();
		System.out.println("\nGiven City names are after removing");
		while(e1.hasMoreElements())
			System.out.println(e1.nextElement());
		
	}

}
