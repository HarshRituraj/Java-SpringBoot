package alphabetNum;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		Map<String, Double> myMap = new TreeMap<>();
		myMap.put("phone",9999.99);
		myMap.put("bulb",233.8 );
		myMap.put("laptop", 387432.3);
		
		
		if(myMap.containsKey("bulb"))
		{
			System.out.println(myMap.get("bulb"));
		}
		else
		{
			System.out.println("Key not found");
		}
		
//		for(Entry<String, Double> e:myMap.entrySet())
//		{
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
		
//		for(String k:myMap.keySet())
//		{
//			System.out.println(k +" "+myMap.get(k));
//		}
	}

}
