package collectionFrameWork;

import java.util.TreeSet;

public class TreeSetOfIntegers {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(1);
		t.add(3);
		t.add(1);
		t.add(5);
		t.add(90);
		t.add(2);
		t.add(7);
		t.add(2);
		t.add(9);
		t.add(8);
		System.out.println("Given numbers are\n"+t);
		System.out.println("Smalles Number is " +t.first());
		System.out.println("Largest NUmber is "+t.last());
		
	}

}
