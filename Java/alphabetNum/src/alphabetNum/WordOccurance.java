package alphabetNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordOccurance {
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String[] words = str.split(" ");
		
		int c=0;
		
		List<Integer> list = new ArrayList<>();
		
		for(String w:words)
		{
			list.add(c,0);
//			System.out.println("main for loop runned");
			for(String s:words)
			{
				if(w.equals(s))
				{
//					System.out.println("matched");
					int count = 0;
					count = list.get(c) + 1;
					list.set(c,count);
				}
			}
			c++;
		}
		
		System.out.println("Count ");
		int i = 0;
		for(int l: list)
		{
			System.out.println(words[i] +" occurs "+l+ " times.");
			i++;
		}
	}
	
}
