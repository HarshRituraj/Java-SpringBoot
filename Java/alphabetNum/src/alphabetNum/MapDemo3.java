package alphabetNum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new TreeMap<>();
		
		myMap.put("Rituraj", 27);
		myMap.put("Harshit", 42);
		myMap.put("Alex", 50);
		
		for(Entry<String, Integer> m: myMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
