package alphabetNum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		/* List of integer type
		List<Integer> myList = new ArrayList<>();
		
		myList.add(5);
		myList.add(10);
		myList.add(15);
		myList.remove(1);
		System.out.println("Element at index 0 "+myList.get(0));
		System.out.println(myList.isEmpty());
		
		for(int i = 0; i<myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
		for(int i:myList)
		{
			System.out.println(i);
		}
 */
		
		/*List of String type*/
		List<String> names = new ArrayList<>();
		names.add("Rituraj");
		names.add("Harsh");
//		names.remove(0);
		System.out.println(names.contains("Rituraj"));
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
//		for(String n : names)
//		{
//			System.out.println(n);
//		}
		

	}

}
