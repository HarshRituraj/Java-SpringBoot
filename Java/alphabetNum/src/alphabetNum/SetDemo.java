package alphabetNum;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		names.add("Rituraj");
		names.add("Harsh");
		names.add("Rituraj");
		
		for(String n:names)
		{
			System.out.println(n);
		}
		
	}

}
