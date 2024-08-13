package alphabetNum;

import java.util.List;
import java.util.Scanner;

public class WordCount {
	
	public static void main(String[] args)
	{
		System.out.println("Enter a string: ");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		String[] words = str.split("\\W");
		int count =0;
		for(String s : words)
		{
//			System.out.println(s);
			count ++;
		}
		System.out.println(count);
		
		
	}
}
