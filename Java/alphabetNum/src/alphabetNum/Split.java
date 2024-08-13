package alphabetNum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Split {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scn.nextLine();

		
		String words[] = str.split("[\\s]+");
		Arrays.stream(words).distinct().collect(Collectors.toList()).forEach(e->System.out.println(e));
	

	}

}
