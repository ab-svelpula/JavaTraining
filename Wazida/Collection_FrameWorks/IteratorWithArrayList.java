package CollectionTypes;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println("Given Numbers are "+al);
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			int num = (int) i.next();
			if(num>5) {
				i.remove();
			}
		}
		System.out.println("Updated list after removing number greater than 5 "+al);
	}

}
