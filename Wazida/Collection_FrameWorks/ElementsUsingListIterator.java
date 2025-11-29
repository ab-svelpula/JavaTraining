package CollectionTypes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ElementsUsingListIterator {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		
		System.out.println("Given Numbers are\n"+l);
		ListIterator<Integer> i = l.listIterator();
		while(i.hasNext())
		{
			int num = i.next();
			i.set(num*2);
		}
		System.out.println("Updated number after multiplying\n"+l);
	}

}
