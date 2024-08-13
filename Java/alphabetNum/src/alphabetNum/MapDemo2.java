package alphabetNum;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, Integer> products = new HashMap<>();
		
		products.put("TV", 15999);
		products.put("Phone", 9999);
		
//		products.remove("TV");
		
		for(Entry<String, Integer> e: products.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
