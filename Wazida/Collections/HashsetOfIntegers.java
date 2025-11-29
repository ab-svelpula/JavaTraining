package collectionFrameWork;

import java.util.HashSet;

public class HashsetOfIntegers {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		System.out.println("Size of hashset before adding elements "+h.size());
		h.add(1);
		h.add(90);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(90);
		h.add(4);
		h.add(7);
		h.add(1);
		System.out.println("Size of hashset after adding elements "+h.size());
		System.out.println("Given numbers are\n"+h);
	}

}
