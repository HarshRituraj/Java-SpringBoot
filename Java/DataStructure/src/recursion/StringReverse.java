package recursion;

import java.util.Scanner;

public class StringReverse {
	
	
	public static void strReverse(String str)
	{
		if(str.length() == 0)
		{
			
		}
		else
		{
			System.out.printf("%s",str.charAt(str.length()-1));
			strReverse(str.substring(0,str.length()-1));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = scn.nextLine();
		
		strReverse(str);
		scn.close();
	}

}

