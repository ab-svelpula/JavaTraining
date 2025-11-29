package CollectionTypes;

import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

public class LinkedHashMapforMaintainingOrder {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("IN","India");
		lhm.put("UK","United Kingdom");
		lhm.put("UAE","United Arab Emirated");
		lhm.put("US","United States");
		lhm.put("AU","Australia");
		
		for(Map.Entry<String, String> en : lhm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
	}

}
