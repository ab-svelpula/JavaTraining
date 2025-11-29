package CollectionTypes;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMapEntries {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Iphone");
		hm.put(2, "Samsung");
		hm.put(3, "Laptop");
		hm.put(4, "AC");
		
		for(Map.Entry<Integer, String> en : hm.entrySet())
		{
			System.out.println(en.getKey()+"---->"+en.getValue());
		}
		
	}

}
