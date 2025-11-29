package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfIntegers {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(25);
		al.add(3);
		al.add(7);
		al.add(90);
		al.add(77);
		System.out.println("Given numbers are\n"+al);
		
		Collections.sort(al);
		System.out.println("Given numbers after sorting\n"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Given numbers after reverse ordering\n"+al);
		
		
	}

}
