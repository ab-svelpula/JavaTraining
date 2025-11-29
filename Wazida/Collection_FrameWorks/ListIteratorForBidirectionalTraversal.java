package CollectionTypes;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorForBidirectionalTraversal {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("wazida");
		l.add("Javid");
		l.add("Aravind");
		l.add("Sajid");
		l.add("Priya");
		l.add("Arun");
		
		ListIterator ll = l.listIterator();
		System.out.println("Given names are in forward traversal");
		while(ll.hasNext())
			System.out.println(ll.next());
		System.out.println("\nGiven names are in backward traversal");
		while(ll.hasPrevious())
			System.out.println(ll.previous());
	}

}
